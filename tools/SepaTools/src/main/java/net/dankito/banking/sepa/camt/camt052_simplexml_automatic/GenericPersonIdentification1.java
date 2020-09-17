
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * GenericPersonIdentification1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "GenericPersonIdentification1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class GenericPersonIdentification1 {

    @Element(name = "Id", required = false)
    private String id;
    @Element(name = "SchmeNm", required = false)
    private PersonIdentificationSchemeName1Choice schmeNm;
    @Element(name = "Issr", required = false)
    private String issr;

    public GenericPersonIdentification1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersonIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    public void setSchmeNm(PersonIdentificationSchemeName1Choice schmeNm) {
        this.schmeNm = schmeNm;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String issr) {
        this.issr = issr;
    }

}
