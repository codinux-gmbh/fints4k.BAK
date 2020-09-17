
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Party6Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Party6Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class Party6Choice {

    @Element(name = "OrgId", required = false)
    private OrganisationIdentification4 orgId;
    @Element(name = "PrvtId", required = false)
    private PersonIdentification5 prvtId;

    public Party6Choice() {
    }

    public OrganisationIdentification4 getOrgId() {
        return orgId;
    }

    public void setOrgId(OrganisationIdentification4 orgId) {
        this.orgId = orgId;
    }

    public PersonIdentification5 getPrvtId() {
        return prvtId;
    }

    public void setPrvtId(PersonIdentification5 prvtId) {
        this.prvtId = prvtId;
    }

}
