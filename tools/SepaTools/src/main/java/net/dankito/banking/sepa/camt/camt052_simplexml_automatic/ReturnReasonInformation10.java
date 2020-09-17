
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ReturnReasonInformation10 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ReturnReasonInformation10")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class ReturnReasonInformation10 {

    @Element(name = "OrgnlBkTxCd", required = false)
    private BankTransactionCodeStructure4 orgnlBkTxCd;
    @Element(name = "Orgtr", required = false)
    private PartyIdentification32 orgtr;
    @Element(name = "Rsn", required = false)
    private ReturnReason5Choice rsn;
    @Element(name = "AddtlInf", required = false)
    private String addtlInf;

    public ReturnReasonInformation10() {
    }

    public BankTransactionCodeStructure4 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    public void setOrgnlBkTxCd(BankTransactionCodeStructure4 orgnlBkTxCd) {
        this.orgnlBkTxCd = orgnlBkTxCd;
    }

    public PartyIdentification32 getOrgtr() {
        return orgtr;
    }

    public void setOrgtr(PartyIdentification32 orgtr) {
        this.orgtr = orgtr;
    }

    public ReturnReason5Choice getRsn() {
        return rsn;
    }

    public void setRsn(ReturnReason5Choice rsn) {
        this.rsn = rsn;
    }

    public String getAddtlInf() {
        return addtlInf;
    }

    public void setAddtlInf(String addtlInf) {
        this.addtlInf = addtlInf;
    }

}
