package modularization.features.currencyconveter.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0014\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lmodularization/features/currencyconveter/ui/adapters/CurrencyListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmodularization/features/currencyconveter/ui/adapters/CurrencyListAdapter$AdapterViewHolder;", "()V", "amountToConvert", "", "dataSet", "", "Lmodularization/features/currencyconveter/data/models/Currency;", "selectedCurrencyExchangeRate", "calculateExchangeAmount", "position", "", "convert", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataList", "updateSelectedCurrencyRate", "rate", "AdapterViewHolder", "currencyconveter_debug"})
public final class CurrencyListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter.AdapterViewHolder> {
    private java.util.List<modularization.features.currencyconveter.data.models.Currency> dataSet;
    private double amountToConvert = 1.0;
    private double selectedCurrencyExchangeRate = 1.0;
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<modularization.features.currencyconveter.data.models.Currency> dataSet) {
    }
    
    public final void updateSelectedCurrencyRate(double rate) {
    }
    
    public final void convert(double amountToConvert) {
    }
    
    private final double calculateExchangeAmount(int position) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter.AdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter.AdapterViewHolder holder, int position) {
    }
    
    public CurrencyListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lmodularization/features/currencyconveter/ui/adapters/CurrencyListAdapter$AdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lmodularization/features/currencyconveter/databinding/ItemCurrencyCardBinding;", "(Lmodularization/features/currencyconveter/databinding/ItemCurrencyCardBinding;)V", "bind", "", "currency", "Lmodularization/features/currencyconveter/data/models/Currency;", "currencyconveter_debug"})
    public static final class AdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final modularization.features.currencyconveter.databinding.ItemCurrencyCardBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        modularization.features.currencyconveter.data.models.Currency currency) {
        }
        
        public AdapterViewHolder(@org.jetbrains.annotations.NotNull()
        modularization.features.currencyconveter.databinding.ItemCurrencyCardBinding binding) {
            super(null);
        }
    }
}