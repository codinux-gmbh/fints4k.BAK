package net.dankito.banking.ui.model

import net.dankito.utils.multiplatform.BigDecimal
import net.dankito.utils.multiplatform.Date


/**
 * A reduced version of [IAccountTransaction] containing only to fields displayed in list views to that the user gets an overview of all important fields of an
 * account transaction.
 */
open class AccountTransactionInfo(
    open val account: TypedBankAccount,
    open val amount: BigDecimal,
    open val currency: String,
    open val valueDate: Date,
    open val sepaReference: String?,
    open val unparsedReference: String,
    open val bookingText: String?,
    open val otherPartyName: String?,
    open val otherPartyAccountId: String?,
    open val otherPartyBankCode: String?
) {


    val showOtherPartyName: Boolean
        get() = otherPartyName.isNullOrBlank() == false /* && type != "ENTGELTABSCHLUSS" && type != "AUSZAHLUNG" */ // TODO

    val canCreateMoneyTransferFrom: Boolean
        get() = otherPartyAccountId != null && account.supportsTransferringMoney

    val reference: String
        get() = sepaReference ?: unparsedReference

}