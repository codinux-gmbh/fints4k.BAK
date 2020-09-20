package net.dankito.utils.multiplatform

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import net.dankito.utils.multiplatform.serialization.DateDeserializer
import java.text.DateFormat
import java.util.*
import java.util.Date


@JsonDeserialize(using = DateDeserializer::class)
actual class Date actual constructor(millisSinceEpoch: Long) : java.util.Date(millisSinceEpoch) {

    actual companion object {

        actual val today: net.dankito.utils.multiplatform.Date
            get() {
                val today = Calendar.getInstance()

                today.set(Calendar.HOUR_OF_DAY, 0)
                today.set(Calendar.MINUTE, 0)
                today.set(Calendar.SECOND, 0)
                today.set(Calendar.MILLISECOND, 0)

                return net.dankito.utils.multiplatform.Date(today.time.time)
            }

    }


    actual constructor() : this(System.currentTimeMillis())

    actual constructor(year: Int, month: Int, day: Int) : this(java.util.Date(year - 1900, month - 1, day).time)

    actual constructor(year: Int, month: Month, day: Int) : this(year, month.month, day)


    actual val millisSinceEpoch: Long
        get() = time


    actual fun year(): Int {
        return super.getYear() + 1900
    }

    actual fun month(): Month {
        return Month.fromInt(monthInt())
    }

    actual fun monthInt(): Int {
        return super.getMonth() + 1
    }

    actual fun day(): Int {
        return super.getDate()
    }

    private fun formatDate(dateFormatStyle: Int): Int {
        val dateStringString = DateFormat.getDateInstance(dateFormatStyle).format(this)

        return dateStringString.toInt()
    }


    actual fun compareTo(other: net.dankito.utils.multiplatform.Date): Int {
        return super.compareTo(other)
    }

}