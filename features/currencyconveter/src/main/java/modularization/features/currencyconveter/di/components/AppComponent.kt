package modularization.features.currencyconveter.di.components



import modularization.features.currencyconveter.data.room.RateDao
import modularization.features.currencyconveter.di.modules.ApiModule
import modularization.features.currencyconveter.di.modules.RoomModule
import modularization.features.currencyconveter.di.modules.SharedPreferencesModule
import modularization.features.currencyconveter.di.modules.ViewModelModule
import modularization.features.currencyconveter.ui.home.HomeFragment
import dagger.Component
import modularization.features.currencyconveter.data.room.AppDatabase
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, ViewModelModule::class, RoomModule::class, SharedPreferencesModule::class])
interface AppComponent {
    fun inject(homeFragment: HomeFragment)
    fun rateDao(): RateDao
    fun appDatabase(): AppDatabase
}