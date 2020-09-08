package net.dankito.banking.fints

import net.dankito.banking.fints.callback.FinTsClientCallback
import net.dankito.banking.fints.messages.MessageBuilder
import net.dankito.banking.fints.model.*
import net.dankito.banking.fints.response.ResponseParser
import net.dankito.banking.fints.response.client.AddAccountResponse
import net.dankito.banking.fints.response.client.FinTsClientResponse
import net.dankito.banking.fints.response.client.GetTransactionsResponse
import net.dankito.banking.fints.transactions.IAccountTransactionsParser
import net.dankito.banking.fints.transactions.Mt940AccountTransactionsParser
import net.dankito.banking.fints.util.IBase64Service
import net.dankito.banking.fints.util.PureKotlinBase64Service
import net.dankito.banking.fints.webclient.IWebClient
import net.dankito.banking.fints.webclient.KtorWebClient


open class FinTsClientForCustomer(
    val bank: BankData,
    callback: FinTsClientCallback,
    webClient: IWebClient = KtorWebClient(),
    base64Service: IBase64Service = PureKotlinBase64Service(),
    messageBuilder: MessageBuilder = MessageBuilder(),
    responseParser: ResponseParser = ResponseParser(),
    mt940Parser: IAccountTransactionsParser = Mt940AccountTransactionsParser(),
    product: ProductData = ProductData("15E53C26816138699C7B6A3E8", "1.0.0") // TODO: get version dynamically){}
) {

    protected val client = FinTsClient(callback, webClient, base64Service, messageBuilder, responseParser, mt940Parser, product)


    open val messageLogWithoutSensitiveData: List<MessageLogEntry>
        get() = client.messageLogWithoutSensitiveData


    open fun addAccountAsync(callback: (AddAccountResponse) -> Unit) {
        client.addAccountAsync(bank, callback)
    }


    open fun getTransactionsAsync(parameter: GetTransactionsParameter, account: AccountData, callback: (GetTransactionsResponse) -> Unit) {
        client.getTransactionsAsync(parameter, bank, account, callback)
    }


    open fun doBankTransferAsync(bankTransferData: BankTransferData, account: AccountData, callback: (FinTsClientResponse) -> Unit) {
        client.doBankTransferAsync(bankTransferData, bank, account, callback)
    }

}