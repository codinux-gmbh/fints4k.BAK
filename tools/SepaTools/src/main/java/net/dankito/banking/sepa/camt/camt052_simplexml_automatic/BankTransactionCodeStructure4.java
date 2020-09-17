
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BankTransactionCodeStructure4 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BankTransactionCodeStructure4")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BankTransactionCodeStructure4 {

    @Element(name = "Domn", required = false)
    private BankTransactionCodeStructure5 domn;
    @Element(name = "Prtry", required = false)
    private ProprietaryBankTransactionCodeStructure1 prtry;

    public BankTransactionCodeStructure4() {
    }

    public BankTransactionCodeStructure5 getDomn() {
        return domn;
    }

    public void setDomn(BankTransactionCodeStructure5 domn) {
        this.domn = domn;
    }

    public ProprietaryBankTransactionCodeStructure1 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryBankTransactionCodeStructure1 prtry) {
        this.prtry = prtry;
    }

}
