
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "ChargeBearerType1Code")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public enum ChargeBearerType1Code {

    DEBT,
    CRED,
    SHAR,
    SLEV;

}
