
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DateAndPlaceOfBirth<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DateAndPlaceOfBirth")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class DateAndPlaceOfBirth {

    @Element(name = "BirthDt", required = false)
    private String birthDt;
    @Element(name = "PrvcOfBirth", required = false)
    private String prvcOfBirth;
    @Element(name = "CityOfBirth", required = false)
    private String cityOfBirth;
    @Element(name = "CtryOfBirth", required = false)
    private String ctryOfBirth;

    public DateAndPlaceOfBirth() {
    }

    public String getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(String birthDt) {
        this.birthDt = birthDt;
    }

    public String getPrvcOfBirth() {
        return prvcOfBirth;
    }

    public void setPrvcOfBirth(String prvcOfBirth) {
        this.prvcOfBirth = prvcOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    public void setCtryOfBirth(String ctryOfBirth) {
        this.ctryOfBirth = ctryOfBirth;
    }

}
