
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TaxInformation3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TaxInformation3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TaxInformation3 {

    @Element(name = "Cdtr", required = false)
    private TaxParty1 cdtr;
    @Element(name = "Dbtr", required = false)
    private TaxParty2 dbtr;
    @Element(name = "AdmstnZn", required = false)
    private String admstnZn;
    @Element(name = "RefNb", required = false)
    private String refNb;
    @Element(name = "Mtd", required = false)
    private String mtd;
    @Element(name = "TtlTaxblBaseAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @Element(name = "TtlTaxAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @Element(name = "Dt", required = false)
    private String dt;
    @Element(name = "SeqNb", required = false)
    private String seqNb;
    @Element(name = "Rcrd", required = false)
    private TaxRecord1 rcrd;

    public TaxInformation3() {
    }

    public TaxParty1 getCdtr() {
        return cdtr;
    }

    public void setCdtr(TaxParty1 cdtr) {
        this.cdtr = cdtr;
    }

    public TaxParty2 getDbtr() {
        return dbtr;
    }

    public void setDbtr(TaxParty2 dbtr) {
        this.dbtr = dbtr;
    }

    public String getAdmstnZn() {
        return admstnZn;
    }

    public void setAdmstnZn(String admstnZn) {
        this.admstnZn = admstnZn;
    }

    public String getRefNb() {
        return refNb;
    }

    public void setRefNb(String refNb) {
        this.refNb = refNb;
    }

    public String getMtd() {
        return mtd;
    }

    public void setMtd(String mtd) {
        this.mtd = mtd;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt) {
        this.ttlTaxblBaseAmt = ttlTaxblBaseAmt;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount ttlTaxAmt) {
        this.ttlTaxAmt = ttlTaxAmt;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getSeqNb() {
        return seqNb;
    }

    public void setSeqNb(String seqNb) {
        this.seqNb = seqNb;
    }

    public TaxRecord1 getRcrd() {
        return rcrd;
    }

    public void setRcrd(TaxRecord1 rcrd) {
        this.rcrd = rcrd;
    }

}
