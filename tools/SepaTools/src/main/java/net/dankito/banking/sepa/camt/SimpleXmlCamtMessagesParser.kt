package net.dankito.banking.sepa.camt

import net.dankito.banking.sepa.camt.camt052_simplexml.Camt052Document
import org.simpleframework.xml.core.Persister


open class SimpleXmlCamtMessagesParser {

    private val serializer = Persister()


    open fun parseCamt052(xml: String): Camt052Document {
        return serializer.read(Camt052Document::class.java, xml)
    }

}