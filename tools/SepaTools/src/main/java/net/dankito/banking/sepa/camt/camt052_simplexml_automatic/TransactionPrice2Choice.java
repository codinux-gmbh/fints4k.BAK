
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionPrice2Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionPrice2Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionPrice2Choice {

    @Element(name = "DealPric", required = false)
    private ActiveOrHistoricCurrencyAndAmount dealPric;
    @Element(name = "Prtry", required = false)
    private ProprietaryPrice2 prtry;

    public TransactionPrice2Choice() {
    }

    public ActiveOrHistoricCurrencyAndAmount getDealPric() {
        return dealPric;
    }

    public void setDealPric(ActiveOrHistoricCurrencyAndAmount dealPric) {
        this.dealPric = dealPric;
    }

    public ProprietaryPrice2 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryPrice2 prtry) {
        this.prtry = prtry;
    }

}
