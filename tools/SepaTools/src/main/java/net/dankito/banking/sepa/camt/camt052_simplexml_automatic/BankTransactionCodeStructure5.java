
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BankTransactionCodeStructure5 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BankTransactionCodeStructure5")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BankTransactionCodeStructure5 {

    @Element(name = "Cd", required = false)
    private String cd;
    @Element(name = "Fmly", required = false)
    private BankTransactionCodeStructure6 fmly;

    public BankTransactionCodeStructure5() {
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public BankTransactionCodeStructure6 getFmly() {
        return fmly;
    }

    public void setFmly(BankTransactionCodeStructure6 fmly) {
        this.fmly = fmly;
    }

}
