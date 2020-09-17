
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CurrencyAndAmountRange2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CurrencyAndAmountRange2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CurrencyAndAmountRange2 {

    @Element(name = "Amt", required = false)
    private ImpliedCurrencyAmountRangeChoice amt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;
    @Element(name = "Ccy", required = false)
    private String ccy;

    public CurrencyAndAmountRange2() {
    }

    public ImpliedCurrencyAmountRangeChoice getAmt() {
        return amt;
    }

    public void setAmt(ImpliedCurrencyAmountRangeChoice amt) {
        this.amt = amt;
    }

    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    public void setCdtDbtInd(CreditDebitCode cdtDbtInd) {
        this.cdtDbtInd = cdtDbtInd;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

}
