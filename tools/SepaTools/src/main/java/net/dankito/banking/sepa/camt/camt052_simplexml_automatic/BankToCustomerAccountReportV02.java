
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BankToCustomerAccountReportV02 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BankToCustomerAccountReportV02")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BankToCustomerAccountReportV02 {

    @Element(name = "GrpHdr", required = false)
    private GroupHeader42 grpHdr;
    @Element(name = "Rpt", required = false)
    private AccountReport11 rpt;

    public BankToCustomerAccountReportV02() {
    }

    public GroupHeader42 getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GroupHeader42 grpHdr) {
        this.grpHdr = grpHdr;
    }

    public AccountReport11 getRpt() {
        return rpt;
    }

    public void setRpt(AccountReport11 rpt) {
        this.rpt = rpt;
    }

}
