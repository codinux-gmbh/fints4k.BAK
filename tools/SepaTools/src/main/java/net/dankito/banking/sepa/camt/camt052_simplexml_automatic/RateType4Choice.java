
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RateType4Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RateType4Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class RateType4Choice {

    @Element(name = "Pctg", required = false)
    private String pctg;
    @Element(name = "Othr", required = false)
    private String othr;

    public RateType4Choice() {
    }

    public String getPctg() {
        return pctg;
    }

    public void setPctg(String pctg) {
        this.pctg = pctg;
    }

    public String getOthr() {
        return othr;
    }

    public void setOthr(String othr) {
        this.othr = othr;
    }

}
