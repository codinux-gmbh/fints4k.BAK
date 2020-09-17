
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * GenericIdentification3 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "GenericIdentification3")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class GenericIdentification3 {

    @Element(name = "Id", required = false)
    private String id;
    @Element(name = "Issr", required = false)
    private String issr;

    public GenericIdentification3() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String issr) {
        this.issr = issr;
    }

}
