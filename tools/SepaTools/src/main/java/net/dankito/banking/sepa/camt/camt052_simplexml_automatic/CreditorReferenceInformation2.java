
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CreditorReferenceInformation2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CreditorReferenceInformation2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CreditorReferenceInformation2 {

    @Element(name = "Tp", required = false)
    private CreditorReferenceType2 tp;
    @Element(name = "Ref", required = false)
    private String ref;

    public CreditorReferenceInformation2() {
    }

    public CreditorReferenceType2 getTp() {
        return tp;
    }

    public void setTp(CreditorReferenceType2 tp) {
        this.tp = tp;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
