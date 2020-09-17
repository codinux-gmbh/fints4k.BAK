
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Rate3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Rate3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class Rate3 {

    @Element(name = "Tp", required = false)
    private RateType4Choice tp;
    @Element(name = "VldtyRg", required = false)
    private CurrencyAndAmountRange2 vldtyRg;

    public Rate3() {
    }

    public RateType4Choice getTp() {
        return tp;
    }

    public void setTp(RateType4Choice tp) {
        this.tp = tp;
    }

    public CurrencyAndAmountRange2 getVldtyRg() {
        return vldtyRg;
    }

    public void setVldtyRg(CurrencyAndAmountRange2 vldtyRg) {
        this.vldtyRg = vldtyRg;
    }

}
