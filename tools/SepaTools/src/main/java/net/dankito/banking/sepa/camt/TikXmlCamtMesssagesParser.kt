package net.dankito.banking.sepa.camt

import com.tickaroo.tikxml.TikXml
import net.dankito.banking.sepa.camt.camt052_tikxml.Document
import okio.buffer
import okio.source
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets


open class TikXmlCamtMesssagesParser {

    private val serializer = TikXml.Builder()
        .exceptionOnUnreadXml(false)
        .build()


    open fun parseCamt052(xml: String): Document {
        val source = ByteArrayInputStream(xml.toByteArray(StandardCharsets.UTF_8)).source().buffer()
        return serializer.read(source, Document::class.java)
    }

}