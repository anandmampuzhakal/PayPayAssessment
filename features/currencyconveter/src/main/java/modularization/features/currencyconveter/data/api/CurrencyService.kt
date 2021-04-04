package modularization.features.currencyconveter.data.api

import modularization.features.currencyconveter.data.models.CurrencyTypes
import modularization.features.currencyconveter.data.models.CurrentExchangeRates
import retrofit2.http.GET

interface CurrencyService {

    @GET("live")
    suspend fun getCurrentExchangeRates(): CurrentExchangeRates

    @GET("list")
    suspend fun getCurrencyTypes(): CurrencyTypes
}