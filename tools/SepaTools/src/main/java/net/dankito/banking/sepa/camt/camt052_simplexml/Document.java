package net.dankito.banking.sepa.camt.camt052_simplexml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(name = "Document", strict = false)
public class Document {

    private BankToCustomerAccountReport bkToCstmrAcctRpt = null;

    public BankToCustomerAccountReport getBkToCstmrAcctRpt() {
        return bkToCstmrAcctRpt;
    }

    @Element(name = "bkToCstmrAcctRpt")
    public void setBkToCstmrAcctRpt(BankToCustomerAccountReport bkToCstmrAcctRpt) {
        this.bkToCstmrAcctRpt = bkToCstmrAcctRpt;
    }
}
