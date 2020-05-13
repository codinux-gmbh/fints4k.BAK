package net.dankito.fints.messages.segmente.implementierte

import net.dankito.fints.messages.datenelemente.implementierte.NotAllowedDatenelement
import net.dankito.fints.messages.datenelemente.implementierte.signatur.Sicherheitskontrollreferenz
import net.dankito.fints.messages.datenelementgruppen.implementierte.Segmentkopf
import net.dankito.fints.messages.datenelementgruppen.implementierte.signatur.BenutzerdefinierteSignatur
import net.dankito.fints.messages.segmente.Segment
import net.dankito.fints.messages.segmente.id.MessageSegmentId


/**
 * Der Signaturabschluss stellt die Verbindung mit dem dazugehörigen Signaturkopf
 * her und enthält als "Validierungsresultat" die elektronische Signatur.
 */
open class Signaturabschluss @JvmOverloads constructor(
    segmentNumber: Int,
    securityControlReference: String,
    pin: String,
    tan: String? = null
)
    : Segment(listOf(
        Segmentkopf(MessageSegmentId.SignatureEnding, 2, segmentNumber),
        Sicherheitskontrollreferenz(securityControlReference), // has to be the same as in Signaturkopf
        NotAllowedDatenelement(), // only used for HBCI, not allowed for PIN/TAN
        BenutzerdefinierteSignatur(pin, tan)
    ))