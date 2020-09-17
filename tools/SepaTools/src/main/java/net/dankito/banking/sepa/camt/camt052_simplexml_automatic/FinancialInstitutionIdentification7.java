
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * FinancialInstitutionIdentification7 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FinancialInstitutionIdentification7")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class FinancialInstitutionIdentification7 {

    @Element(name = "BIC", required = false)
    private String bic;
    @Element(name = "ClrSysMmbId", required = false)
    private ClearingSystemMemberIdentification2 clrSysMmbId;
    @Element(name = "Nm", required = false)
    private String nm;
    @Element(name = "PstlAdr", required = false)
    private PostalAddress6 pstlAdr;
    @Element(name = "Othr", required = false)
    private GenericFinancialIdentification1 othr;

    public FinancialInstitutionIdentification7() {
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public ClearingSystemMemberIdentification2 getClrSysMmbId() {
        return clrSysMmbId;
    }

    public void setClrSysMmbId(ClearingSystemMemberIdentification2 clrSysMmbId) {
        this.clrSysMmbId = clrSysMmbId;
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

    public GenericFinancialIdentification1 getOthr() {
        return othr;
    }

    public void setOthr(GenericFinancialIdentification1 othr) {
        this.othr = othr;
    }

}
