package modularization.features.currencyconveter.databinding;
import modularization.features.currencyconveter.R;
import modularization.features.currencyconveter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSpinnerCurrencyBindingImpl extends ItemSpinnerCurrencyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.line, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSpinnerCurrencyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemSpinnerCurrencyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[4]
            );
        this.currencyCodeTextView.setTag(null);
        this.flag.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.currency == variableId) {
            setCurrency((modularization.features.currencyconveter.data.models.Currency) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCurrency(@Nullable modularization.features.currencyconveter.data.models.Currency Currency) {
        this.mCurrency = Currency;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.currency);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String currencyCode = null;
        java.lang.String currencyName = null;
        int currencyCountryFlag = 0;
        modularization.features.currencyconveter.data.models.Currency currency = mCurrency;

        if ((dirtyFlags & 0x3L) != 0) {



                if (currency != null) {
                    // read currency.code
                    currencyCode = currency.getCode();
                    // read currency.name
                    currencyName = currency.getName();
                    // read currency.countryFlag
                    currencyCountryFlag = currency.getCountryFlag();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.currencyCodeTextView, currencyCode);
            modularization.features.currencyconveter.ui.BindingsAdapterKt.bindImage(this.flag, currencyCountryFlag);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, currencyName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): currency
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}