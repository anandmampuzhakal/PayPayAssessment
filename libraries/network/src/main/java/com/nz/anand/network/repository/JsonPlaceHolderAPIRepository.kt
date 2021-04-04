package com.nz.anand.network.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.nz.anand.network.api.JsonPlaceHolderAPIInterface
import com.nz.anand.network.factory.ErrorConverterFactory
import com.nz.anand.network.model.PostsResponse
import com.nz.anand.network.model.RateLimitResponse
import com.nz.anand.network.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object JsonPlaceHolderAPIRepository : BaseRepository() {
    fun getMutableLiveData() : MutableLiveData<ArrayList<User>> {
        val mutableLiveData = MutableLiveData<ArrayList<User>>()
        retrofit.create(JsonPlaceHolderAPIInterface::class.java).getUsers().enqueue(object : Callback<MutableList<User>> {
            override fun onFailure(call: Call<MutableList<User>>, t: Throwable) {
              Log.e("error", t.localizedMessage)
            }
            override fun onResponse(
                call: Call<MutableList<User>>,
                response: Response<MutableList<User>>
            ) {
                val usersResponse = response.body()
                usersResponse?.let { mutableLiveData.value = it as ArrayList<User> }
            }
        })
        return mutableLiveData
    }

}