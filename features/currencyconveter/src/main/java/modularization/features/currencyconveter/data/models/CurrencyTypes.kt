package modularization.features.currencyconveter.data.models

import com.google.gson.annotations.SerializedName

data class CurrencyTypes(
    @SerializedName("currencies")
    var currencies: Map<String, String> = HashMap()
)