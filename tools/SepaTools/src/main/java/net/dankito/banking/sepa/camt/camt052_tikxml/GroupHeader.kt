package net.dankito.banking.sepa.camt.camt052_tikxml

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml


@Xml
class GroupHeader {

    @PropertyElement(name = "MsgId")
    var msgId: String? = null

    @PropertyElement(name = "CreDtTm")
    var creDtTm: String? = null

//    @Element(name = "MsgPgntn")
//    var msgRcpt: PartyIdentification32? = null
//
//    @Element(name = "GrpHdr")
//    var msgPgntn: Pagination? = null

    @PropertyElement(name = "GrpHdr")
    var addtlInf: String? = null
    
}