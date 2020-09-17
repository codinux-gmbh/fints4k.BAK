
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatePeriodDetails<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatePeriodDetails")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class DatePeriodDetails {

    @Element(name = "FrDt", required = false)
    private String frDt;
    @Element(name = "ToDt", required = false)
    private String toDt;

    public DatePeriodDetails() {
    }

    public String getFrDt() {
        return frDt;
    }

    public void setFrDt(String frDt) {
        this.frDt = frDt;
    }

    public String getToDt() {
        return toDt;
    }

    public void setToDt(String toDt) {
        this.toDt = toDt;
    }

}
