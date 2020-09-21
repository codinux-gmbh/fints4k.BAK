import Foundation
import CoreData
import UIKit
import BankingUiSwift


class CoreDataBankingPersistence: IBankingPersistence, IRemitteeSearcher {
    
    private let mapper = Mapper()
    
    private let context: NSManagedObjectContext
    
    
    init(context: NSManagedObjectContext) {
        self.context = context
        
        // to fix merging / updating cached objects, see Mapper
        context.mergePolicy = NSMergePolicy(merge: NSMergePolicyType.mergeByPropertyObjectTrumpMergePolicyType)
    }
    
    
    func saveOrUpdateAccount(customer: ICustomer, allCustomers: [ICustomer]) {
        do {
            let mapped = mapper.map(customer, context)
            
            if customer.technicalId.isCoreDataId == false { // an unpersisted bank (but check should not be necessary)
                context.insert(mapped)
            }
            
            try context.save()
            
            setIds(customer, mapped)
        } catch {
            NSLog("Could not save Customer \(customer): \(error)")
        }
    }
    
    private func setIds(_ customer: ICustomer, _ mappedCustomer: PersistedCustomer) {
        customer.technicalId = mappedCustomer.objectIDAsString
        
        for account in customer.accounts {
            if let mappedAccount = mappedCustomer.accounts?.first { ($0 as! PersistedBankAccount).identifier == account.identifier} as? PersistedBankAccount {
                account.technicalId = mappedAccount.objectIDAsString
            }
        }
        
        for tanMethod in customer.supportedTanMethods {
            if let mappedTanMethod = mappedCustomer.supportedTanMethods?.first { ($0 as! PersistedTanMethod).bankInternalMethodCode == tanMethod.bankInternalMethodCode } as? PersistedTanMethod {
                tanMethod.technicalId = mappedTanMethod.objectIDAsString
            }
        }
        
        for tanMedium in customer.tanMedia {
            if let mappedTanMedium = mappedCustomer.tanMedia?.first { ($0 as! PersistedTanMedium).displayName == tanMedium.displayName } as? PersistedTanMedium {
                tanMedium.technicalId = mappedTanMedium.objectIDAsString
            }
        }
    }
    
    
    func readPersistedAccounts_() -> [ICustomer] {
        var customers: [PersistedCustomer] = []
        
        do {
            let request: NSFetchRequest<PersistedCustomer> = PersistedCustomer.fetchRequest()
            request.returnsObjectsAsFaults = false
            
            try customers = context.fetch(request)
        } catch {
            NSLog("Could not request Customers: \(error)")
        }
        
        return customers.map( { mapper.map($0) } )
    }
    
    func deleteAccount(customer: ICustomer, allCustomers: [ICustomer]) {
        do {
            let mapped = mapper.map(customer, context)
            
            context.delete(mapped)
            
            try context.save()
        } catch {
            NSLog("Could not delete Customer \(customer): \(error)")
        }
    }
    
    func saveOrUpdateAccountTransactions(bankAccount: IBankAccount, transactions: [IAccountTransaction]) {
        if let persistedAccount = context.objectByID(bankAccount.technicalId) as? PersistedBankAccount {
            for transaction in transactions {
                if transaction.technicalId.isCoreDataId == false { // TODO: or also update already persisted transactions?
                    do {
                        let mappedTransaction = mapper.map(persistedAccount, transaction, context)
                        
                        try context.save()
                        
                        transaction.technicalId = mappedTransaction.objectIDAsString
                    } catch {
                        NSLog("Could not save transaction \(transaction.buildTransactionIdentifier()) of account \(bankAccount.displayName): \(error)")
                    }
                }
            }
        }
    }
    
    
    func saveUrlToFile(url: String, file: URL) {
        if let remoteUrl = URL.encoded(url) {
            if let fileData = try? Data(contentsOf: remoteUrl) {
                do {
                    try UIImage(data: fileData)?.pngData()?.write(to: file)
                } catch {
                    NSLog("Could not save url '\(url)' to file '\(file): \(error)")
                }
                
                // not indented for this kind of data but at least it works
                UserDefaults.standard.set(fileData, forKey: file.absoluteString)
            }
        }
    }
    
    func readContentOfFile(_ filePath: String) -> Data? {
        return UserDefaults.standard.data(forKey: filePath)
    }
    
    func findRemittees(query: String) -> [Remittee] {
        var transactions: [PersistedAccountTransaction] = []
        
        do {
            let request: NSFetchRequest<PersistedAccountTransaction> = PersistedAccountTransaction.fetchRequest()
            request.returnsObjectsAsFaults = false
            
            request.predicate = NSPredicate(format: "otherPartyName CONTAINS[c] %@", query)
            
            request.propertiesToFetch = [ "otherPartyName", "otherPartyBankCode", "otherPartyAccountId" ]
            request.sortDescriptors = [ NSSortDescriptor(key: "otherPartyName", ascending: true) ]
            
            try transactions = context.fetch(request)
        } catch {
            NSLog("Could not request Customers: \(error)")
        }
        
        let remittees = transactions
            .filter { $0.otherPartyAccountId != nil } // if IBAN is not set we cannot make use of it
            .map( { Remittee(name: $0.otherPartyName ?? "", iban: $0.otherPartyAccountId, bic: $0.otherPartyBankCode, bankName: nil) } )
        
        let uniqueRemittees = Set<Remittee>(remittees)
        
        return Array(uniqueRemittees)
    }
    
    
    func deleteAll() {
        do {
            let request = NSFetchRequest<NSFetchRequestResult>(entityName: "PersistedCustomer")
            
            let deleteAll = NSBatchDeleteRequest(fetchRequest: request)
            
            try context.execute(deleteAll)
        } catch {
            NSLog("Could not delete all Customers: \(error)")
        }
    }
    
}
