
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CashBalanceAvailabilityDate1 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CashBalanceAvailabilityDate1")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CashBalanceAvailabilityDate1 {

    @Element(name = "NbOfDays", required = false)
    private String nbOfDays;
    @Element(name = "ActlDt", required = false)
    private String actlDt;

    public CashBalanceAvailabilityDate1() {
    }

    public String getNbOfDays() {
        return nbOfDays;
    }

    public void setNbOfDays(String nbOfDays) {
        this.nbOfDays = nbOfDays;
    }

    public String getActlDt() {
        return actlDt;
    }

    public void setActlDt(String actlDt) {
        this.actlDt = actlDt;
    }

}
