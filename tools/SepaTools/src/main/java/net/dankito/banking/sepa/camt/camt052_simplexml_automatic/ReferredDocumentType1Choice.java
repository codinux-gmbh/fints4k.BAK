
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ReferredDocumentType1Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ReferredDocumentType1Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ReferredDocumentType1Choice {

    @Element(name = "Cd", required = false)
    private DocumentType5Code cd;
    @Element(name = "Prtry", required = false)
    private String prtry;

    public ReferredDocumentType1Choice() {
    }

    public DocumentType5Code getCd() {
        return cd;
    }

    public void setCd(DocumentType5Code cd) {
        this.cd = cd;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String prtry) {
        this.prtry = prtry;
    }

}
