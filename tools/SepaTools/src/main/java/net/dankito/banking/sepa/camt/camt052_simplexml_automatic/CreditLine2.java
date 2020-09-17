
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CreditLine2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CreditLine2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CreditLine2 {

    @Element(name = "Incl", required = false)
    private String incl;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;

    public CreditLine2() {
    }

    public String getIncl() {
        return incl;
    }

    public void setIncl(String incl) {
        this.incl = incl;
    }

    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    public void setAmt(ActiveOrHistoricCurrencyAndAmount amt) {
        this.amt = amt;
    }

}
