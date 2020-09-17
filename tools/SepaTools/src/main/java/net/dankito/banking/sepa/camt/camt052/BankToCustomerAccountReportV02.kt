package net.dankito.banking.sepa.camt.camt052

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for BankToCustomerAccountReportV02 complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BankToCustomerAccountReportV02">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}GroupHeader42"/>
 * &lt;element name="Rpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}AccountReport11" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankToCustomerAccountReportV02", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", propOrder = ["grpHdr", "rpt"])
class BankToCustomerAccountReportV02 {
    /**
     * Gets the value of the grpHdr property.
     *
     * @return
     * possible object is
     * [GroupHeader42]
     */
    /**
     * Sets the value of the grpHdr property.
     *
     * @param value
     * allowed object is
     * [GroupHeader42]
     */
    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", required = true)
    var grpHdr: GroupHeader42? = null

    /**
     * Gets the value of the rpt property.
     *
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpt property.
     *
     *
     *
     * For example, to add a new item, do as follows:
     * <pre>
     * getRpt().add(newItem);
    </pre> *
     *
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * [AccountReport11]
     *
     *
     */
//    @XmlElement(name = "Rpt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", required = true)
    var rpt: List<AccountReport11> = listOf()

}