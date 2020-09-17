
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ProprietaryDate2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ProprietaryDate2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ProprietaryDate2 {

    @Element(name = "Tp", required = false)
    private String tp;
    @Element(name = "Dt", required = false)
    private DateAndDateTimeChoice dt;

    public ProprietaryDate2() {
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    public void setDt(DateAndDateTimeChoice dt) {
        this.dt = dt;
    }

}
