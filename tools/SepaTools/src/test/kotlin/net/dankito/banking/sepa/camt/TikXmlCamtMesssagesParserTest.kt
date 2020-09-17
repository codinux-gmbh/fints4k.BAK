package net.dankito.banking.sepa.camt

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

import java.io.File


class TikXmlCamtMesssagesParserTest {

    private val underTest = TikXmlCamtMesssagesParser()


    @Test
    fun parseCamt052() {

        // given
//        val camt052 = File("/Users/ganymed/devel/Java/self/fints4k/docs/responses/camt/TargobankBookedTransactions.xml").readText()
        val camt052 = File("/Users/ganymed/devel/Java/self/fints4k/docs/responses/camt/SparkasseCamt052Angepasst.xml").readText()

        // when
        val result = underTest.parseCamt052(camt052)

        // then
        assertThat(result.bkToCstmrAcctRpt).isNotNull()
    }

}