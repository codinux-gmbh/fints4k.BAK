
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DateTimePeriodDetails<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DateTimePeriodDetails")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class DateTimePeriodDetails {

    @Element(name = "FrDtTm", required = false)
    private String frDtTm;
    @Element(name = "ToDtTm", required = false)
    private String toDtTm;

    public DateTimePeriodDetails() {
    }

    public String getFrDtTm() {
        return frDtTm;
    }

    public void setFrDtTm(String frDtTm) {
        this.frDtTm = frDtTm;
    }

    public String getToDtTm() {
        return toDtTm;
    }

    public void setToDtTm(String toDtTm) {
        this.toDtTm = toDtTm;
    }

}
