package modularization.features.currencyconveter.di.modules

import android.app.Application
import androidx.room.Room
import modularization.features.currencyconveter.data.room.RateDao
import dagger.Module
import dagger.Provides
import modularization.features.currencyconveter.data.room.AppDatabase
import javax.inject.Singleton

@Module
class RoomModule(application: Application) {

    private var appDatabase: AppDatabase =
        Room.databaseBuilder(application, AppDatabase::class.java, AppDatabase.NAME).build()

    @Singleton
    @Provides
    fun providesRoomDatabase(): AppDatabase {
        return appDatabase
    }

    @Singleton
    @Provides
    fun providesRateDao(): RateDao {
        return appDatabase.getRateDao()
    }
}