
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionInterest2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionInterest2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionInterest2 {

    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;
    @Element(name = "Tp", required = false)
    private InterestType1Choice tp;
    @Element(name = "Rate", required = false)
    private Rate3 rate;
    @Element(name = "FrToDt", required = false)
    private DateTimePeriodDetails frToDt;
    @Element(name = "Rsn", required = false)
    private String rsn;

    public TransactionInterest2() {
    }

    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    public void setAmt(ActiveOrHistoricCurrencyAndAmount amt) {
        this.amt = amt;
    }

    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    public void setCdtDbtInd(CreditDebitCode cdtDbtInd) {
        this.cdtDbtInd = cdtDbtInd;
    }

    public InterestType1Choice getTp() {
        return tp;
    }

    public void setTp(InterestType1Choice tp) {
        this.tp = tp;
    }

    public Rate3 getRate() {
        return rate;
    }

    public void setRate(Rate3 rate) {
        this.rate = rate;
    }

    public DateTimePeriodDetails getFrToDt() {
        return frToDt;
    }

    public void setFrToDt(DateTimePeriodDetails frToDt) {
        this.frToDt = frToDt;
    }

    public String getRsn() {
        return rsn;
    }

    public void setRsn(String rsn) {
        this.rsn = rsn;
    }

}
