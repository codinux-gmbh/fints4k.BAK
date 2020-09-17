
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * NumberAndSumOfTransactions2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "NumberAndSumOfTransactions2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class NumberAndSumOfTransactions2 {

    @Element(name = "NbOfNtries", required = false)
    private String nbOfNtries;
    @Element(name = "Sum", required = false)
    private String sum;
    @Element(name = "TtlNetNtryAmt", required = false)
    private String ttlNetNtryAmt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;

    public NumberAndSumOfTransactions2() {
    }

    public String getNbOfNtries() {
        return nbOfNtries;
    }

    public void setNbOfNtries(String nbOfNtries) {
        this.nbOfNtries = nbOfNtries;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getTtlNetNtryAmt() {
        return ttlNetNtryAmt;
    }

    public void setTtlNetNtryAmt(String ttlNetNtryAmt) {
        this.ttlNetNtryAmt = ttlNetNtryAmt;
    }

    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    public void setCdtDbtInd(CreditDebitCode cdtDbtInd) {
        this.cdtDbtInd = cdtDbtInd;
    }

}
