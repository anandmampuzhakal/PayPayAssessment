package modularization.features.currencyconveter

import android.app.Application
import modularization.features.currencyconveter.di.components.AppComponent
import modularization.features.currencyconveter.di.components.DaggerAppComponent
import modularization.features.currencyconveter.di.modules.ApiModule
import modularization.features.currencyconveter.di.modules.RoomModule
import modularization.features.currencyconveter.di.modules.SharedPreferencesModule


class PayPayApplication : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .roomModule(RoomModule(this))
            .sharedPreferencesModule(SharedPreferencesModule(this))
            .build()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}