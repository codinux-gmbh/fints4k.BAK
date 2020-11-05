package net.dankito.banking.ui

import net.dankito.banking.ui.model.*
import net.dankito.banking.ui.model.parameters.GetTransactionsParameter
import net.dankito.banking.ui.model.parameters.TransferMoneyData
import net.dankito.banking.ui.model.responses.AddAccountResponse
import net.dankito.banking.ui.model.responses.BankingClientResponse
import net.dankito.banking.ui.model.responses.GetTransactionsResponse


interface IBankingClient {

    val messageLogWithoutSensitiveData: List<MessageLogEntry>


    fun addAccountAsync(callback: (AddAccountResponse) -> Unit)

    fun getTransactionsAsync(password: String, parameter: GetTransactionsParameter, callback: (GetTransactionsResponse) -> Unit)

    fun transferMoneyAsync(password: String, data: TransferMoneyData, callback: (BankingClientResponse) -> Unit)


    fun dataChanged(bank: TypedBankData)

    fun deletedBank(bank: TypedBankData, wasLastAccountWithThisCredentials: Boolean)

}