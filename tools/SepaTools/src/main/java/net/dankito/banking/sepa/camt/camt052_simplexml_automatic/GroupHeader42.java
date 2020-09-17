
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * GroupHeader42 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "GroupHeader42")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class GroupHeader42 {

    @Element(name = "MsgId", required = false)
    private String msgId;
    @Element(name = "CreDtTm", required = false)
    private String creDtTm;
    @Element(name = "MsgRcpt", required = false)
    private PartyIdentification32 msgRcpt;
    @Element(name = "MsgPgntn", required = false)
    private Pagination msgPgntn;
    @Element(name = "AddtlInf", required = false)
    private String addtlInf;

    public GroupHeader42() {
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
    }

    public PartyIdentification32 getMsgRcpt() {
        return msgRcpt;
    }

    public void setMsgRcpt(PartyIdentification32 msgRcpt) {
        this.msgRcpt = msgRcpt;
    }

    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    public void setMsgPgntn(Pagination msgPgntn) {
        this.msgPgntn = msgPgntn;
    }

    public String getAddtlInf() {
        return addtlInf;
    }

    public void setAddtlInf(String addtlInf) {
        this.addtlInf = addtlInf;
    }

}
