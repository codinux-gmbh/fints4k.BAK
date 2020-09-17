
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ProprietaryBankTransactionCodeStructure1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ProprietaryBankTransactionCodeStructure1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ProprietaryBankTransactionCodeStructure1 {

    @Element(name = "Cd", required = false)
    private String cd;
    @Element(name = "Issr", required = false)
    private String issr;

    public ProprietaryBankTransactionCodeStructure1() {
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String issr) {
        this.issr = issr;
    }

}
