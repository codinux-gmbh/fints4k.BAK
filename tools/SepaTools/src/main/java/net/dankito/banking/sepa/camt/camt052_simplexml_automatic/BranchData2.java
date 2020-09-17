
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * BranchData2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "BranchData2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class BranchData2 {

    @Element(name = "Id", required = false)
    private String id;
    @Element(name = "Nm", required = false)
    private String nm;
    @Element(name = "PstlAdr", required = false)
    private PostalAddress6 pstlAdr;

    public BranchData2() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
