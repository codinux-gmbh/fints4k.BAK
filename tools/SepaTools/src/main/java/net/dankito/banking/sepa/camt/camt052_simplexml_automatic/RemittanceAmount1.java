
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RemittanceAmount1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RemittanceAmount1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class RemittanceAmount1 {

    @Element(name = "DuePyblAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount duePyblAmt;
    @Element(name = "DscntApldAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount dscntApldAmt;
    @Element(name = "CdtNoteAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount cdtNoteAmt;
    @Element(name = "TaxAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount taxAmt;
    @Element(name = "AdjstmntAmtAndRsn", required = false)
    private DocumentAdjustment1 adjstmntAmtAndRsn;
    @Element(name = "RmtdAmt", required = false)
    private ActiveOrHistoricCurrencyAndAmount rmtdAmt;

    public RemittanceAmount1() {
    }

    public ActiveOrHistoricCurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    public void setDuePyblAmt(ActiveOrHistoricCurrencyAndAmount duePyblAmt) {
        this.duePyblAmt = duePyblAmt;
    }

    public ActiveOrHistoricCurrencyAndAmount getDscntApldAmt() {
        return dscntApldAmt;
    }

    public void setDscntApldAmt(ActiveOrHistoricCurrencyAndAmount dscntApldAmt) {
        this.dscntApldAmt = dscntApldAmt;
    }

    public ActiveOrHistoricCurrencyAndAmount getCdtNoteAmt() {
        return cdtNoteAmt;
    }

    public void setCdtNoteAmt(ActiveOrHistoricCurrencyAndAmount cdtNoteAmt) {
        this.cdtNoteAmt = cdtNoteAmt;
    }

    public ActiveOrHistoricCurrencyAndAmount getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(ActiveOrHistoricCurrencyAndAmount taxAmt) {
        this.taxAmt = taxAmt;
    }

    public DocumentAdjustment1 getAdjstmntAmtAndRsn() {
        return adjstmntAmtAndRsn;
    }

    public void setAdjstmntAmtAndRsn(DocumentAdjustment1 adjstmntAmtAndRsn) {
        this.adjstmntAmtAndRsn = adjstmntAmtAndRsn;
    }

    public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    public void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount rmtdAmt) {
        this.rmtdAmt = rmtdAmt;
    }

}
