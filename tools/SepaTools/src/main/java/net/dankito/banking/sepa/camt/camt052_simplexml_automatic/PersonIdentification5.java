
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * PersonIdentification5 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "PersonIdentification5")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class PersonIdentification5 {

    @Element(name = "DtAndPlcOfBirth", required = false)
    private DateAndPlaceOfBirth dtAndPlcOfBirth;
    @Element(name = "Othr", required = false)
    private GenericPersonIdentification1 othr;

    public PersonIdentification5() {
    }

    public DateAndPlaceOfBirth getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth dtAndPlcOfBirth) {
        this.dtAndPlcOfBirth = dtAndPlcOfBirth;
    }

    public GenericPersonIdentification1 getOthr() {
        return othr;
    }

    public void setOthr(GenericPersonIdentification1 othr) {
        this.othr = othr;
    }

}
