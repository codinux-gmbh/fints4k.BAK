
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ReferredDocumentType2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ReferredDocumentType2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ReferredDocumentType2 {

    @Element(name = "CdOrPrtry", required = false)
    private ReferredDocumentType1Choice cdOrPrtry;
    @Element(name = "Issr", required = false)
    private String issr;

    public ReferredDocumentType2() {
    }

    public ReferredDocumentType1Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    public void setCdOrPrtry(ReferredDocumentType1Choice cdOrPrtry) {
        this.cdOrPrtry = cdOrPrtry;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String issr) {
        this.issr = issr;
    }

}
