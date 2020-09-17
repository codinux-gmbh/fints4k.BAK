
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * StructuredRemittanceInformation7 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "StructuredRemittanceInformation7")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class StructuredRemittanceInformation7 {

    @Element(name = "RfrdDocInf", required = false)
    private ReferredDocumentInformation3 rfrdDocInf;
    @Element(name = "RfrdDocAmt", required = false)
    private RemittanceAmount1 rfrdDocAmt;
    @Element(name = "CdtrRefInf", required = false)
    private CreditorReferenceInformation2 cdtrRefInf;
    @Element(name = "Invcr", required = false)
    private PartyIdentification32 invcr;
    @Element(name = "Invcee", required = false)
    private PartyIdentification32 invcee;
    @Element(name = "AddtlRmtInf", required = false)
    private String addtlRmtInf;

    public StructuredRemittanceInformation7() {
    }

    public ReferredDocumentInformation3 getRfrdDocInf() {
        return rfrdDocInf;
    }

    public void setRfrdDocInf(ReferredDocumentInformation3 rfrdDocInf) {
        this.rfrdDocInf = rfrdDocInf;
    }

    public RemittanceAmount1 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    public void setRfrdDocAmt(RemittanceAmount1 rfrdDocAmt) {
        this.rfrdDocAmt = rfrdDocAmt;
    }

    public CreditorReferenceInformation2 getCdtrRefInf() {
        return cdtrRefInf;
    }

    public void setCdtrRefInf(CreditorReferenceInformation2 cdtrRefInf) {
        this.cdtrRefInf = cdtrRefInf;
    }

    public PartyIdentification32 getInvcr() {
        return invcr;
    }

    public void setInvcr(PartyIdentification32 invcr) {
        this.invcr = invcr;
    }

    public PartyIdentification32 getInvcee() {
        return invcee;
    }

    public void setInvcee(PartyIdentification32 invcee) {
        this.invcee = invcee;
    }

    public String getAddtlRmtInf() {
        return addtlRmtInf;
    }

    public void setAddtlRmtInf(String addtlRmtInf) {
        this.addtlRmtInf = addtlRmtInf;
    }

}
