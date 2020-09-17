
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TotalTransactions2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TotalTransactions2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TotalTransactions2 {

    @Element(name = "TtlNtries", required = false)
    private NumberAndSumOfTransactions2 ttlNtries;
    @Element(name = "TtlCdtNtries", required = false)
    private NumberAndSumOfTransactions1 ttlCdtNtries;
    @Element(name = "TtlDbtNtries", required = false)
    private NumberAndSumOfTransactions1 ttlDbtNtries;
    @Element(name = "TtlNtriesPerBkTxCd", required = false)
    private TotalsPerBankTransactionCode2 ttlNtriesPerBkTxCd;

    public TotalTransactions2() {
    }

    public NumberAndSumOfTransactions2 getTtlNtries() {
        return ttlNtries;
    }

    public void setTtlNtries(NumberAndSumOfTransactions2 ttlNtries) {
        this.ttlNtries = ttlNtries;
    }

    public NumberAndSumOfTransactions1 getTtlCdtNtries() {
        return ttlCdtNtries;
    }

    public void setTtlCdtNtries(NumberAndSumOfTransactions1 ttlCdtNtries) {
        this.ttlCdtNtries = ttlCdtNtries;
    }

    public NumberAndSumOfTransactions1 getTtlDbtNtries() {
        return ttlDbtNtries;
    }

    public void setTtlDbtNtries(NumberAndSumOfTransactions1 ttlDbtNtries) {
        this.ttlDbtNtries = ttlDbtNtries;
    }

    public TotalsPerBankTransactionCode2 getTtlNtriesPerBkTxCd() {
        return ttlNtriesPerBkTxCd;
    }

    public void setTtlNtriesPerBkTxCd(TotalsPerBankTransactionCode2 ttlNtriesPerBkTxCd) {
        this.ttlNtriesPerBkTxCd = ttlNtriesPerBkTxCd;
    }

}
