
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * PostalAddress6 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "PostalAddress6")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class PostalAddress6 {

    @Element(name = "AdrTp", required = false)
    private AddressType2Code adrTp;
    @Element(name = "Dept", required = false)
    private String dept;
    @Element(name = "SubDept", required = false)
    private String subDept;
    @Element(name = "StrtNm", required = false)
    private String strtNm;
    @Element(name = "BldgNb", required = false)
    private String bldgNb;
    @Element(name = "PstCd", required = false)
    private String pstCd;
    @Element(name = "TwnNm", required = false)
    private String twnNm;
    @Element(name = "CtrySubDvsn", required = false)
    private String ctrySubDvsn;
    @Element(name = "Ctry", required = false)
    private String ctry;
    @Element(name = "AdrLine", required = false)
    private String adrLine;

    public PostalAddress6() {
    }

    public AddressType2Code getAdrTp() {
        return adrTp;
    }

    public void setAdrTp(AddressType2Code adrTp) {
        this.adrTp = adrTp;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String subDept) {
        this.subDept = subDept;
    }

    public String getStrtNm() {
        return strtNm;
    }

    public void setStrtNm(String strtNm) {
        this.strtNm = strtNm;
    }

    public String getBldgNb() {
        return bldgNb;
    }

    public void setBldgNb(String bldgNb) {
        this.bldgNb = bldgNb;
    }

    public String getPstCd() {
        return pstCd;
    }

    public void setPstCd(String pstCd) {
        this.pstCd = pstCd;
    }

    public String getTwnNm() {
        return twnNm;
    }

    public void setTwnNm(String twnNm) {
        this.twnNm = twnNm;
    }

    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    public void setCtrySubDvsn(String ctrySubDvsn) {
        this.ctrySubDvsn = ctrySubDvsn;
    }

    public String getCtry() {
        return ctry;
    }

    public void setCtry(String ctry) {
        this.ctry = ctry;
    }

    public String getAdrLine() {
        return adrLine;
    }

    public void setAdrLine(String adrLine) {
        this.adrLine = adrLine;
    }

}
