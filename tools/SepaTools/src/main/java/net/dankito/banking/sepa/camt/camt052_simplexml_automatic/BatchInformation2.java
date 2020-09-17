
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BatchInformation2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BatchInformation2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BatchInformation2 {

    @Element(name = "MsgId", required = false)
    private String msgId;
    @Element(name = "PmtInfId", required = false)
    private String pmtInfId;
    @Element(name = "NbOfTxs", required = false)
    private String nbOfTxs;
    @Element(name = "TtlAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;

    public BatchInformation2() {
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getPmtInfId() {
        return pmtInfId;
    }

    public void setPmtInfId(String pmtInfId) {
        this.pmtInfId = pmtInfId;
    }

    public String getNbOfTxs() {
        return nbOfTxs;
    }

    public void setNbOfTxs(String nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount ttlAmt) {
        this.ttlAmt = ttlAmt;
    }

    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    public void setCdtDbtInd(CreditDebitCode cdtDbtInd) {
        this.cdtDbtInd = cdtDbtInd;
    }

}
