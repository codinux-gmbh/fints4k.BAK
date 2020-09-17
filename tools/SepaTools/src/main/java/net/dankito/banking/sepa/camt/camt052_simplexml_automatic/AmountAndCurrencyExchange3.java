
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AmountAndCurrencyExchange3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AmountAndCurrencyExchange3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AmountAndCurrencyExchange3 {

    @Element(name = "InstdAmt", required = false)
    private AmountAndCurrencyExchangeDetails3 instdAmt;
    @Element(name = "TxAmt", required = false)
    private AmountAndCurrencyExchangeDetails3 txAmt;
    @Element(name = "CntrValAmt", required = false)
    private AmountAndCurrencyExchangeDetails3 cntrValAmt;
    @Element(name = "AnncdPstngAmt", required = false)
    private AmountAndCurrencyExchangeDetails3 anncdPstngAmt;
    @Element(name = "PrtryAmt", required = false)
    private AmountAndCurrencyExchangeDetails4 prtryAmt;

    public AmountAndCurrencyExchange3() {
    }

    public AmountAndCurrencyExchangeDetails3 getInstdAmt() {
        return instdAmt;
    }

    public void setInstdAmt(AmountAndCurrencyExchangeDetails3 instdAmt) {
        this.instdAmt = instdAmt;
    }

    public AmountAndCurrencyExchangeDetails3 getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(AmountAndCurrencyExchangeDetails3 txAmt) {
        this.txAmt = txAmt;
    }

    public AmountAndCurrencyExchangeDetails3 getCntrValAmt() {
        return cntrValAmt;
    }

    public void setCntrValAmt(AmountAndCurrencyExchangeDetails3 cntrValAmt) {
        this.cntrValAmt = cntrValAmt;
    }

    public AmountAndCurrencyExchangeDetails3 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    public void setAnncdPstngAmt(AmountAndCurrencyExchangeDetails3 anncdPstngAmt) {
        this.anncdPstngAmt = anncdPstngAmt;
    }

    public AmountAndCurrencyExchangeDetails4 getPrtryAmt() {
        return prtryAmt;
    }

    public void setPrtryAmt(AmountAndCurrencyExchangeDetails4 prtryAmt) {
        this.prtryAmt = prtryAmt;
    }

}
