
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionReferences2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionReferences2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionReferences2 {

    @Element(name = "MsgId", required = false)
    private String msgId;
    @Element(name = "AcctSvcrRef", required = false)
    private String acctSvcrRef;
    @Element(name = "PmtInfId", required = false)
    private String pmtInfId;
    @Element(name = "InstrId", required = false)
    private String instrId;
    @Element(name = "EndToEndId", required = false)
    private String endToEndId;
    @Element(name = "TxId", required = false)
    private String txId;
    @Element(name = "MndtId", required = false)
    private String mndtId;
    @Element(name = "ChqNb", required = false)
    private String chqNb;
    @Element(name = "ClrSysRef", required = false)
    private String clrSysRef;
    @Element(name = "Prtry", required = false)
    private ProprietaryReference1 prtry;

    public TransactionReferences2() {
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    public void setAcctSvcrRef(String acctSvcrRef) {
        this.acctSvcrRef = acctSvcrRef;
    }

    public String getPmtInfId() {
        return pmtInfId;
    }

    public void setPmtInfId(String pmtInfId) {
        this.pmtInfId = pmtInfId;
    }

    public String getInstrId() {
        return instrId;
    }

    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getMndtId() {
        return mndtId;
    }

    public void setMndtId(String mndtId) {
        this.mndtId = mndtId;
    }

    public String getChqNb() {
        return chqNb;
    }

    public void setChqNb(String chqNb) {
        this.chqNb = chqNb;
    }

    public String getClrSysRef() {
        return clrSysRef;
    }

    public void setClrSysRef(String clrSysRef) {
        this.clrSysRef = clrSysRef;
    }

    public ProprietaryReference1 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryReference1 prtry) {
        this.prtry = prtry;
    }

}
