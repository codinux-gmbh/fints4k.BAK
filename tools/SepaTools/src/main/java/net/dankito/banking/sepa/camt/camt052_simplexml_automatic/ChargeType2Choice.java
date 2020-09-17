
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ChargeType2Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ChargeType2Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ChargeType2Choice {

    @Element(name = "Cd", required = false)
    private ChargeType1Code cd;
    @Element(name = "Prtry", required = false)
    private GenericIdentification3 prtry;

    public ChargeType2Choice() {
    }

    public ChargeType1Code getCd() {
        return cd;
    }

    public void setCd(ChargeType1Code cd) {
        this.cd = cd;
    }

    public GenericIdentification3 getPrtry() {
        return prtry;
    }

    public void setPrtry(GenericIdentification3 prtry) {
        this.prtry = prtry;
    }

}
