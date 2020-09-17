
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TaxRecordDetails1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TaxRecordDetails1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TaxRecordDetails1 {

    @Element(name = "Prd", required = false)
    private TaxPeriod1 prd;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;

    public TaxRecordDetails1() {
    }

    public TaxPeriod1 getPrd() {
        return prd;
    }

    public void setPrd(TaxPeriod1 prd) {
        this.prd = prd;
    }

    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    public void setAmt(ActiveOrHistoricCurrencyAndAmount amt) {
        this.amt = amt;
    }

}
