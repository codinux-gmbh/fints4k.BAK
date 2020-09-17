
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CashBalanceAvailability2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CashBalanceAvailability2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CashBalanceAvailability2 {

    @Element(name = "Dt", required = false)
    private CashBalanceAvailabilityDate1 dt;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;

    public CashBalanceAvailability2() {
    }

    public CashBalanceAvailabilityDate1 getDt() {
        return dt;
    }

    public void setDt(CashBalanceAvailabilityDate1 dt) {
        this.dt = dt;
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

}
