
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BalanceType12 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BalanceType12")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BalanceType12 {

    @Element(name = "CdOrPrtry", required = false)
    private BalanceType5Choice cdOrPrtry;
    @Element(name = "SubTp", required = false)
    private BalanceSubType1Choice subTp;

    public BalanceType12() {
    }

    public BalanceType5Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    public void setCdOrPrtry(BalanceType5Choice cdOrPrtry) {
        this.cdOrPrtry = cdOrPrtry;
    }

    public BalanceSubType1Choice getSubTp() {
        return subTp;
    }

    public void setSubTp(BalanceSubType1Choice subTp) {
        this.subTp = subTp;
    }

}
