
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TaxRecord1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TaxRecord1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TaxRecord1 {

    @Element(name = "Tp", required = false)
    private String tp;
    @Element(name = "Ctgy", required = false)
    private String ctgy;
    @Element(name = "CtgyDtls", required = false)
    private String ctgyDtls;
    @Element(name = "DbtrSts", required = false)
    private String dbtrSts;
    @Element(name = "CertId", required = false)
    private String certId;
    @Element(name = "FrmsCd", required = false)
    private String frmsCd;
    @Element(name = "Prd", required = false)
    private TaxPeriod1 prd;
    @Element(name = "TaxAmt", required = false)
    private TaxAmount1 taxAmt;
    @Element(name = "AddtlInf", required = false)
    private String addtlInf;

    public TaxRecord1() {
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getCtgy() {
        return ctgy;
    }

    public void setCtgy(String ctgy) {
        this.ctgy = ctgy;
    }

    public String getCtgyDtls() {
        return ctgyDtls;
    }

    public void setCtgyDtls(String ctgyDtls) {
        this.ctgyDtls = ctgyDtls;
    }

    public String getDbtrSts() {
        return dbtrSts;
    }

    public void setDbtrSts(String dbtrSts) {
        this.dbtrSts = dbtrSts;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getFrmsCd() {
        return frmsCd;
    }

    public void setFrmsCd(String frmsCd) {
        this.frmsCd = frmsCd;
    }

    public TaxPeriod1 getPrd() {
        return prd;
    }

    public void setPrd(TaxPeriod1 prd) {
        this.prd = prd;
    }

    public TaxAmount1 getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(TaxAmount1 taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getAddtlInf() {
        return addtlInf;
    }

    public void setAddtlInf(String addtlInf) {
        this.addtlInf = addtlInf;
    }

}
