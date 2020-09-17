
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * PartyIdentification32 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "PartyIdentification32")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class PartyIdentification32 {

    @Element(name = "Nm", required = false)
    private String nm;
    @Element(name = "PstlAdr", required = false)
    private PostalAddress6 pstlAdr;
    @Element(name = "Id", required = false)
    private Party6Choice id;
    @Element(name = "CtryOfRes", required = false)
    private String ctryOfRes;
    @Element(name = "CtctDtls", required = false)
    private ContactDetails2 ctctDtls;

    public PartyIdentification32() {
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public PostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    public void setPstlAdr(PostalAddress6 pstlAdr) {
        this.pstlAdr = pstlAdr;
    }

    public Party6Choice getId() {
        return id;
    }

    public void setId(Party6Choice id) {
        this.id = id;
    }

    public String getCtryOfRes() {
        return ctryOfRes;
    }

    public void setCtryOfRes(String ctryOfRes) {
        this.ctryOfRes = ctryOfRes;
    }

    public ContactDetails2 getCtctDtls() {
        return ctctDtls;
    }

    public void setCtctDtls(ContactDetails2 ctctDtls) {
        this.ctctDtls = ctctDtls;
    }

}
