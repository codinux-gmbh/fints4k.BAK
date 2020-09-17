
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CashAccount16 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CashAccount16")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class CashAccount16 {

    @Element(name = "Id", required = false)
    private AccountIdentification4Choice id;
    @Element(name = "Tp", required = false)
    private CashAccountType2 tp;
    @Element(name = "Ccy", required = false)
    private String ccy;
    @Element(name = "Nm", required = false)
    private String nm;

    public CashAccount16() {
    }

    public AccountIdentification4Choice getId() {
        return id;
    }

    public void setId(AccountIdentification4Choice id) {
        this.id = id;
    }

    public CashAccountType2 getTp() {
        return tp;
    }

    public void setTp(CashAccountType2 tp) {
        this.tp = tp;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

}
