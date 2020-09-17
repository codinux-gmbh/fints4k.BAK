
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * FromToAmountRange<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FromToAmountRange")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class FromToAmountRange {

    @Element(name = "FrAmt", required = false)
    private AmountRangeBoundary1 frAmt;
    @Element(name = "ToAmt", required = false)
    private AmountRangeBoundary1 toAmt;

    public FromToAmountRange() {
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

}
