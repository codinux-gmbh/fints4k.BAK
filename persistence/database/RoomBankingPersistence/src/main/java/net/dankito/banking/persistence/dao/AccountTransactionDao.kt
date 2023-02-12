package net.dankito.banking.persistence.dao

import androidx.room.Dao
import androidx.room.Query
import net.dankito.banking.persistence.model.AccountTransaction
import net.dankito.banking.persistence.model.AccountTransactionInfoEntity
import net.dankito.banking.persistence.model.TransactionParty


@Dao
interface AccountTransactionDao : BaseDao<AccountTransaction> {

    @Query("SELECT * FROM AccountTransaction")
    fun getAll(): List<AccountTransaction>

    @Query("SELECT * FROM AccountTransaction ORDER BY valueDate DESC")
    fun getAllTransactionInfo(): List<AccountTransactionInfoEntity>

    @Query("SELECT * FROM AccountTransaction WHERE accountId IN (:accountIds) ORDER BY valueDate DESC")
    fun getAllTransactionInfo(accountIds: Set<Long>): List<AccountTransactionInfoEntity>

    @Query("SELECT * FROM AccountTransaction WHERE (accountId IN (:accountIds) " +
            "AND (otherPartyName LIKE '%' || :query || '%' OR unparsedReference LIKE '%' || :query || '%' or bookingText LIKE '%' || :query || '%')) " +
            "ORDER BY valueDate DESC")
    fun findTransactionInfo(query: String, accountIds: Set<Long>): List<AccountTransactionInfoEntity>

    @Query("SELECT otherPartyName, otherPartyBankCode, otherPartyAccountId FROM AccountTransaction WHERE otherPartyName LIKE '%' || :query || '%'")
    fun findTransactionParty(query: String): List<TransactionParty>

}