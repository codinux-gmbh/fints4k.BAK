
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ImpliedCurrencyAmountRangeChoice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ImpliedCurrencyAmountRangeChoice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ImpliedCurrencyAmountRangeChoice {

    @Element(name = "FrAmt", required = false)
    private AmountRangeBoundary1 frAmt;
    @Element(name = "ToAmt", required = false)
    private AmountRangeBoundary1 toAmt;
    @Element(name = "FrToAmt", required = false)
    private FromToAmountRange frToAmt;
    @Element(name = "EQAmt", required = false)
    private String eqAmt;
    @Element(name = "NEQAmt", required = false)
    private String neqAmt;

    public ImpliedCurrencyAmountRangeChoice() {
    }

    public AmountRangeBoundary1 getFrAmt() {
        return frAmt;
    }

    public void setFrAmt(AmountRangeBoundary1 frAmt) {
        this.frAmt = frAmt;
    }

    public AmountRangeBoundary1 getToAmt() {
        return toAmt;
    }

    public void setToAmt(AmountRangeBoundary1 toAmt) {
        this.toAmt = toAmt;
    }

    public FromToAmountRange getFrToAmt() {
        return frToAmt;
    }

    public void setFrToAmt(FromToAmountRange frToAmt) {
        this.frToAmt = frToAmt;
    }

    public String getEqAmt() {
        return eqAmt;
    }

    public void setEqAmt(String eqAmt) {
        this.eqAmt = eqAmt;
    }

    public String getNeqAmt() {
        return neqAmt;
    }

    public void setNeqAmt(String neqAmt) {
        this.neqAmt = neqAmt;
    }

}
