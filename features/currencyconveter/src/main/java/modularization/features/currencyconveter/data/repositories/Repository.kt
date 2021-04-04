package modularization.features.currencyconveter.data.repositories

import modularization.features.currencyconveter.data.api.CurrencyService
import modularization.features.currencyconveter.data.models.Currency
import modularization.features.currencyconveter.data.room.RateDao
import javax.inject.Inject

class Repository @Inject constructor(
    private val service: CurrencyService,
    private val rateDao: RateDao
) {

    // Remote-> Retrofit
    suspend fun getCurrentExchangeRates() = service.getCurrentExchangeRates()
    suspend fun getCurrencyTypes() = service.getCurrencyTypes()

    // Local-> Room
    suspend fun getSavedExchangeRates(): List<Currency> = rateDao.getAllList()
    suspend fun updateAllExchangeRates(saveList: List<Currency>) = rateDao.updateAllRate(saveList)
}