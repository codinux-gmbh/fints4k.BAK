
package net.dankito.banking.sepa.camt.camt052_simplexml_automatic;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransactionParty2 <br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransactionParty2")
@Namespace(reference = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.02")
public class TransactionParty2 {

    @Element(name = "InitgPty", required = false)
    private PartyIdentification32 initgPty;
    @Element(name = "Dbtr", required = false)
    private PartyIdentification32 dbtr;
    @Element(name = "DbtrAcct", required = false)
    private CashAccount16 dbtrAcct;
    @Element(name = "UltmtDbtr", required = false)
    private PartyIdentification32 ultmtDbtr;
    @Element(name = "Cdtr", required = false)
    private PartyIdentification32 cdtr;
    @Element(name = "CdtrAcct", required = false)
    private CashAccount16 cdtrAcct;
    @Element(name = "UltmtCdtr", required = false)
    private PartyIdentification32 ultmtCdtr;
    @Element(name = "TradgPty", required = false)
    private PartyIdentification32 tradgPty;
    @Element(name = "Prtry", required = false)
    private ProprietaryParty2 prtry;

    public TransactionParty2() {
    }

    public PartyIdentification32 getInitgPty() {
        return initgPty;
    }

    public void setInitgPty(PartyIdentification32 initgPty) {
        this.initgPty = initgPty;
    }

    public PartyIdentification32 getDbtr() {
        return dbtr;
    }

    public void setDbtr(PartyIdentification32 dbtr) {
        this.dbtr = dbtr;
    }

    public CashAccount16 getDbtrAcct() {
        return dbtrAcct;
    }

    public void setDbtrAcct(CashAccount16 dbtrAcct) {
        this.dbtrAcct = dbtrAcct;
    }

    public PartyIdentification32 getUltmtDbtr() {
        return ultmtDbtr;
    }

    public void setUltmtDbtr(PartyIdentification32 ultmtDbtr) {
        this.ultmtDbtr = ultmtDbtr;
    }

    public PartyIdentification32 getCdtr() {
        return cdtr;
    }

    public void setCdtr(PartyIdentification32 cdtr) {
        this.cdtr = cdtr;
    }

    public CashAccount16 getCdtrAcct() {
        return cdtrAcct;
    }

    public void setCdtrAcct(CashAccount16 cdtrAcct) {
        this.cdtrAcct = cdtrAcct;
    }

    public PartyIdentification32 getUltmtCdtr() {
        return ultmtCdtr;
    }

    public void setUltmtCdtr(PartyIdentification32 ultmtCdtr) {
        this.ultmtCdtr = ultmtCdtr;
    }

    public PartyIdentification32 getTradgPty() {
        return tradgPty;
    }

    public void setTradgPty(PartyIdentification32 tradgPty) {
        this.tradgPty = tradgPty;
    }

    public ProprietaryParty2 getPrtry() {
        return prtry;
    }

    public void setPrtry(ProprietaryParty2 prtry) {
        this.prtry = prtry;
    }

}
