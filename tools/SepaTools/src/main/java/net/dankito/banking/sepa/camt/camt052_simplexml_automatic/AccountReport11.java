
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AccountReport11 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AccountReport11")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AccountReport11 {

    @Element(name = "Id", required = false)
    private String id;
    @Element(name = "ElctrncSeqNb", required = false)
    private String elctrncSeqNb;
    @Element(name = "LglSeqNb", required = false)
    private String lglSeqNb;
    @Element(name = "CreDtTm", required = false)
    private String creDtTm;
    @Element(name = "FrToDt", required = false)
    private DateTimePeriodDetails frToDt;
    @Element(name = "CpyDplctInd", required = false)
    private CopyDuplicate1Code cpyDplctInd;
    @Element(name = "RptgSrc", required = false)
    private ReportingSource1Choice rptgSrc;
    @Element(name = "Acct", required = false)
    private CashAccount20 acct;
    @Element(name = "RltdAcct", required = false)
    private CashAccount16 rltdAcct;
    @Element(name = "Intrst", required = false)
    private AccountInterest2 intrst;
    @Element(name = "Bal", required = false)
    public CashBalance3 bal;
    @Element(name = "TxsSummry", required = false)
    private TotalTransactions2 txsSummry;
    @Element(name = "Ntry", required = false)
    private ReportEntry2 ntry;
    @Element(name = "AddtlRptInf", required = false)
    private String addtlRptInf;

    public AccountReport11() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getElctrncSeqNb() {
        return elctrncSeqNb;
    }

    public void setElctrncSeqNb(String elctrncSeqNb) {
        this.elctrncSeqNb = elctrncSeqNb;
    }

    public String getLglSeqNb() {
        return lglSeqNb;
    }

    public void setLglSeqNb(String lglSeqNb) {
        this.lglSeqNb = lglSeqNb;
    }

    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
    }

    public DateTimePeriodDetails getFrToDt() {
        return frToDt;
    }

    public void setFrToDt(DateTimePeriodDetails frToDt) {
        this.frToDt = frToDt;
    }

    public CopyDuplicate1Code getCpyDplctInd() {
        return cpyDplctInd;
    }

    public void setCpyDplctInd(CopyDuplicate1Code cpyDplctInd) {
        this.cpyDplctInd = cpyDplctInd;
    }

    public ReportingSource1Choice getRptgSrc() {
        return rptgSrc;
    }

    public void setRptgSrc(ReportingSource1Choice rptgSrc) {
        this.rptgSrc = rptgSrc;
    }

    public CashAccount20 getAcct() {
        return acct;
    }

    public void setAcct(CashAccount20 acct) {
        this.acct = acct;
    }

    public CashAccount16 getRltdAcct() {
        return rltdAcct;
    }

    public void setRltdAcct(CashAccount16 rltdAcct) {
        this.rltdAcct = rltdAcct;
    }

    public AccountInterest2 getIntrst() {
        return intrst;
    }

    public void setIntrst(AccountInterest2 intrst) {
        this.intrst = intrst;
    }

//    public CashBalance3 getBal() {
//        return bal;
//    }
//
//    public void setBal(CashBalance3 bal) {
//        this.bal = bal;
//    }

    public TotalTransactions2 getTxsSummry() {
        return txsSummry;
    }

    public void setTxsSummry(TotalTransactions2 txsSummry) {
        this.txsSummry = txsSummry;
    }

    public ReportEntry2 getNtry() {
        return ntry;
    }

    public void setNtry(ReportEntry2 ntry) {
        this.ntry = ntry;
    }

    public String getAddtlRptInf() {
        return addtlRptInf;
    }

    public void setAddtlRptInf(String addtlRptInf) {
        this.addtlRptInf = addtlRptInf;
    }

}
