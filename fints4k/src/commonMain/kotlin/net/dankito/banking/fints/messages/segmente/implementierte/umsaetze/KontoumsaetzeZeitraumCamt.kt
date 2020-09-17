package net.dankito.banking.fints.messages.segmente.implementierte.umsaetze

import net.dankito.banking.fints.messages.datenelementgruppen.implementierte.account.KontoverbindungInternational
import net.dankito.banking.fints.messages.segmente.id.CustomerSegmentId
import net.dankito.banking.fints.model.AccountData
import net.dankito.banking.fints.model.BankData
import net.dankito.banking.fints.model.GetTransactionsParameter


/**
 * Die Lösung bietet dem Kunden die Möglichkeit, auf seinem System verlorengegangene Buchungen erneut zu erhalten.
 *
 * Die maximale Anzahl der rückzumeldenden Buchungspositionen kann begrenzt werden. Eine Buchungsposition besteht
 * aus einem :61:/:86:-Block eines MT 940-Formats. Es muss davon unabhängig immer ein gültiges MT 940-Format
 * zurückgemeldet werden, d.h. die Felder :20: bis :60: und :62: bis :86: sind obligatorischer Bestandteil der Rückmeldung.
 *
 * Der maximale Zeitraum, für den rückwirkend Buchungen beim Kreditinstitut gespeichert sind, wird in den
 * Bankparameterdaten übermittelt.
 */
open class KontoumsaetzeZeitraumCamt(
    segmentNumber: Int,
    bank: BankData,
    account: AccountData,
    supportedCamtMessages: List<String>,
    parameter: GetTransactionsParameter
) : KontoumsaetzeZeitraumBase(CustomerSegmentId.AccountTransactionsCamt, 1, segmentNumber,
    KontoverbindungInternational(account, bank), parameter, supportedCamtMessages)