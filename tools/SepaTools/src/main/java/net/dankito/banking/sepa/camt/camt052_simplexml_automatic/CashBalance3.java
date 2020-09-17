
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CashBalance3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CashBalance3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CashBalance3 {

    @Element(name = "Tp", required = false)
    private BalanceType12 tp;
    @Element(name = "CdtLine", required = false)
    private CreditLine2 cdtLine;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;
    @Element(name = "Dt", required = false)
    private DateAndDateTimeChoice dt;
    @Element(name = "Avlbty", required = false)
    private CashBalanceAvailability2 avlbty;

    public CashBalance3() {
    }

    public BalanceType12 getTp() {
        return tp;
    }

    public void setTp(BalanceType12 tp) {
        this.tp = tp;
    }

    public CreditLine2 getCdtLine() {
        return cdtLine;
    }

    public void setCdtLine(CreditLine2 cdtLine) {
        this.cdtLine = cdtLine;
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

    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    public void setDt(DateAndDateTimeChoice dt) {
        this.dt = dt;
    }

    public CashBalanceAvailability2 getAvlbty() {
        return avlbty;
    }

    public void setAvlbty(CashBalanceAvailability2 avlbty) {
        this.avlbty = avlbty;
    }

}
