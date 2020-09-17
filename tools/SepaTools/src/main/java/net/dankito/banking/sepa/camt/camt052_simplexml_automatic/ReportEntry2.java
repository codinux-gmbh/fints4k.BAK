
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ReportEntry2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ReportEntry2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ReportEntry2 {

    @Element(name = "NtryRef", required = false)
    private String ntryRef;
    @Element(name = "Amt", required = false)
    private ActiveOrHistoricCurrencyAndAmount amt;
    @Element(name = "CdtDbtInd", required = false)
    private CreditDebitCode cdtDbtInd;
    @Element(name = "RvslInd", required = false)
    private String rvslInd;
    @Element(name = "Sts", required = false)
    private EntryStatus2Code sts;
    @Element(name = "BookgDt", required = false)
    private DateAndDateTimeChoice bookgDt;
    @Element(name = "ValDt", required = false)
    private DateAndDateTimeChoice valDt;
    @Element(name = "AcctSvcrRef", required = false)
    private String acctSvcrRef;
    @Element(name = "Avlbty", required = false)
    private CashBalanceAvailability2 avlbty;
    @Element(name = "BkTxCd", required = false)
    private BankTransactionCodeStructure4 bkTxCd;
    @Element(name = "ComssnWvrInd", required = false)
    private String comssnWvrInd;
    @Element(name = "AddtlInfInd", required = false)
    private MessageIdentification2 addtlInfInd;
    @Element(name = "AmtDtls", required = false)
    private AmountAndCurrencyExchange3 amtDtls;
    @Element(name = "Chrgs", required = false)
    private ChargesInformation6 chrgs;
    @Element(name = "TechInptChanl", required = false)
    private TechnicalInputChannel1Choice techInptChanl;
    @Element(name = "Intrst", required = false)
    private TransactionInterest2 intrst;
    @Element(name = "NtryDtls", required = false)
    private EntryDetails1 ntryDtls;
    @Element(name = "AddtlNtryInf", required = false)
    private String addtlNtryInf;

    public ReportEntry2() {
    }

    public String getNtryRef() {
        return ntryRef;
    }

    public void setNtryRef(String ntryRef) {
        this.ntryRef = ntryRef;
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

    public String getRvslInd() {
        return rvslInd;
    }

    public void setRvslInd(String rvslInd) {
        this.rvslInd = rvslInd;
    }

    public EntryStatus2Code getSts() {
        return sts;
    }

    public void setSts(EntryStatus2Code sts) {
        this.sts = sts;
    }

    public DateAndDateTimeChoice getBookgDt() {
        return bookgDt;
    }

    public void setBookgDt(DateAndDateTimeChoice bookgDt) {
        this.bookgDt = bookgDt;
    }

    public DateAndDateTimeChoice getValDt() {
        return valDt;
    }

    public void setValDt(DateAndDateTimeChoice valDt) {
        this.valDt = valDt;
    }

    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    public void setAcctSvcrRef(String acctSvcrRef) {
        this.acctSvcrRef = acctSvcrRef;
    }

    public CashBalanceAvailability2 getAvlbty() {
        return avlbty;
    }

    public void setAvlbty(CashBalanceAvailability2 avlbty) {
        this.avlbty = avlbty;
    }

    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    public void setBkTxCd(BankTransactionCodeStructure4 bkTxCd) {
        this.bkTxCd = bkTxCd;
    }

    public String getComssnWvrInd() {
        return comssnWvrInd;
    }

    public void setComssnWvrInd(String comssnWvrInd) {
        this.comssnWvrInd = comssnWvrInd;
    }

    public MessageIdentification2 getAddtlInfInd() {
        return addtlInfInd;
    }

    public void setAddtlInfInd(MessageIdentification2 addtlInfInd) {
        this.addtlInfInd = addtlInfInd;
    }

    public AmountAndCurrencyExchange3 getAmtDtls() {
        return amtDtls;
    }

    public void setAmtDtls(AmountAndCurrencyExchange3 amtDtls) {
        this.amtDtls = amtDtls;
    }

    public ChargesInformation6 getChrgs() {
        return chrgs;
    }

    public void setChrgs(ChargesInformation6 chrgs) {
        this.chrgs = chrgs;
    }

    public TechnicalInputChannel1Choice getTechInptChanl() {
        return techInptChanl;
    }

    public void setTechInptChanl(TechnicalInputChannel1Choice techInptChanl) {
        this.techInptChanl = techInptChanl;
    }

    public TransactionInterest2 getIntrst() {
        return intrst;
    }

    public void setIntrst(TransactionInterest2 intrst) {
        this.intrst = intrst;
    }

    public EntryDetails1 getNtryDtls() {
        return ntryDtls;
    }

    public void setNtryDtls(EntryDetails1 ntryDtls) {
        this.ntryDtls = ntryDtls;
    }

    public String getAddtlNtryInf() {
        return addtlNtryInf;
    }

    public void setAddtlNtryInf(String addtlNtryInf) {
        this.addtlNtryInf = addtlNtryInf;
    }

}
