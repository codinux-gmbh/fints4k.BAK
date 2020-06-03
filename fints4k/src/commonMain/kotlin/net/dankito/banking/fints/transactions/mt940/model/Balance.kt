package net.dankito.banking.fints.transactions.mt940.model

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import com.soywiz.klock.Date
import com.soywiz.klock.DateTime


open class Balance(

    val isIntermediate: Boolean,

    /**
     * Soll/Haben-Kennung
     *
     * “C” = Credit (Habensaldo)
     * ”D” = Debit (Sollsaldo)
     *
     * Length = 1
     */
    val isCredit: Boolean,

    /**
     * JJMMTT = Buchungsdatum des Saldos oder '0' beim ersten Auszug
     *
     * Max length = 6
     */
    val bookingDate: Date,

    /**
     * Währungsschlüssel gem. ISO 4217
     *
     * Length = 3
     */
    val currency: String,

    /**
     * Betrag
     *
     * Max Length = 15
     */
    val amount: BigDecimal

) {

    internal constructor() : this(false, false, DateTime.EPOCH.date, "", BigDecimal.ZERO) // for object deserializers


    override fun toString(): String {
        return "$bookingDate ${if (isCredit) "+" else "-"}$amount $currency"
    }

}