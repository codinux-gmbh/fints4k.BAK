
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * OrganisationIdentification4 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "OrganisationIdentification4")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class OrganisationIdentification4 {

    @Element(name = "BICOrBEI", required = false)
    private String bicOrBEI;
    @Element(name = "Othr", required = false)
    private GenericOrganisationIdentification1 othr;

    public OrganisationIdentification4() {
    }

    public String getBicOrBEI() {
        return bicOrBEI;
    }

    public void setBicOrBEI(String bicOrBEI) {
        this.bicOrBEI = bicOrBEI;
    }

    public GenericOrganisationIdentification1 getOthr() {
        return othr;
    }

    public void setOthr(GenericOrganisationIdentification1 othr) {
        this.othr = othr;
    }

}
