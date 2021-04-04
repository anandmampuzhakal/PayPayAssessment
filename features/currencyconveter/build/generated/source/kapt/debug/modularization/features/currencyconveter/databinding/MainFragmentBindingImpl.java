package modularization.features.currencyconveter.databinding;
import modularization.features.currencyconveter.R;
import modularization.features.currencyconveter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainFragmentBindingImpl extends MainFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 4);
        sViewsWithIds.put(R.id.guideline08, 5);
        sViewsWithIds.put(R.id.guideline92, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener currencyToandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.amount.getValue()
            //         is viewModel.amount.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(currencyTo);
            // localize variables for thread safety
            // viewModel.amount != null
            boolean viewModelAmountJavaLangObjectNull = false;
            // viewModel.amount.getValue()
            java.lang.String viewModelAmountGetValue = null;
            // viewModel.amount
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelAmount = null;
            // viewModel
            modularization.features.currencyconveter.ui.home.HomeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAmount = viewModel.getAmount();

                viewModelAmountJavaLangObjectNull = (viewModelAmount) != (null);
                if (viewModelAmountJavaLangObjectNull) {




                    viewModelAmount.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public MainFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private MainFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (android.widget.Spinner) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            );
        this.currencyListSpinner.setTag(null);
        this.currencyTo.setTag(null);
        this.main.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.spinnerAdapter == variableId) {
            setSpinnerAdapter((modularization.features.currencyconveter.ui.adapters.SpinnerAdapter) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((modularization.features.currencyconveter.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSpinnerAdapter(@Nullable modularization.features.currencyconveter.ui.adapters.SpinnerAdapter SpinnerAdapter) {
        this.mSpinnerAdapter = SpinnerAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.spinnerAdapter);
        super.requestRebind();
    }
    public void setAdapter(@Nullable modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable modularization.features.currencyconveter.ui.home.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAmount((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAmount(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelAmountGetValue = null;
        modularization.features.currencyconveter.ui.adapters.SpinnerAdapter spinnerAdapter = mSpinnerAdapter;
        modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter adapter = mAdapter;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelAmount = null;
        modularization.features.currencyconveter.ui.home.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.amount
                    viewModelAmount = viewModel.getAmount();
                }
                updateLiveDataRegistration(0, viewModelAmount);


                if (viewModelAmount != null) {
                    // read viewModel.amount.getValue()
                    viewModelAmountGetValue = viewModelAmount.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            modularization.features.currencyconveter.ui.BindingsAdapterKt.bindSpinnerAdapter(this.currencyListSpinner, spinnerAdapter);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.currencyTo, viewModelAmountGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.currencyTo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, currencyToandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.recyclerView.setAdapter(adapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.amount
        flag 1 (0x2L): spinnerAdapter
        flag 2 (0x3L): adapter
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}