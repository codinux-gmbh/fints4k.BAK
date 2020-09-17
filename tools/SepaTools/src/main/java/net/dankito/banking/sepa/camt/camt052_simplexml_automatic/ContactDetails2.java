
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ContactDetails2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ContactDetails2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ContactDetails2 {

    @Element(name = "NmPrfx", required = false)
    private NamePrefix1Code nmPrfx;
    @Element(name = "Nm", required = false)
    private String nm;
    @Element(name = "PhneNb", required = false)
    private String phneNb;
    @Element(name = "MobNb", required = false)
    private String mobNb;
    @Element(name = "FaxNb", required = false)
    private String faxNb;
    @Element(name = "EmailAdr", required = false)
    private String emailAdr;
    @Element(name = "Othr", required = false)
    private String othr;

    public ContactDetails2() {
    }

    public NamePrefix1Code getNmPrfx() {
        return nmPrfx;
    }

    public void setNmPrfx(NamePrefix1Code nmPrfx) {
        this.nmPrfx = nmPrfx;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getPhneNb() {
        return phneNb;
    }

    public void setPhneNb(String phneNb) {
        this.phneNb = phneNb;
    }

    public String getMobNb() {
        return mobNb;
    }

    public void setMobNb(String mobNb) {
        this.mobNb = mobNb;
    }

    public String getFaxNb() {
        return faxNb;
    }

    public void setFaxNb(String faxNb) {
        this.faxNb = faxNb;
    }

    public String getEmailAdr() {
        return emailAdr;
    }

    public void setEmailAdr(String emailAdr) {
        this.emailAdr = emailAdr;
    }

    public String getOthr() {
        return othr;
    }

    public void setOthr(String othr) {
        this.othr = othr;
    }

}
