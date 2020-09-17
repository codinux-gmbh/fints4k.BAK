
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AccountInterest2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AccountInterest2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class AccountInterest2 {

    @Element(name = "Tp", required = false)
    private InterestType1Choice tp;
    @Element(name = "Rate", required = false)
    private Rate3 rate;
    @Element(name = "FrToDt", required = false)
    private DateTimePeriodDetails frToDt;
    @Element(name = "Rsn", required = false)
    private String rsn;

    public AccountInterest2() {
    }

    public InterestType1Choice getTp() {
        return tp;
    }

    public void setTp(InterestType1Choice tp) {
        this.tp = tp;
    }

    public Rate3 getRate() {
        return rate;
    }

    public void setRate(Rate3 rate) {
        this.rate = rate;
    }

    public DateTimePeriodDetails getFrToDt() {
        return frToDt;
    }

    public void setFrToDt(DateTimePeriodDetails frToDt) {
        this.frToDt = frToDt;
    }

    public String getRsn() {
        return rsn;
    }

    public void setRsn(String rsn) {
        this.rsn = rsn;
    }

}
