import SwiftUI
import BankingUiSwift


struct AccountTransactionListItem: View {
    
    private static var ValueDateFormat: DateFormatter = {
        let formatter = DateFormatter()
        
        formatter.dateStyle = .short
        
        return formatter
    }()
    
    
    private let transaction: AccountTransaction
    
    private let areMoreThanOneBanksTransactionsDisplayed: Bool
    
    
    @Inject private var presenter: BankingPresenterSwift
    
    
    init(_ transaction: AccountTransaction, _ areMoreThanOneBanksTransactionsDisplayed: Bool) {
        self.transaction = transaction
        
        self.areMoreThanOneBanksTransactionsDisplayed = areMoreThanOneBanksTransactionsDisplayed
    }
    
    
    var body: some View {
        HStack {
            VStack(alignment: .leading) {
                Text(getTransactionLabel(transaction))
                    .font(.headline)
                    .frame(height: 20)
                
                Text(transaction.usage)
                    .styleAsDetail()
                    .padding(.top, 4)
                    .frame(height: 46, alignment: .center)
            }

            Spacer()

            VStack(alignment: .trailing) {
                if areMoreThanOneBanksTransactionsDisplayed {
                    IconView(iconUrl: transaction.bankAccount.customer.iconUrl, defaultIconName: Styles.AccountFallbackIcon)
                    
                    Spacer()
                }
                
                AmountLabel(amount: transaction.amount)
                
                Spacer()
                
                Text(Self.ValueDateFormat.string(from: transaction.valueDate.date))
                    .styleAsDetail()
            }
        }
        .contextMenu {
            if transaction.canCreateMoneyTransferFrom {
                NavigationLink(destination: LazyView(TransferMoneyDialog(preselectedValues: TransferMoneyData.Companion().fromAccountTransactionWithoutAmountAndUsage(transaction: self.transaction)))) {
                    HStack {
                        Text("Transfer money to \(transaction.otherPartyName ?? "")")
                        
                        Image("BankTransfer")
                    }
                }
                
                NavigationLink(destination: LazyView(TransferMoneyDialog(preselectedValues: TransferMoneyData.Companion().fromAccountTransaction(transaction: self.transaction)))) {
                    HStack {
                        Text("New transfer with same data")
                        
                        Image("BankTransfer")
                    }
                }
            }
        }
    }


    private func getTransactionLabel(_ transaction: AccountTransaction) -> String {
        if transaction.bookingText?.localizedCaseInsensitiveCompare("Bargeldauszahlung") == ComparisonResult.orderedSame {
            return transaction.bookingText ?? ""
        }

        if transaction.showOtherPartyName {
            return transaction.otherPartyName ?? ""
        }

        return transaction.bookingText ?? ""
    }

}

struct AccountTransactionListItem_Previews: PreviewProvider {
    static var previews: some View {
        AccountTransactionListItem(AccountTransaction(bankAccount: previewBanks[0].accounts[0], otherPartyName: "Marieke Musterfrau", unparsedUsage: "Vielen Dank für Ihre Mühen", amount: CommonBigDecimal(double: 1234.56), valueDate: CommonDate(year: 2020, month: .march, day_: 27), bookingText: "SEPA Überweisung"), false)
    }
}