
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AmountAndCurrencyExchangeDetails3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AmountAndCurrencyExchangeDetails3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AmountAndCurrencyExchangeDetails3 {

    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CcyXchg", required = false)
    private CurrencyExchange5 ccyXchg;

    public AmountAndCurrencyExchangeDetails3() {
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
