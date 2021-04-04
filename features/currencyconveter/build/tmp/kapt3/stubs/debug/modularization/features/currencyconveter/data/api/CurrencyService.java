package modularization.features.currencyconveter.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lmodularization/features/currencyconveter/data/api/CurrencyService;", "", "getCurrencyTypes", "Lmodularization/features/currencyconveter/data/models/CurrencyTypes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentExchangeRates", "Lmodularization/features/currencyconveter/data/models/CurrentExchangeRates;", "currencyconveter_debug"})
public abstract interface CurrencyService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "live")
    public abstract java.lang.Object getCurrentExchangeRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super modularization.features.currencyconveter.data.models.CurrentExchangeRates> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "list")
    public abstract java.lang.Object getCurrencyTypes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super modularization.features.currencyconveter.data.models.CurrencyTypes> p0);
}