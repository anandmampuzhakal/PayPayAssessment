// Generated by Dagger (https://dagger.dev).
package modularization.features.currencyconveter.ui.home;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import modularization.features.currencyconveter.ui.ViewModelFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public HomeFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new HomeFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("modularization.features.currencyconveter.ui.home.HomeFragment.viewModelFactory")
  public static void injectViewModelFactory(HomeFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
