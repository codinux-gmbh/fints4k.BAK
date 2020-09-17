
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * NameAndAddress10 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "NameAndAddress10")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class NameAndAddress10 {

    @Element(name = "Nm", required = false)
    private String nm;
    @Element(name = "Adr", required = false)
    private PostalAddress6 adr;

    public NameAndAddress10() {
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public PostalAddress6 getAdr() {
        return adr;
    }

    public void setAdr(PostalAddress6 adr) {
        this.adr = adr;
    }

}
