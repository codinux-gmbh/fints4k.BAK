
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * FinancialInstrumentQuantityChoice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FinancialInstrumentQuantityChoice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class FinancialInstrumentQuantityChoice {

    @Element(name = "Unit", required = false)
    private String unit;
    @Element(name = "FaceAmt", required = false)
    private String faceAmt;
    @Element(name = "AmtsdVal", required = false)
    private String amtsdVal;

    public FinancialInstrumentQuantityChoice() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFaceAmt() {
        return faceAmt;
    }

    public void setFaceAmt(String faceAmt) {
        this.faceAmt = faceAmt;
    }

    public String getAmtsdVal() {
        return amtsdVal;
    }

    public void setAmtsdVal(String amtsdVal) {
        this.amtsdVal = amtsdVal;
    }

}
