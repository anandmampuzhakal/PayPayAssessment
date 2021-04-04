package modularization.features.currencyconveter.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00160\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lmodularization/features/currencyconveter/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lmodularization/features/currencyconveter/data/repositories/Repository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lmodularization/features/currencyconveter/data/repositories/Repository;Landroid/content/SharedPreferences;)V", "amount", "Landroidx/lifecycle/MutableLiveData;", "", "getAmount", "()Landroidx/lifecycle/MutableLiveData;", "assembleCurrencyData", "Ljava/util/ArrayList;", "Lmodularization/features/currencyconveter/data/models/Currency;", "Lkotlin/collections/ArrayList;", "exchangeRates", "Lmodularization/features/currencyconveter/data/models/CurrentExchangeRates;", "currencyTypes", "Lmodularization/features/currencyconveter/data/models/CurrencyTypes;", "fetchCurrencyData", "Landroidx/lifecycle/LiveData;", "Lcom/varun/currencylayer/vo/Resource;", "", "getCurrentTimeStampInMillis", "", "getLastDataFetchTime", "setDataFetchTime", "", "timestamp", "updateCurrencies", "list", "Companion", "currencyconveter_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amount = null;
    private final modularization.features.currencyconveter.data.repositories.Repository repository = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private static final java.lang.String LAST_FETCH_TIMESTAMP = "LAST_FETCH_TIMESTAMP";
    @org.jetbrains.annotations.NotNull()
    public static final modularization.features.currencyconveter.ui.home.HomeViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmount() {
        return null;
    }
    
    private final long getCurrentTimeStampInMillis() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.varun.currencylayer.vo.Resource<java.util.List<modularization.features.currencyconveter.data.models.Currency>>> fetchCurrencyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.varun.currencylayer.vo.Resource<kotlin.Unit>> updateCurrencies(@org.jetbrains.annotations.NotNull()
    java.util.List<modularization.features.currencyconveter.data.models.Currency> list) {
        return null;
    }
    
    private final java.util.ArrayList<modularization.features.currencyconveter.data.models.Currency> assembleCurrencyData(modularization.features.currencyconveter.data.models.CurrentExchangeRates exchangeRates, modularization.features.currencyconveter.data.models.CurrencyTypes currencyTypes) {
        return null;
    }
    
    private final long getLastDataFetchTime() {
        return 0L;
    }
    
    private final void setDataFetchTime(long timestamp) {
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.data.repositories.Repository repository, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lmodularization/features/currencyconveter/ui/home/HomeViewModel$Companion;", "", "()V", "LAST_FETCH_TIMESTAMP", "", "currencyconveter_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}