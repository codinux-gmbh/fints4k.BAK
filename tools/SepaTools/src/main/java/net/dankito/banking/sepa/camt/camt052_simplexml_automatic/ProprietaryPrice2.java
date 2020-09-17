
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ProprietaryPrice2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ProprietaryPrice2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ProprietaryPrice2 {

    @Element(name = "Tp", required = false)
    private String tp;
    @Element(name = "Pric", required = false)
    private ActiveOrHistoricCurrencyAndAmount pric;

    public ProprietaryPrice2() {
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public ActiveOrHistoricCurrencyAndAmount getPric() {
        return pric;
    }

    public void setPric(ActiveOrHistoricCurrencyAndAmount pric) {
        this.pric = pric;
    }

}
