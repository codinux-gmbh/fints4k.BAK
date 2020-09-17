
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AccountIdentification4Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AccountIdentification4Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AccountIdentification4Choice {

    @Element(name = "IBAN", required = false)
    private String iban;
    @Element(name = "Othr", required = false)
    private GenericAccountIdentification1 othr;

    public AccountIdentification4Choice() {
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public GenericAccountIdentification1 getOthr() {
        return othr;
    }

    public void setOthr(GenericAccountIdentification1 othr) {
        this.othr = othr;
    }

}
