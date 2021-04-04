package modularization.features.currencyconveter.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lmodularization/features/currencyconveter/di/modules/ApiModule;", "", "()V", "BASE_URL", "", "provideCurrencyService", "Lmodularization/features/currencyconveter/data/api/CurrencyService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "currencyconveter_debug"})
@dagger.Module(includes = {modularization.features.currencyconveter.di.modules.ViewModelModule.class})
public final class ApiModule {
    private static java.lang.String BASE_URL = "http://api.currencylayer.com/";
    @org.jetbrains.annotations.NotNull()
    public static final modularization.features.currencyconveter.di.modules.ApiModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final modularization.features.currencyconveter.data.api.CurrencyService provideCurrencyService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private ApiModule() {
        super();
    }
}