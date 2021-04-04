package modularization.features.currencyconveter.extentions

import android.content.res.Resources
import modularization.features.currencyconveter.R
import java.util.*

fun Resources.getFlagResource(flagName: String): Int {
    val id = getIdentifier(
        "_${flagName.toLowerCase(Locale.ROOT)}",
        "drawable",
       "com.nz.anand.paypayassessment"
    )
    if (id == 0) {
        return R.drawable._no_flag
    }
    return id
}