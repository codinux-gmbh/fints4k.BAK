
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionDates2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionDates2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionDates2 {

    @Element(name = "AccptncDtTm", required = false)
    private String accptncDtTm;
    @Element(name = "TradActvtyCtrctlSttlmDt", required = false)
    private String tradActvtyCtrctlSttlmDt;
    @Element(name = "TradDt", required = false)
    private String tradDt;
    @Element(name = "IntrBkSttlmDt", required = false)
    private String intrBkSttlmDt;
    @Element(name = "StartDt", required = false)
    private String startDt;
    @Element(name = "EndDt", required = false)
    private String endDt;
    @Element(name = "TxDtTm", required = false)
    private String txDtTm;
    @Element(name = "Prtry", required = false)
    private ProprietaryDate2 prtry;

    public TransactionDates2() {
    }

    public String getAccptncDtTm() {
        return accptncDtTm;
    }

    public void setAccptncDtTm(String accptncDtTm) {
        this.accptncDtTm = accptncDtTm;
    }

    public String getTradActvtyCtrctlSttlmDt() {
        return tradActvtyCtrctlSttlmDt;
    }

    public void setTradActvtyCtrctlSttlmDt(String tradActvtyCtrctlSttlmDt) {
        this.tradActvtyCtrctlSttlmDt = tradActvtyCtrctlSttlmDt;
    }

    public String getTradDt() {
        return tradDt;
    }

    public void setTradDt(String tradDt) {
        this.tradDt = tradDt;
    }

    public String getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    public void setIntrBkSttlmDt(String intrBkSttlmDt) {
        this.intrBkSttlmDt = intrBkSttlmDt;
    }

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    public String getEndDt() {
        return endDt;
    }

    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }

    public String getTxDtTm() {
        return txDtTm;
    }

    public void setTxDtTm(String txDtTm) {
        this.txDtTm = txDtTm;
    }

    public ProprietaryDate2 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryDate2 prtry) {
        this.prtry = prtry;
    }

}
