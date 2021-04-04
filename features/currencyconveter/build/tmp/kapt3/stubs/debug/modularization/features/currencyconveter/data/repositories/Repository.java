package modularization.features.currencyconveter.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lmodularization/features/currencyconveter/data/repositories/Repository;", "", "service", "Lmodularization/features/currencyconveter/data/api/CurrencyService;", "rateDao", "Lmodularization/features/currencyconveter/data/room/RateDao;", "(Lmodularization/features/currencyconveter/data/api/CurrencyService;Lmodularization/features/currencyconveter/data/room/RateDao;)V", "getCurrencyTypes", "Lmodularization/features/currencyconveter/data/models/CurrencyTypes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentExchangeRates", "Lmodularization/features/currencyconveter/data/models/CurrentExchangeRates;", "getSavedExchangeRates", "", "Lmodularization/features/currencyconveter/data/models/Currency;", "updateAllExchangeRates", "", "saveList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currencyconveter_debug"})
public final class Repository {
    private final modularization.features.currencyconveter.data.api.CurrencyService service = null;
    private final modularization.features.currencyconveter.data.room.RateDao rateDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentExchangeRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super modularization.features.currencyconveter.data.models.CurrentExchangeRates> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrencyTypes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super modularization.features.currencyconveter.data.models.CurrencyTypes> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSavedExchangeRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<modularization.features.currencyconveter.data.models.Currency>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAllExchangeRates(@org.jetbrains.annotations.NotNull()
    java.util.List<modularization.features.currencyconveter.data.models.Currency> saveList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.data.api.CurrencyService service, @org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.data.room.RateDao rateDao) {
        super();
    }
}