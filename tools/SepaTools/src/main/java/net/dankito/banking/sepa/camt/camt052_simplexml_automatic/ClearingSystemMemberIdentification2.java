
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ClearingSystemMemberIdentification2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ClearingSystemMemberIdentification2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ClearingSystemMemberIdentification2 {

    @Element(name = "ClrSysId", required = false)
    private ClearingSystemIdentification2Choice clrSysId;
    @Element(name = "MmbId", required = false)
    private String mmbId;

    public ClearingSystemMemberIdentification2() {
    }

    public ClearingSystemIdentification2Choice getClrSysId() {
        return clrSysId;
    }

    public void setClrSysId(ClearingSystemIdentification2Choice clrSysId) {
        this.clrSysId = clrSysId;
    }

    public String getMmbId() {
        return mmbId;
    }

    public void setMmbId(String mmbId) {
        this.mmbId = mmbId;
    }

}
