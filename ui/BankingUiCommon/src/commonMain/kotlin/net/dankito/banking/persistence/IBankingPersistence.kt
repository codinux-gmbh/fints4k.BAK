package net.dankito.banking.persistence

import net.dankito.banking.ui.model.*
import net.dankito.banking.ui.model.settings.AppSettings


interface IBankingPersistence {

    fun decryptData(password: CharArray): Boolean

    fun changePassword(newPassword: CharArray): Boolean


    fun saveOrUpdateBank(bank: TypedBankData, allBanks: List<TypedBankData>)

    fun deleteBank(bank: TypedBankData, allBanks: List<TypedBankData>)

    fun readPersistedBanks(): List<TypedBankData>


    fun saveOrUpdateAccountTransactions(account: TypedBankAccount, transactions: List<IAccountTransaction>)

    fun getAllTransactions(): List<IAccountTransaction>

    fun findAccountTransactionInfo(query: String, selectedAccountType: SelectedAccountType, accounts: List<TypedBankAccount>): List<AccountTransactionInfo>


    fun saveOrUpdateAppSettings(appSettings: AppSettings)

    fun readPersistedAppSettings(): AppSettings?


    fun saveBankIcon(bank: TypedBankData, iconUrl: String, fileExtension: String?)


    fun addInitializedListener(listener: () -> Unit)

}