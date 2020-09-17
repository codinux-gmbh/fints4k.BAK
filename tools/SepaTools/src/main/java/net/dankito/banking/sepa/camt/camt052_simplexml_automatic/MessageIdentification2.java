
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * MessageIdentification2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "MessageIdentification2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class MessageIdentification2 {

    @Element(name = "MsgNmId", required = false)
    private String msgNmId;
    @Element(name = "MsgId", required = false)
    private String msgId;

    public MessageIdentification2() {
    }

    public String getMsgNmId() {
        return msgNmId;
    }

    public void setMsgNmId(String msgNmId) {
        this.msgNmId = msgNmId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

}
