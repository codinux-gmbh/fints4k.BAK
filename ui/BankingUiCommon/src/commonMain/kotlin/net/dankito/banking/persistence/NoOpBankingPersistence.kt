package net.dankito.banking.persistence

import net.dankito.banking.ui.model.*
import net.dankito.banking.ui.model.settings.AppSettings


open class NoOpBankingPersistence : IBankingPersistence {

    override fun decryptData(password: CharArray): Boolean {
        return true
    }

    override fun changePassword(newPassword: CharArray): Boolean {
        return true
    }


    override fun saveOrUpdateBank(bank: TypedBankData, allBanks: List<TypedBankData>) {

    }

    override fun deleteBank(bank: TypedBankData, allBanks: List<TypedBankData>) {

    }

    override fun readPersistedBanks(): List<TypedBankData> {
        return listOf()
    }


    override fun saveOrUpdateAccountTransactions(account: TypedBankAccount, transactions: List<IAccountTransaction>) {

    }

    override fun getAllTransactions(): List<IAccountTransaction> = emptyList()

    override fun findAccountTransactionInfo(query: String, selectedAccountType: SelectedAccountType, accounts: List<TypedBankAccount>): List<AccountTransactionInfo> {
        return listOf()
    }


    override fun saveOrUpdateAppSettings(appSettings: AppSettings) {

    }

    override fun readPersistedAppSettings(): AppSettings? {
        return null
    }


    override fun saveBankIcon(bank: TypedBankData, iconUrl: String, fileExtension: String?) {

    }


    override fun addInitializedListener(listener: () -> Unit) {
        listener()
    }

}