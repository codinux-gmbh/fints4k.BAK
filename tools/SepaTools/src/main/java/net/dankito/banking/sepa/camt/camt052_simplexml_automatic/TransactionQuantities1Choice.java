
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionQuantities1Choice<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionQuantities1Choice")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionQuantities1Choice {

    @Element(name = "Qty", required = false)
    private FinancialInstrumentQuantityChoice qty;
    @Element(name = "Prtry", required = false)
    private ProprietaryQuantity1 prtry;

    public TransactionQuantities1Choice() {
    }

    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    public void setQty(FinancialInstrumentQuantityChoice qty) {
        this.qty = qty;
    }

    public ProprietaryQuantity1 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryQuantity1 prtry) {
        this.prtry = prtry;
    }

}
