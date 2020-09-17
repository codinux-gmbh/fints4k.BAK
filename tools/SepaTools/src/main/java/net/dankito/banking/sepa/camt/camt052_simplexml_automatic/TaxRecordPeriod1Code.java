
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "TaxRecordPeriod1Code")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public enum TaxRecordPeriod1Code {

    MM01,
    MM02,
    MM03,
    MM04,
    MM05,
    MM06,
    MM07,
    MM08,
    MM09,
    MM10,
    MM11,
    MM12,
    QTR1,
    QTR2,
    QTR3,
    QTR4,
    HLF1,
    HLF2;

}
