package modularization.features.currencyconveter.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lmodularization/features/currencyconveter/ui/adapters/SpinnerAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currencies", "", "Lmodularization/features/currencyconveter/data/models/Currency;", "getCount", "", "getCustomView", "Landroid/view/View;", "position", "parent", "Landroid/view/ViewGroup;", "getDropDownView", "convertView", "getView", "setDataList", "", "currencyconveter_debug"})
public final class SpinnerAdapter extends android.widget.ArrayAdapter<java.lang.String> {
    private java.util.List<modularization.features.currencyconveter.data.models.Currency> currencies;
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<modularization.features.currencyconveter.data.models.Currency> currencies) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getDropDownView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    private final android.view.View getCustomView(int position, android.view.ViewGroup parent) {
        return null;
    }
    
    public SpinnerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, 0);
    }
}