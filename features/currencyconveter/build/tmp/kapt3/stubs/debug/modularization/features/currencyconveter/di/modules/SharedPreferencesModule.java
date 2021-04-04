package modularization.features.currencyconveter.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lmodularization/features/currencyconveter/di/modules/SharedPreferencesModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "providesSharedPreferences", "currencyconveter_debug"})
@dagger.Module()
public final class SharedPreferencesModule {
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences providesSharedPreferences() {
        return null;
    }
    
    public SharedPreferencesModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}