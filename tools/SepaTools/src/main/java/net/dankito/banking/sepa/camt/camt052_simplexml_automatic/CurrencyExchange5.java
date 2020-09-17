
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CurrencyExchange5 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CurrencyExchange5")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CurrencyExchange5 {

    @Element(name = "SrcCcy", required = false)
    private String srcCcy;
    @Element(name = "TrgtCcy", required = false)
    private String trgtCcy;
    @Element(name = "UnitCcy", required = false)
    private String unitCcy;
    @Element(name = "XchgRate", required = false)
    private String xchgRate;
    @Element(name = "CtrctId", required = false)
    private String ctrctId;
    @Element(name = "QtnDt", required = false)
    private String qtnDt;

    public CurrencyExchange5() {
    }

    public String getSrcCcy() {
        return srcCcy;
    }

    public void setSrcCcy(String srcCcy) {
        this.srcCcy = srcCcy;
    }

    public String getTrgtCcy() {
        return trgtCcy;
    }

    public void setTrgtCcy(String trgtCcy) {
        this.trgtCcy = trgtCcy;
    }

    public String getUnitCcy() {
        return unitCcy;
    }

    public void setUnitCcy(String unitCcy) {
        this.unitCcy = unitCcy;
    }

    public String getXchgRate() {
        return xchgRate;
    }

    public void setXchgRate(String xchgRate) {
        this.xchgRate = xchgRate;
    }

    public String getCtrctId() {
        return ctrctId;
    }

    public void setCtrctId(String ctrctId) {
        this.ctrctId = ctrctId;
    }

    public String getQtnDt() {
        return qtnDt;
    }

    public void setQtnDt(String qtnDt) {
        this.qtnDt = qtnDt;
    }

}
