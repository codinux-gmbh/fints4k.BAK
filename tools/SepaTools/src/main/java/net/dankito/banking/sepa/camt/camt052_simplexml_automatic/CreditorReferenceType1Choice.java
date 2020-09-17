
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CreditorReferenceType1Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CreditorReferenceType1Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CreditorReferenceType1Choice {

    @Element(name = "Cd", required = false)
    private DocumentType3Code cd;
    @Element(name = "Prtry", required = false)
    private String prtry;

    public CreditorReferenceType1Choice() {
    }

    public DocumentType3Code getCd() {
        return cd;
    }

    public void setCd(DocumentType3Code cd) {
        this.cd = cd;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String prtry) {
        this.prtry = prtry;
    }

}
