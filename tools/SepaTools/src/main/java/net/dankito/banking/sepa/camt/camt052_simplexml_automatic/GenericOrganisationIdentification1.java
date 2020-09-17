
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * GenericOrganisationIdentification1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "GenericOrganisationIdentification1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class GenericOrganisationIdentification1 {

    @Element(name = "Id", required = false)
    private String id;
    @Element(name = "SchmeNm", required = false)
    private OrganisationIdentificationSchemeName1Choice schmeNm;
    @Element(name = "Issr", required = false)
    private String issr;

    public GenericOrganisationIdentification1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrganisationIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    public void setSchmeNm(OrganisationIdentificationSchemeName1Choice schmeNm) {
        this.schmeNm = schmeNm;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String issr) {
        this.issr = issr;
    }

}
