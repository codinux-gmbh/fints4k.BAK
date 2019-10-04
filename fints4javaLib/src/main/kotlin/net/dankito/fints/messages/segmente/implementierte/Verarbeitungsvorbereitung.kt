package net.dankito.fints.messages.segmente.implementierte

import net.dankito.fints.messages.Existenzstatus
import net.dankito.fints.messages.datenelemente.implementierte.*
import net.dankito.fints.messages.datenelementgruppen.implementierte.Segmentkopf
import net.dankito.fints.messages.segmente.Segment


open class Verarbeitungsvorbereitung(
    segmentNumber: Int,
    bpdVersion: Int,
    updVersion: Int,
    language: Dialogsprache,
    productName: String,
    productVersion: String
) : Segment(listOf(
    Segmentkopf("HKVVB", 3, segmentNumber),
    BPDVersion(bpdVersion, Existenzstatus.Mandatory),
    UPDVersion(updVersion, Existenzstatus.Mandatory),
    DialogspracheDatenelement(language, Existenzstatus.Mandatory),
    Produktbezeichnung(productName, Existenzstatus.Mandatory),
    Produktversion(productVersion, Existenzstatus.Mandatory)
), Existenzstatus.Mandatory)