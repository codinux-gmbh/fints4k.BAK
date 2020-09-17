
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * NumberAndSumOfTransactions1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "NumberAndSumOfTransactions1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class NumberAndSumOfTransactions1 {

    @Element(name = "NbOfNtries", required = false)
    private String nbOfNtries;
    @Element(name = "Sum", required = false)
    private String sum;

    public NumberAndSumOfTransactions1() {
    }

    public String getNbOfNtries() {
        return nbOfNtries;
    }

    public void setNbOfNtries(String nbOfNtries) {
        this.nbOfNtries = nbOfNtries;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

}
