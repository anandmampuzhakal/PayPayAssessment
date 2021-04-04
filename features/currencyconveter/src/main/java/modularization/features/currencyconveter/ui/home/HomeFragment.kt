package modularization.features.currencyconveter.ui.home

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.snackbar.Snackbar
import modularization.features.currencyconveter.PayPayApplication
import modularization.features.currencyconveter.data.models.Currency
import modularization.features.currencyconveter.extentions.getViewModel
import modularization.features.currencyconveter.ui.ViewModelFactory
import modularization.features.currencyconveter.ui.adapters.CurrencyListAdapter
import modularization.features.currencyconveter.ui.adapters.SpinnerAdapter
import com.varun.currencylayer.vo.Resource
import com.varun.currencylayer.vo.Status
import modularization.features.currencyconveter.R
import modularization.features.currencyconveter.databinding.MainFragmentBinding
import javax.inject.Inject

class HomeFragment : Fragment() {
    companion object {
        private val TAG = this::class.java.name
    }
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: HomeViewModel
    private var bindings: MainFragmentBinding? = null
    private lateinit var snackbar: Snackbar
    private var fetchHandler: Handler? = null
    private val fetchTask = object : Runnable {
        override fun run() {
            viewModel.fetchCurrencyData().observe(viewLifecycleOwner, fetchedCurrencyDataObserver)
            fetchHandler?.postDelayed(this, 1000 * 60 * 30)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity?.application as PayPayApplication).getAppComponent().inject(this)
        viewModel = getViewModel(viewModelFactory, HomeViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindings = DataBindingUtil.inflate(layoutInflater, R.layout.main_fragment, container, false)
        bindings?.apply {
            this.adapter = CurrencyListAdapter()
            this.recyclerView.layoutManager = GridLayoutManager(context, 2)
            this.spinnerAdapter = SpinnerAdapter(requireContext())
            this.viewModel = this@HomeFragment.viewModel
        }

       return bindings?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        snackbar = Snackbar.make(requireActivity().findViewById(android.R.id.content),
                "Loading.....", Snackbar.LENGTH_LONG)
        viewModel.fetchCurrencyData().observe(viewLifecycleOwner, fetchedCurrencyDataObserver)
        viewModel.amount.observe(viewLifecycleOwner, amountObserver)
    }


    private val fetchedCurrencyDataObserver = Observer<Resource<List<Currency>>> {
        it.let { resource ->
            when (resource.status) {
                Status.LOADING -> {
                    snackbar.setText("Loading...")
                    snackbar.show()
                }
                Status.SUCCESS -> {
                    resource.data?.let { data ->
                        bindings?.adapter?.setDataList(data)
                        bindings?.spinnerAdapter?.setDataList(resource.data)
                        bindings?.currencyListSpinner?.onItemSelectedListener =
                            object : AdapterView.OnItemSelectedListener {
                                override fun onItemSelected(
                                    parent: AdapterView<*>,
                                    view: View,
                                    pos: Int,
                                    id: Long
                                ) {
                                    bindings?.adapter?.updateSelectedCurrencyRate(resource.data[pos].rate)
                                }

                                override fun onNothingSelected(parent: AdapterView<*>?) {}
                            }
                        viewModel.updateCurrencies(data)
                            .observe(viewLifecycleOwner, updateCurrencyObserver)
                    }
                    snackbar.dismiss()
                }
                Status.ERROR -> {
                    snackbar.setText(resource.message.toString())
                    snackbar.duration = Snackbar.LENGTH_SHORT
                    snackbar.show()
                    Log.e(TAG, resource.message.toString())
                }
            }
        }
    }

    private val updateCurrencyObserver = Observer<Resource<Unit>> {
        it.let { resource ->
            when (resource.status) {
                Status.SUCCESS -> {
                    // No need
                }
                Status.ERROR -> {
                    snackbar.setText(resource.message.toString())
                    snackbar.duration = Snackbar.LENGTH_SHORT
                    snackbar.show()
                    Log.e(TAG, resource.message.toString())
                }
                Status.LOADING -> {
                    // No need
                }
            }
        }
    }

    private val amountObserver = Observer<String> { amount ->
        var parsed = 1.0
        if (amount.isNotEmpty()) {
            parsed = amount.toDouble()
        }
        bindings?.adapter?.convert(parsed)
    }

    override fun onResume() {
        super.onResume()
        fetchHandler?.post(fetchTask)
    }

    override fun onPause() {
        super.onPause()
        fetchHandler?.removeCallbacks(fetchTask)
    }
}