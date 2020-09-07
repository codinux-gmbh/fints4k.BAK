import SwiftUI
import BankingUiSwift
import Combine


struct AddAccountDialog: View {
    
    @State private var bank: BankInfo? = nil
    
    @State private var customerId = ""
    @State private var password = ""

    
    @State private var isTryingToAddAccount = false
    
    @State private var errorMessage: Message? = nil
    
    
    @Inject private var presenter: BankingPresenterSwift
    
    
    var body: some View {
        Form {
            Section(header: Text("Bank")) {
                NavigationLink(destination: SelectBankDialog($bank)) {
                    if bank != nil {
                        bank.map { bank in
                            Text(bank.name)
                                .font(.headline)
                        }
                    }
                    else {
                        Text("Select your bank ...")
                            .detailForegroundColor()
                    }
                }
                .frame(height: 30)
            }
            
            Section(header: Text("Online banking login data")) {
                LabelledUIKitTextField(label: "Online banking login name", text: $customerId, placeholder: "Enter Online banking login name",
                                       autocapitalizationType: .none, focusNextTextFieldOnReturnKeyPress: true, actionOnReturnKeyPress: handleReturnKeyPress)
                
                LabelledUIKitTextField(label: "Online banking login password", text: $password, placeholder: "Enter Online banking login password",
                                       autocapitalizationType: .none, isPasswordField: true, actionOnReturnKeyPress: handleReturnKeyPress)
            }
            
            Section {
                HStack {
                    Spacer()
                    
                    Button("Add") { self.addAccount() }
                        .disabled( !self.isRequiredDataEntered() || isTryingToAddAccount)
                    
                    Spacer()
                }
                .overlay(UIKitActivityIndicator($isTryingToAddAccount), alignment: .leading)
            }
            
        }
        .alert(message: $errorMessage)
        .fixKeyboardCoversLowerPart()
        .showNavigationBarTitle("Add account")
    }
    

    func handleReturnKeyPress() -> Bool {
        if self.isRequiredDataEntered() && isTryingToAddAccount == false {
            self.addAccount()
            
            return true
        }
        
        return false
    }

    func isRequiredDataEntered() -> Bool {
        return bank != nil
            && customerId.isNotBlank
            && password.isNotBlank
    }
    
    func addAccount() {
        if let bank = bank {
            isTryingToAddAccount = true
            UIApplication.hideKeyboard()
            
            presenter.addAccountAsync(bankInfo: bank, customerId: customerId, pin: password) { (response) in
                self.handleAddAccountResponse(response)
            }
        }
    }
    
    func handleAddAccountResponse(_ response: AddAccountResponse) {
        isTryingToAddAccount = false
        
        if (response.isSuccessful) {
            DispatchQueue.main.async { // dispatch async as may EnterTanDialog is still displayed so dismiss() won't dismiss this view
                self.closeDialog()

                let authenticationService = AuthenticationService()
                if self.presenter.customers.count == 1 && authenticationService.authenticationType == .unset {
                    authenticationService.setAuthenticationType(.none)
                    
                    UIAlert("Secure data?", "Secure data with?",
                            UIAlertAction.ok { SceneDelegate.navigateToView(ProtectAppSettingsDialog()) },
                            UIAlertAction.cancel(self.closeDialog))
                    .show()
                }
            }
        }
        else {
            self.errorMessage = Message(title: Text("Could not add account"), message: Text("Error message from your bank \(response.errorToShowToUser ?? "")"))
        }
    }
    
    private func closeDialog() {
        SceneDelegate.dismissCurrentView()
    }
}


struct AddAccountDialog_Previews: PreviewProvider {
    static var previews: some View {
        AddAccountDialog()
    }
}