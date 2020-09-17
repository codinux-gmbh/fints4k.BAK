
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AmountRangeBoundary1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AmountRangeBoundary1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AmountRangeBoundary1 {

    @Element(name = "BdryAmt", required = false)
    private String bdryAmt;
    @Element(name = "Incl", required = false)
    private String incl;

    public AmountRangeBoundary1() {
    }

    public String getBdryAmt() {
        return bdryAmt;
    }

    public void setBdryAmt(String bdryAmt) {
        this.bdryAmt = bdryAmt;
    }

    public String getIncl() {
        return incl;
    }

    public void setIncl(String incl) {
        this.incl = incl;
    }

}
