
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ProprietaryParty2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ProprietaryParty2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ProprietaryParty2 {

    @Element(name = "Tp", required = false)
    private String tp;
    @Element(name = "Pty", required = false)
    private PartyIdentification32 pty;

    public ProprietaryParty2() {
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public PartyIdentification32 getPty() {
        return pty;
    }

    public void setPty(PartyIdentification32 pty) {
        this.pty = pty;
    }

}
