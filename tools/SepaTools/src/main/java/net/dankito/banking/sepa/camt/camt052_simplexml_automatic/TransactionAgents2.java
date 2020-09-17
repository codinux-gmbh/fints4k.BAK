
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionAgents2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionAgents2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionAgents2 {

    @Element(name = "DbtrAgt", required = false)
    private BranchAndFinancialInstitutionIdentification4 dbtrAgt;
    @Element(name = "CdtrAgt", required = false)
    private BranchAndFinancialInstitutionIdentification4 cdtrAgt;
    @Element(name = "IntrmyAgt1", required = false)
    private BranchAndFinancialInstitutionIdentification4 intrmyAgt1;
    @Element(name = "IntrmyAgt2", required = false)
    private BranchAndFinancialInstitutionIdentification4 intrmyAgt2;
    @Element(name = "IntrmyAgt3", required = false)
    private BranchAndFinancialInstitutionIdentification4 intrmyAgt3;
    @Element(name = "RcvgAgt", required = false)
    private BranchAndFinancialInstitutionIdentification4 rcvgAgt;
    @Element(name = "DlvrgAgt", required = false)
    private BranchAndFinancialInstitutionIdentification4 dlvrgAgt;
    @Element(name = "IssgAgt", required = false)
    private BranchAndFinancialInstitutionIdentification4 issgAgt;
    @Element(name = "SttlmPlc", required = false)
    private BranchAndFinancialInstitutionIdentification4 sttlmPlc;
    @Element(name = "Prtry", required = false)
    private ProprietaryAgent2 prtry;

    public TransactionAgents2() {
    }

    public BranchAndFinancialInstitutionIdentification4 getDbtrAgt() {
        return dbtrAgt;
    }

    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification4 dbtrAgt) {
        this.dbtrAgt = dbtrAgt;
    }

    public BranchAndFinancialInstitutionIdentification4 getCdtrAgt() {
        return cdtrAgt;
    }

    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification4 cdtrAgt) {
        this.cdtrAgt = cdtrAgt;
    }

    public BranchAndFinancialInstitutionIdentification4 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    public void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification4 intrmyAgt1) {
        this.intrmyAgt1 = intrmyAgt1;
    }

    public BranchAndFinancialInstitutionIdentification4 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    public void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification4 intrmyAgt2) {
        this.intrmyAgt2 = intrmyAgt2;
    }

    public BranchAndFinancialInstitutionIdentification4 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    public void setIntrmyAgt3(BranchAndFinancialInstitutionIdentification4 intrmyAgt3) {
        this.intrmyAgt3 = intrmyAgt3;
    }

    public BranchAndFinancialInstitutionIdentification4 getRcvgAgt() {
        return rcvgAgt;
    }

    public void setRcvgAgt(BranchAndFinancialInstitutionIdentification4 rcvgAgt) {
        this.rcvgAgt = rcvgAgt;
    }

    public BranchAndFinancialInstitutionIdentification4 getDlvrgAgt() {
        return dlvrgAgt;
    }

    public void setDlvrgAgt(BranchAndFinancialInstitutionIdentification4 dlvrgAgt) {
        this.dlvrgAgt = dlvrgAgt;
    }

    public BranchAndFinancialInstitutionIdentification4 getIssgAgt() {
        return issgAgt;
    }

    public void setIssgAgt(BranchAndFinancialInstitutionIdentification4 issgAgt) {
        this.issgAgt = issgAgt;
    }

    public BranchAndFinancialInstitutionIdentification4 getSttlmPlc() {
        return sttlmPlc;
    }

    public void setSttlmPlc(BranchAndFinancialInstitutionIdentification4 sttlmPlc) {
        this.sttlmPlc = sttlmPlc;
    }

    public ProprietaryAgent2 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryAgent2 prtry) {
        this.prtry = prtry;
    }

}
