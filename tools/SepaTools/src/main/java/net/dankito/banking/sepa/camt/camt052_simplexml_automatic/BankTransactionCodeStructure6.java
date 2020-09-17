
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BankTransactionCodeStructure6 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BankTransactionCodeStructure6")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BankTransactionCodeStructure6 {

    @Element(name = "Cd", required = false)
    private String cd;
    @Element(name = "SubFmlyCd", required = false)
    private String subFmlyCd;

    public BankTransactionCodeStructure6() {
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getSubFmlyCd() {
        return subFmlyCd;
    }

    public void setSubFmlyCd(String subFmlyCd) {
        this.subFmlyCd = subFmlyCd;
    }

}
