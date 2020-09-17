
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RemittanceInformation5 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RemittanceInformation5")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class RemittanceInformation5 {

    @Element(name = "Ustrd", required = false)
    private String ustrd;
    @Element(name = "Strd", required = false)
    private StructuredRemittanceInformation7 strd;

    public RemittanceInformation5() {
    }

    public String getUstrd() {
        return ustrd;
    }

    public void setUstrd(String ustrd) {
        this.ustrd = ustrd;
    }

    public StructuredRemittanceInformation7 getStrd() {
        return strd;
    }

    public void setStrd(StructuredRemittanceInformation7 strd) {
        this.strd = strd;
    }

}
