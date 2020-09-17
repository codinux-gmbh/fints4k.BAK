
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * SecurityIdentification4Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "SecurityIdentification4Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class SecurityIdentification4Choice {

    @Element(name = "ISIN", required = false)
    private String isin;
    @Element(name = "Prtry", required = false)
    private AlternateSecurityIdentification2 prtry;

    public SecurityIdentification4Choice() {
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public AlternateSecurityIdentification2 getPrtry() {
        return prtry;
    }

    public void setPrtry(AlternateSecurityIdentification2 prtry) {
        this.prtry = prtry;
    }

}
