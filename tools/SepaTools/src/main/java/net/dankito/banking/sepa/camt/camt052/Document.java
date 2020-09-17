
package net.dankito.banking.sepa.camt.camt052;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BkToCstmrAcctRpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}BankToCustomerAccountReportV02"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", propOrder = {
    "bkToCstmrAcctRpt"
})
public class Document {

    @XmlElement(name = "BkToCstmrAcctRpt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", required = true)
    protected BankToCustomerAccountReportV02 bkToCstmrAcctRpt;

    /**
     * Gets the value of the bkToCstmrAcctRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerAccountReportV02 }
     *     
     */
    public BankToCustomerAccountReportV02 getBkToCstmrAcctRpt() {
        return bkToCstmrAcctRpt;
    }

    /**
     * Sets the value of the bkToCstmrAcctRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerAccountReportV02 }
     *     
     */
    public void setBkToCstmrAcctRpt(BankToCustomerAccountReportV02 value) {
        this.bkToCstmrAcctRpt = value;
    }

}
