
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AmountAndCurrencyExchangeDetails4 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AmountAndCurrencyExchangeDetails4")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AmountAndCurrencyExchangeDetails4 {

    @Element(name = "Tp", required = false)
    private String tp;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CcyXchg", required = false)
    private CurrencyExchange5 ccyXchg;

    public AmountAndCurrencyExchangeDetails4() {
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    public void setAmt(ActiveOrHistoricCurrencyAndAmount amt) {
        this.amt = amt;
    }

    public CurrencyExchange5 getCcyXchg() {
        return ccyXchg;
    }

    public void setCcyXchg(CurrencyExchange5 ccyXchg) {
        this.ccyXchg = ccyXchg;
    }

}
