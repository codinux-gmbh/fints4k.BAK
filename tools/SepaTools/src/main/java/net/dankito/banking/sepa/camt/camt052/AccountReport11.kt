package net.dankito.banking.sepa.camt.camt052

import java.math.BigDecimal
import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for AccountReport11 complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccountReport11">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}Max35Text"/>
 * &lt;element name="ElctrncSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}Number" minOccurs="0"/>
 * &lt;element name="LglSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}Number" minOccurs="0"/>
 * &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}ISODateTime"/>
 * &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}DateTimePeriodDetails" minOccurs="0"/>
 * &lt;element name="CpyDplctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}CopyDuplicate1Code" minOccurs="0"/>
 * &lt;element name="RptgSrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}ReportingSource1Choice" minOccurs="0"/>
 * &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}CashAccount20"/>
 * &lt;element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}CashAccount16" minOccurs="0"/>
 * &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}AccountInterest2" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}CashBalance3" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}TotalTransactions2" minOccurs="0"/>
 * &lt;element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}ReportEntry2" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="AddtlRptInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}Max500Text" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport11", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", propOrder = ["id", "elctrncSeqNb", "lglSeqNb", "creDtTm", "frToDt", "cpyDplctInd", "rptgSrc", "acct", "rltdAcct", "intrst", "bal", "txsSummry", "ntry", "addtlRptInf"])
class AccountReport11 {
    /**
     * Gets the value of the id property.
     *
     * @return
     * possible object is
     * [String]
     */
    /**
     * Sets the value of the id property.
     *
     * @param value
     * allowed object is
     * [String]
     */
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", required = true)
    var id: String? = null
    /**
     * Gets the value of the elctrncSeqNb property.
     *
     * @return
     * possible object is
     * [BigDecimal]
     */
    /**
     * Sets the value of the elctrncSeqNb property.
     *
     * @param value
     * allowed object is
     * [BigDecimal]
     */
    @XmlElement(name = "ElctrncSeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var elctrncSeqNb: BigDecimal? = null
    /**
     * Gets the value of the lglSeqNb property.
     *
     * @return
     * possible object is
     * [BigDecimal]
     */
    /**
     * Sets the value of the lglSeqNb property.
     *
     * @param value
     * allowed object is
     * [BigDecimal]
     */
    @XmlElement(name = "LglSeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var lglSeqNb: BigDecimal? = null
    /**
     * Gets the value of the creDtTm property.
     *
     * @return
     * possible object is
     * [XMLGregorianCalendar]
     */
    /**
     * Sets the value of the creDtTm property.
     *
     * @param value
     * allowed object is
     * [XMLGregorianCalendar]
     */
    @XmlElement(name = "CreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", required = true)
    @XmlSchemaType(name = "dateTime")
    var creDtTm: XMLGregorianCalendar? = null
    /**
     * Gets the value of the frToDt property.
     *
     * @return
     * possible object is
     * [DateTimePeriodDetails]
     */
    /**
     * Sets the value of the frToDt property.
     *
     * @param value
     * allowed object is
     * [DateTimePeriodDetails]
     */
    @XmlElement(name = "FrToDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var frToDt: DateTimePeriodDetails? = null
    /**
     * Gets the value of the cpyDplctInd property.
     *
     * @return
     * possible object is
     * [CopyDuplicate1Code]
     */
    /**
     * Sets the value of the cpyDplctInd property.
     *
     * @param value
     * allowed object is
     * [CopyDuplicate1Code]
     */
    @XmlElement(name = "CpyDplctInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    @XmlSchemaType(name = "string")
    var cpyDplctInd: CopyDuplicate1Code? = null
    /**
     * Gets the value of the rptgSrc property.
     *
     * @return
     * possible object is
     * [ReportingSource1Choice]
     */
    /**
     * Sets the value of the rptgSrc property.
     *
     * @param value
     * allowed object is
     * [ReportingSource1Choice]
     */
    @XmlElement(name = "RptgSrc", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var rptgSrc: ReportingSource1Choice? = null
    /**
     * Gets the value of the acct property.
     *
     * @return
     * possible object is
     * [CashAccount20]
     */
    /**
     * Sets the value of the acct property.
     *
     * @param value
     * allowed object is
     * [CashAccount20]
     */
    @XmlElement(name = "Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02", required = true)
    var acct: CashAccount20? = null
    /**
     * Gets the value of the rltdAcct property.
     *
     * @return
     * possible object is
     * [CashAccount16]
     */
    /**
     * Sets the value of the rltdAcct property.
     *
     * @param value
     * allowed object is
     * [CashAccount16]
     */
    @XmlElement(name = "RltdAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var rltdAcct: CashAccount16? = null

    @XmlElement(name = "Intrst", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    protected var intrst: List<AccountInterest2> = listOf()

    @XmlElement(name = "Bal", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    protected var bal: List<CashBalance3> = listOf()
    /**
     * Gets the value of the txsSummry property.
     *
     * @return
     * possible object is
     * [TotalTransactions2]
     */
    /**
     * Sets the value of the txsSummry property.
     *
     * @param value
     * allowed object is
     * [TotalTransactions2]
     */
    @XmlElement(name = "TxsSummry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var txsSummry: TotalTransactions2? = null

    @XmlElement(name = "Ntry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    protected var ntry: List<ReportEntry2> = listOf()
    /**
     * Gets the value of the addtlRptInf property.
     *
     * @return
     * possible object is
     * [String]
     */
    /**
     * Sets the value of the addtlRptInf property.
     *
     * @param value
     * allowed object is
     * [String]
     */
    @XmlElement(name = "AddtlRptInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
    var addtlRptInf: String? = null

}