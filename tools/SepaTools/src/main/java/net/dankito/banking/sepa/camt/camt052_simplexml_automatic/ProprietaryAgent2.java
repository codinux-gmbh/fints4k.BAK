
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ProprietaryAgent2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ProprietaryAgent2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ProprietaryAgent2 {

    @Element(name = "Tp", required = false)
    private String tp;
    @Element(name = "Agt", required = false)
    private BranchAndFinancialInstitutionIdentification4 agt;

    public ProprietaryAgent2() {
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public BranchAndFinancialInstitutionIdentification4 getAgt() {
        return agt;
    }

    public void setAgt(BranchAndFinancialInstitutionIdentification4 agt) {
        this.agt = agt;
    }

}
