package net.dankito.banking.sepa.camt

import net.dankito.banking.sepa.camt.camt052.Document


interface ICamtMessagesParser {

    fun parseCamt052(xml: String): Document

}