package net.dankito.banking.sepa.camt

import com.ctc.wstx.api.WstxInputProperties
import com.ctc.wstx.api.WstxOutputProperties
import com.ctc.wstx.stax.WstxInputFactory
import com.ctc.wstx.stax.WstxOutputFactory
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlFactory
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import net.dankito.banking.sepa.camt.camt052.Document


open class JacksonCamtMessagesParser : ICamtMessagesParser {

    protected val xmlMapper: ObjectMapper


    init {
        val module = JacksonXmlModule()
        module.setDefaultUseWrapper(false)

        val inputFactory = WstxInputFactory() // Woodstox XMLInputFactory impl
        inputFactory.setProperty(WstxInputProperties.P_MAX_ATTRIBUTE_SIZE, 32000)
// configure
        val outputFactory = WstxOutputFactory() // Woodstox XMLOutputfactory impl
        outputFactory.setProperty(WstxOutputProperties.P_OUTPUT_CDATA_AS_TEXT, true)
        val xmlFactory = XmlFactory(inputFactory, outputFactory)

        xmlMapper = XmlMapper(xmlFactory, module)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)
            .configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, false)
    }


    override fun parseCamt052(xml: String): Document {
        return xmlMapper.readValue(xml, Document::class.java)
    }

}