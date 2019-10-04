package net.dankito.fints.messages.datenelemente.implementierte.signatur

import net.dankito.fints.messages.datenelemente.implementierte.ICodeEnum


enum class Signaturalgorithmus(override val code: String) : ICodeEnum {

    NichtZugelassen("1"),

    RSA_Algorithmus("10")

}