
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TaxPeriod1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TaxPeriod1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TaxPeriod1 {

    @Element(name = "Yr", required = false)
    private String yr;
    @Element(name = "Tp", required = false)
    private TaxRecordPeriod1Code tp;
    @Element(name = "FrToDt", required = false)
    private DatePeriodDetails frToDt;

    public TaxPeriod1() {
    }

    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }

    public TaxRecordPeriod1Code getTp() {
        return tp;
    }

    public void setTp(TaxRecordPeriod1Code tp) {
        this.tp = tp;
    }

    public DatePeriodDetails getFrToDt() {
        return frToDt;
    }

    public void setFrToDt(DatePeriodDetails frToDt) {
        this.frToDt = frToDt;
    }

}
