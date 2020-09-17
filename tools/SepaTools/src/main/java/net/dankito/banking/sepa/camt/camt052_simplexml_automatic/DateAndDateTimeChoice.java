
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DateAndDateTimeChoice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DateAndDateTimeChoice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class DateAndDateTimeChoice {

    @Element(name = "Dt", required = false)
    private String dt;
    @Element(name = "DtTm", required = false)
    private String dtTm;

    public DateAndDateTimeChoice() {
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getDtTm() {
        return dtTm;
    }

    public void setDtTm(String dtTm) {
        this.dtTm = dtTm;
    }

}
