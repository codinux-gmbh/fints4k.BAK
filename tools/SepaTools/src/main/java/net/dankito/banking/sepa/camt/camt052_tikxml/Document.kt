package net.dankito.banking.sepa.camt.camt052_tikxml

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml


@Xml(name = "Document")
class Document {

    @Element(name = "BkToCstmrAcctRpt")
    var bkToCstmrAcctRpt: BankToCustomerAccountReport? = null

}