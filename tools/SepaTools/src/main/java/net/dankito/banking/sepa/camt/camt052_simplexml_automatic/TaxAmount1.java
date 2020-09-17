
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TaxAmount1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TaxAmount1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TaxAmount1 {

    @Element(name = "Rate", required = false)
    private String rate;
    @Element(name = "TaxblBaseAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;
    @Element(name = "TtlAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @Element(name = "Dtls", required = false)
    private TaxRecordDetails1 dtls;

    public TaxAmount1() {
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    public void setTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount taxblBaseAmt) {
        this.taxblBaseAmt = taxblBaseAmt;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount ttlAmt) {
        this.ttlAmt = ttlAmt;
    }

    public TaxRecordDetails1 getDtls() {
        return dtls;
    }

    public void setDtls(TaxRecordDetails1 dtls) {
        this.dtls = dtls;
    }

}
