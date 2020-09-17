
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * EntryDetails1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "EntryDetails1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class EntryDetails1 {

    @Element(name = "Btch", required = false)
    private BatchInformation2 btch;
    @Element(name = "TxDtls", required = false)
    private EntryTransaction2 txDtls;

    public EntryDetails1() {
    }

    public BatchInformation2 getBtch() {
        return btch;
    }

    public void setBtch(BatchInformation2 btch) {
        this.btch = btch;
    }

    public EntryTransaction2 getTxDtls() {
        return txDtls;
    }

    public void setTxDtls(EntryTransaction2 txDtls) {
        this.txDtls = txDtls;
    }

}
