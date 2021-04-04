package modularization.features.currencyconveter.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lmodularization/features/currencyconveter/di/components/AppComponent;", "", "appDatabase", "Lmodularization/features/currencyconveter/data/room/AppDatabase;", "inject", "", "homeFragment", "Lmodularization/features/currencyconveter/ui/home/HomeFragment;", "rateDao", "Lmodularization/features/currencyconveter/data/room/RateDao;", "currencyconveter_debug"})
@dagger.Component(modules = {modularization.features.currencyconveter.di.modules.ApiModule.class, modularization.features.currencyconveter.di.modules.ViewModelModule.class, modularization.features.currencyconveter.di.modules.RoomModule.class, modularization.features.currencyconveter.di.modules.SharedPreferencesModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.ui.home.HomeFragment homeFragment);
    
    @org.jetbrains.annotations.NotNull()
    public abstract modularization.features.currencyconveter.data.room.RateDao rateDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract modularization.features.currencyconveter.data.room.AppDatabase appDatabase();
}