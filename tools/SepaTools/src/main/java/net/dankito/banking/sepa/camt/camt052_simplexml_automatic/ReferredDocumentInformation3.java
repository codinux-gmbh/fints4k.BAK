
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ReferredDocumentInformation3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ReferredDocumentInformation3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ReferredDocumentInformation3 {

    @Element(name = "Tp", required = false)
    private ReferredDocumentType2 tp;
    @Element(name = "Nb", required = false)
    private String nb;
    @Element(name = "RltdDt", required = false)
    private String rltdDt;

    public ReferredDocumentInformation3() {
    }

    public ReferredDocumentType2 getTp() {
        return tp;
    }

    public void setTp(ReferredDocumentType2 tp) {
        this.tp = tp;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }

    public String getRltdDt() {
        return rltdDt;
    }

    public void setRltdDt(String rltdDt) {
        this.rltdDt = rltdDt;
    }

}
