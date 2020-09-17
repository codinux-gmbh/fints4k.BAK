
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BranchAndFinancialInstitutionIdentification4 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BranchAndFinancialInstitutionIdentification4")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BranchAndFinancialInstitutionIdentification4 {

    @Element(name = "FinInstnId", required = false)
    private FinancialInstitutionIdentification7 finInstnId;
    @Element(name = "BrnchId", required = false)
    private BranchData2 brnchId;

    public BranchAndFinancialInstitutionIdentification4() {
    }

    public FinancialInstitutionIdentification7 getFinInstnId() {
        return finInstnId;
    }

    public void setFinInstnId(FinancialInstitutionIdentification7 finInstnId) {
        this.finInstnId = finInstnId;
    }

    public BranchData2 getBrnchId() {
        return brnchId;
    }

    public void setBrnchId(BranchData2 brnchId) {
        this.brnchId = brnchId;
    }

}
