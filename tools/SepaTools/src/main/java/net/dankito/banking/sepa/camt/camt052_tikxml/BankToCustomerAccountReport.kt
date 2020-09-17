package net.dankito.banking.sepa.camt.camt052_tikxml

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml


@Xml
class BankToCustomerAccountReport {

    @Element(name = "GrpHdr")
    var grpHdr: GroupHeader? = null

}