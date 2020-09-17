
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BalanceType5Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BalanceType5Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BalanceType5Choice {

    @Element(name = "Cd", required = false)
    private BalanceType12Code cd;
    @Element(name = "Prtry", required = false)
    private String prtry;

    public BalanceType5Choice() {
    }

    public BalanceType12Code getCd() {
        return cd;
    }

    public void setCd(BalanceType12Code cd) {
        this.cd = cd;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String prtry) {
        this.prtry = prtry;
    }

}
