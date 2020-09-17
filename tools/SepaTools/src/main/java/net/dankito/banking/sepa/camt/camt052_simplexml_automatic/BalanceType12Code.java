
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "BalanceType12Code")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public enum BalanceType12Code {

    XPCD,
    OPAV,
    ITAV,
    CLAV,
    FWAV,
    CLBD,
    ITBD,
    OPBD,
    PRCD,
    INFO;

}
