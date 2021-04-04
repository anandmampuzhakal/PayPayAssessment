package modularization.features.currencyconveter.extentions

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import modularization.features.currencyconveter.ui.ViewModelFactory

fun <T : ViewModel> Fragment.getViewModel(
    viewModelFactory: ViewModelFactory,
    modelClass: Class<T>
): T {
    return ViewModelProvider(this, viewModelFactory).get(modelClass)
}