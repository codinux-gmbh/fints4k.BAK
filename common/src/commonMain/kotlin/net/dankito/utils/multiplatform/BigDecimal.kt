package net.dankito.utils.multiplatform


expect fun Collection<BigDecimal>.sum(): BigDecimal


expect class BigDecimal {

    companion object {
        val Zero: BigDecimal
    }


    constructor(decimal: String)

    constructor(double: Double)


    fun format(countDecimalPlaces: Int): String

}