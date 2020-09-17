
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Document<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Document")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class Document {

    @Attribute(name = "schemaLocation")
    @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")
    private String mSchemaLocation;

    @Element(name = "BkToCstmrAcctRpt", required = false)
    private BankToCustomerAccountReportV02 bkToCstmrAcctRpt;

    public Document() {
    }

    public BankToCustomerAccountReportV02 getBkToCstmrAcctRpt() {
        return bkToCstmrAcctRpt;
    }

    public void setBkToCstmrAcctRpt(BankToCustomerAccountReportV02 bkToCstmrAcctRpt) {
        this.bkToCstmrAcctRpt = bkToCstmrAcctRpt;
    }

}
