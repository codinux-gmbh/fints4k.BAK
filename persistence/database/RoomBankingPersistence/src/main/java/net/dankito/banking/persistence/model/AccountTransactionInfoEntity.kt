package net.dankito.banking.persistence.model

import androidx.room.DatabaseView
import net.dankito.utils.multiplatform.BigDecimal
import net.dankito.utils.multiplatform.Date


@DatabaseView("SELECT accountId, amount, currency, valueDate, sepaReference, unparsedReference, bookingText, otherPartyName, otherPartyAccountId, otherPartyBankCode FROM AccountTransaction")
class AccountTransactionInfoEntity(
    val accountId: Long,
    val amount: BigDecimal,
    val currency: String,
    val valueDate: Date,
    val sepaReference: String?,
    val unparsedReference: String,
    val bookingText: String?,
    val otherPartyName: String?,
    val otherPartyAccountId: String?,
    val otherPartyBankCode: String?
)