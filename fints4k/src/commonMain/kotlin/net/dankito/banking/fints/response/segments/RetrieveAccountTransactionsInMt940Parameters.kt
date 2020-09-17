package net.dankito.banking.fints.response.segments


open class RetrieveAccountTransactionsInMt940Parameters(
    parameters: JobParameters,
    open val countDaysForWhichTransactionsAreKept: Int,
    open val settingCountEntriesAllowed: Boolean,
    open val settingAllAccountAllowed: Boolean
) : JobParameters(parameters)