
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TaxParty2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TaxParty2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TaxParty2 {

    @Element(name = "TaxId", required = false)
    private String taxId;
    @Element(name = "RegnId", required = false)
    private String regnId;
    @Element(name = "TaxTp", required = false)
    private String taxTp;
    @Element(name = "Authstn", required = false)
    private TaxAuthorisation1 authstn;

    public TaxParty2() {
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getRegnId() {
        return regnId;
    }

    public void setRegnId(String regnId) {
        this.regnId = regnId;
    }

    public String getTaxTp() {
        return taxTp;
    }

    public void setTaxTp(String taxTp) {
        this.taxTp = taxTp;
    }

    public TaxAuthorisation1 getAuthstn() {
        return authstn;
    }

    public void setAuthstn(TaxAuthorisation1 authstn) {
        this.authstn = authstn;
    }

}
