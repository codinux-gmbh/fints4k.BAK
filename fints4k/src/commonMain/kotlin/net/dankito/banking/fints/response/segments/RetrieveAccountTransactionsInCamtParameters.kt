package net.dankito.banking.fints.response.segments


open class RetrieveAccountTransactionsInCamtParameters(
    parameters: JobParameters,
    countDaysForWhichTransactionsAreKept: Int,
    settingCountEntriesAllowed: Boolean,
    settingAllAccountAllowed: Boolean,
    open val supportedCamtFormats: List<String>
) : RetrieveAccountTransactionsInMt940Parameters(parameters, countDaysForWhichTransactionsAreKept, settingCountEntriesAllowed, settingAllAccountAllowed)