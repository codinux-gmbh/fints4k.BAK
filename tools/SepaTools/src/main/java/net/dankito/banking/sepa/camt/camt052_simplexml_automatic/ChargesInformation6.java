
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ChargesInformation6 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ChargesInformation6")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ChargesInformation6 {

    @Element(name = "TtlChrgsAndTaxAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount ttlChrgsAndTaxAmt;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;
    @Element(name = "Tp", required = false)
    private ChargeType2Choice tp;
    @Element(name = "Rate", required = false)
    private String rate;
    @Element(name = "Br", required = false)
    private ChargeBearerType1Code br;
    @Element(name = "Pty", required = false)
    private BranchAndFinancialInstitutionIdentification4 pty;
    @Element(name = "Tax", required = false)
    private TaxCharges2 tax;

    public ChargesInformation6() {
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlChrgsAndTaxAmt() {
        return ttlChrgsAndTaxAmt;
    }

    public void setTtlChrgsAndTaxAmt(ActiveOrHistoricCurrencyAndAmount ttlChrgsAndTaxAmt) {
        this.ttlChrgsAndTaxAmt = ttlChrgsAndTaxAmt;
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

    public ChargeType2Choice getTp() {
        return tp;
    }

    public void setTp(ChargeType2Choice tp) {
        this.tp = tp;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public ChargeBearerType1Code getBr() {
        return br;
    }

    public void setBr(ChargeBearerType1Code br) {
        this.br = br;
    }

    public BranchAndFinancialInstitutionIdentification4 getPty() {
        return pty;
    }

    public void setPty(BranchAndFinancialInstitutionIdentification4 pty) {
        this.pty = pty;
    }

    public TaxCharges2 getTax() {
        return tax;
    }

    public void setTax(TaxCharges2 tax) {
        this.tax = tax;
    }

}
