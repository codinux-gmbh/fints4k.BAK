
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * EntryTransaction2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "EntryTransaction2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class EntryTransaction2 {

    @Element(name = "Refs", required = false)
    private TransactionReferences2 refs;
    @Element(name = "AmtDtls", required = false)
    private AmountAndCurrencyExchange3 amtDtls;
    @Element(name = "Avlbty", required = false)
    private CashBalanceAvailability2 avlbty;
    @Element(name = "BkTxCd", required = false)
    private BankTransactionCodeStructure4 bkTxCd;
    @Element(name = "Chrgs", required = false)
    private ChargesInformation6 chrgs;
    @Element(name = "Intrst", required = false)
    private TransactionInterest2 intrst;
    @Element(name = "RltdPties", required = false)
    private TransactionParty2 rltdPties;
    @Element(name = "RltdAgts", required = false)
    private TransactionAgents2 rltdAgts;
    @Element(name = "Purp", required = false)
    private Purpose2Choice purp;
    @Element(name = "RltdRmtInf", required = false)
    private RemittanceLocation2 rltdRmtInf;
    @Element(name = "RmtInf", required = false)
    private RemittanceInformation5 rmtInf;
    @Element(name = "RltdDts", required = false)
    private TransactionDates2 rltdDts;
    @Element(name = "RltdPric", required = false)
    private TransactionPrice2Choice rltdPric;
    @Element(name = "RltdQties", required = false)
    private TransactionQuantities1Choice rltdQties;
    @Element(name = "FinInstrmId", required = false)
    private SecurityIdentification4Choice finInstrmId;
    @Element(name = "Tax", required = false)
    private TaxInformation3 tax;
    @Element(name = "RtrInf", required = false)
    private ReturnReasonInformation10 rtrInf;
    @Element(name = "CorpActn", required = false)
    private CorporateAction1 corpActn;
    @Element(name = "SfkpgAcct", required = false)
    private CashAccount16 sfkpgAcct;
    @Element(name = "AddtlTxInf", required = false)
    private String addtlTxInf;

    public EntryTransaction2() {
    }

    public TransactionReferences2 getRefs() {
        return refs;
    }

    public void setRefs(TransactionReferences2 refs) {
        this.refs = refs;
    }

    public AmountAndCurrencyExchange3 getAmtDtls() {
        return amtDtls;
    }

    public void setAmtDtls(AmountAndCurrencyExchange3 amtDtls) {
        this.amtDtls = amtDtls;
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

    public ChargesInformation6 getChrgs() {
        return chrgs;
    }

    public void setChrgs(ChargesInformation6 chrgs) {
        this.chrgs = chrgs;
    }

    public TransactionInterest2 getIntrst() {
        return intrst;
    }

    public void setIntrst(TransactionInterest2 intrst) {
        this.intrst = intrst;
    }

    public TransactionParty2 getRltdPties() {
        return rltdPties;
    }

    public void setRltdPties(TransactionParty2 rltdPties) {
        this.rltdPties = rltdPties;
    }

    public TransactionAgents2 getRltdAgts() {
        return rltdAgts;
    }

    public void setRltdAgts(TransactionAgents2 rltdAgts) {
        this.rltdAgts = rltdAgts;
    }

    public Purpose2Choice getPurp() {
        return purp;
    }

    public void setPurp(Purpose2Choice purp) {
        this.purp = purp;
    }

    public RemittanceLocation2 getRltdRmtInf() {
        return rltdRmtInf;
    }

    public void setRltdRmtInf(RemittanceLocation2 rltdRmtInf) {
        this.rltdRmtInf = rltdRmtInf;
    }

    public RemittanceInformation5 getRmtInf() {
        return rmtInf;
    }

    public void setRmtInf(RemittanceInformation5 rmtInf) {
        this.rmtInf = rmtInf;
    }

    public TransactionDates2 getRltdDts() {
        return rltdDts;
    }

    public void setRltdDts(TransactionDates2 rltdDts) {
        this.rltdDts = rltdDts;
    }

    public TransactionPrice2Choice getRltdPric() {
        return rltdPric;
    }

    public void setRltdPric(TransactionPrice2Choice rltdPric) {
        this.rltdPric = rltdPric;
    }

    public TransactionQuantities1Choice getRltdQties() {
        return rltdQties;
    }

    public void setRltdQties(TransactionQuantities1Choice rltdQties) {
        this.rltdQties = rltdQties;
    }

    public SecurityIdentification4Choice getFinInstrmId() {
        return finInstrmId;
    }

    public void setFinInstrmId(SecurityIdentification4Choice finInstrmId) {
        this.finInstrmId = finInstrmId;
    }

    public TaxInformation3 getTax() {
        return tax;
    }

    public void setTax(TaxInformation3 tax) {
        this.tax = tax;
    }

    public ReturnReasonInformation10 getRtrInf() {
        return rtrInf;
    }

    public void setRtrInf(ReturnReasonInformation10 rtrInf) {
        this.rtrInf = rtrInf;
    }

    public CorporateAction1 getCorpActn() {
        return corpActn;
    }

    public void setCorpActn(CorporateAction1 corpActn) {
        this.corpActn = corpActn;
    }

    public CashAccount16 getSfkpgAcct() {
        return sfkpgAcct;
    }

    public void setSfkpgAcct(CashAccount16 sfkpgAcct) {
        this.sfkpgAcct = sfkpgAcct;
    }

    public String getAddtlTxInf() {
        return addtlTxInf;
    }

    public void setAddtlTxInf(String addtlTxInf) {
        this.addtlTxInf = addtlTxInf;
    }

}
