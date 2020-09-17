
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Pagination<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Pagination")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class Pagination {

    @Element(name = "PgNb", required = false)
    private String pgNb;
    @Element(name = "LastPgInd", required = false)
    private String lastPgInd;

    public Pagination() {
    }

    public String getPgNb() {
        return pgNb;
    }

    public void setPgNb(String pgNb) {
        this.pgNb = pgNb;
    }

    public String getLastPgInd() {
        return lastPgInd;
    }

    public void setLastPgInd(String lastPgInd) {
        this.lastPgInd = lastPgInd;
    }

}
