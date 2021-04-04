package modularization.features.currencyconveter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modularization.features.currencyconveter.databinding.ItemCurrencyCardBindingImpl;
import modularization.features.currencyconveter.databinding.ItemSpinnerCurrencyBindingImpl;
import modularization.features.currencyconveter.databinding.MainFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ITEMCURRENCYCARD = 1;

  private static final int LAYOUT_ITEMSPINNERCURRENCY = 2;

  private static final int LAYOUT_MAINFRAGMENT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.currencyconveter.R.layout.item_currency_card, LAYOUT_ITEMCURRENCYCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.currencyconveter.R.layout.item_spinner_currency, LAYOUT_ITEMSPINNERCURRENCY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.currencyconveter.R.layout.main_fragment, LAYOUT_MAINFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ITEMCURRENCYCARD: {
          if ("layout/item_currency_card_0".equals(tag)) {
            return new ItemCurrencyCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_currency_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSPINNERCURRENCY: {
          if ("layout/item_spinner_currency_0".equals(tag)) {
            return new ItemSpinnerCurrencyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_spinner_currency is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINFRAGMENT: {
          if ("layout/main_fragment_0".equals(tag)) {
            return new MainFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(5);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.nz.anand.mvvmlibrary.DataBinderMapperImpl());
    result.add(new com.nz.anand.network.DataBinderMapperImpl());
    result.add(new com.nz.anand.paypaytechnicalassessment.libraries.actions.DataBinderMapperImpl());
    result.add(new modularization.ui_components.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "currency");
      sKeys.put(3, "spinnerAdapter");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/item_currency_card_0", modularization.features.currencyconveter.R.layout.item_currency_card);
      sKeys.put("layout/item_spinner_currency_0", modularization.features.currencyconveter.R.layout.item_spinner_currency);
      sKeys.put("layout/main_fragment_0", modularization.features.currencyconveter.R.layout.main_fragment);
    }
  }
}
