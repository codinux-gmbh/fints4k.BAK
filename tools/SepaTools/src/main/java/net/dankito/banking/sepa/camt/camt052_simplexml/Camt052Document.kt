package net.dankito.banking.sepa.camt.camt052_simplexml

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


@Root(name = "Document", strict = false)
class Camt052Document {

    @Element(name = "bkToCstmrAcctRpt")
    var bkToCstmrAcctRpt: BankToCustomerAccountReport? = null

}