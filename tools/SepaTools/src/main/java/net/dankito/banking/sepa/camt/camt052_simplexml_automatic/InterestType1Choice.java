
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * InterestType1Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "InterestType1Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class InterestType1Choice {

    @Element(name = "Cd", required = false)
    private InterestType1Code cd;
    @Element(name = "Prtry", required = false)
    private String prtry;

    public InterestType1Choice() {
    }

    public InterestType1Code getCd() {
        return cd;
    }

    public void setCd(InterestType1Code cd) {
        this.cd = cd;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String prtry) {
        this.prtry = prtry;
    }

}
