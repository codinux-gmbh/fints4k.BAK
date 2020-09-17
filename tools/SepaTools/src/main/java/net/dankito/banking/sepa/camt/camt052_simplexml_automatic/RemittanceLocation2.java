
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RemittanceLocation2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RemittanceLocation2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class RemittanceLocation2 {

    @Element(name = "RmtId", required = false)
    private String rmtId;
    @Element(name = "RmtLctnMtd", required = false)
    private RemittanceLocationMethod2Code rmtLctnMtd;
    @Element(name = "RmtLctnElctrncAdr", required = false)
    private String rmtLctnElctrncAdr;
    @Element(name = "RmtLctnPstlAdr", required = false)
    private NameAndAddress10 rmtLctnPstlAdr;

    public RemittanceLocation2() {
    }

    public String getRmtId() {
        return rmtId;
    }

    public void setRmtId(String rmtId) {
        this.rmtId = rmtId;
    }

    public RemittanceLocationMethod2Code getRmtLctnMtd() {
        return rmtLctnMtd;
    }

    public void setRmtLctnMtd(RemittanceLocationMethod2Code rmtLctnMtd) {
        this.rmtLctnMtd = rmtLctnMtd;
    }

    public String getRmtLctnElctrncAdr() {
        return rmtLctnElctrncAdr;
    }

    public void setRmtLctnElctrncAdr(String rmtLctnElctrncAdr) {
        this.rmtLctnElctrncAdr = rmtLctnElctrncAdr;
    }

    public NameAndAddress10 getRmtLctnPstlAdr() {
        return rmtLctnPstlAdr;
    }

    public void setRmtLctnPstlAdr(NameAndAddress10 rmtLctnPstlAdr) {
        this.rmtLctnPstlAdr = rmtLctnPstlAdr;
    }

}
