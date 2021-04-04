package modularization.features.currencyconveter.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lmodularization/features/currencyconveter/di/modules/ViewModelModule;", "", "()V", "bindFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lmodularization/features/currencyconveter/ui/ViewModelFactory;", "bindViewModel", "Landroidx/lifecycle/ViewModel;", "homeViewModel", "Lmodularization/features/currencyconveter/ui/home/HomeViewModel;", "currencyconveter_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @modularization.features.currencyconveter.di.annotations.ViewModelKey(value = modularization.features.currencyconveter.ui.home.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindViewModel(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.ui.home.HomeViewModel homeViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindFactory(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.ui.ViewModelFactory viewModelFactory);
    
    public ViewModelModule() {
        super();
    }
}