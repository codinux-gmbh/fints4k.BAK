
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CashAccountType2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CashAccountType2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CashAccountType2 {

    @Element(name = "Cd", required = false)
    private CashAccountType4Code cd;
    @Element(name = "Prtry", required = false)
    private String prtry;

    public CashAccountType2() {
    }

    public CashAccountType4Code getCd() {
        return cd;
    }

    public void setCd(CashAccountType4Code cd) {
        this.cd = cd;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String prtry) {
        this.prtry = prtry;
    }

}
