package modularization.features.currencyconveter.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u0013H\u0016J\u001a\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lmodularization/features/currencyconveter/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "amountObserver", "Landroidx/lifecycle/Observer;", "", "bindings", "Lmodularization/features/currencyconveter/databinding/MainFragmentBinding;", "fetchHandler", "Landroid/os/Handler;", "fetchTask", "Ljava/lang/Runnable;", "fetchedCurrencyDataObserver", "Lcom/varun/currencylayer/vo/Resource;", "", "Lmodularization/features/currencyconveter/data/models/Currency;", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "updateCurrencyObserver", "", "viewModel", "Lmodularization/features/currencyconveter/ui/home/HomeViewModel;", "viewModelFactory", "Lmodularization/features/currencyconveter/ui/ViewModelFactory;", "getViewModelFactory", "()Lmodularization/features/currencyconveter/ui/ViewModelFactory;", "setViewModelFactory", "(Lmodularization/features/currencyconveter/ui/ViewModelFactory;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "onViewCreated", "view", "Companion", "currencyconveter_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public modularization.features.currencyconveter.ui.ViewModelFactory viewModelFactory;
    private modularization.features.currencyconveter.ui.home.HomeViewModel viewModel;
    private modularization.features.currencyconveter.databinding.MainFragmentBinding bindings;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private android.os.Handler fetchHandler;
    private final java.lang.Runnable fetchTask = null;
    private final androidx.lifecycle.Observer<com.varun.currencylayer.vo.Resource<java.util.List<modularization.features.currencyconveter.data.models.Currency>>> fetchedCurrencyDataObserver = null;
    private final androidx.lifecycle.Observer<com.varun.currencylayer.vo.Resource<kotlin.Unit>> updateCurrencyObserver = null;
    private final androidx.lifecycle.Observer<java.lang.String> amountObserver = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final modularization.features.currencyconveter.ui.home.HomeFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final modularization.features.currencyconveter.ui.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.ui.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public HomeFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lmodularization/features/currencyconveter/ui/home/HomeFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "currencyconveter_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}