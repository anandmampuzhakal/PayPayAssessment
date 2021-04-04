package modularization.features.currencyconveter.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import modularization.features.currencyconveter.di.annotations.ViewModelKey
import modularization.features.currencyconveter.ui.ViewModelFactory
import modularization.features.currencyconveter.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun bindFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}