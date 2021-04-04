package com.nz.anand.network.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.nz.anand.network.api.JsonPlaceHolderAPIInterface
import com.nz.anand.network.model.CommentsData
import com.nz.anand.network.model.PostWithComments
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object UserPostsAndCommentsRepository{
       fun getMutableLiveData(userID: Int) : MutableLiveData<ArrayList<PostWithComments>> {
        val mutableLiveData = MutableLiveData<ArrayList<PostWithComments>>()
        JsonPlaceHolderAPIRepository.retrofit.create(JsonPlaceHolderAPIInterface::class.java).getPosts(
            userID
        ).enqueue(object :
            Callback<MutableList<PostWithComments>> {
            override fun onFailure(call: Call<MutableList<PostWithComments>>, t: Throwable) {
                Log.e("error", t.localizedMessage)
            }

            override fun onResponse(
                call: Call<MutableList<PostWithComments>>,
                response: Response<MutableList<PostWithComments>>
            ) {
                val usersResponse = response.body()

                if (usersResponse != null) {
                    for (i in usersResponse.indices) {
                        usersResponse[i].comments.addAll(getCommentsMutableLiveData(usersResponse[i].id as Int))
                    }
                }
                usersResponse?.let { mutableLiveData.value = it as ArrayList<PostWithComments> }
            }
        })
        return mutableLiveData
    }


    fun getCommentsMutableLiveData(postId: Int) : ArrayList<CommentsData> {
        val mutableLiveData = ArrayList<CommentsData>()
        JsonPlaceHolderAPIRepository.retrofit.create(JsonPlaceHolderAPIInterface::class.java).getComments(
            postId
        ).enqueue(object :
            Callback<ArrayList<CommentsData>> {
            override fun onFailure(call: Call<ArrayList<CommentsData>>, t: Throwable) {
                Log.e("error", t.localizedMessage)
            }

            override fun onResponse(
                call: Call<ArrayList<CommentsData>>,
                response: Response<ArrayList<CommentsData>>
            ) {
                val usersResponse = response.body()
                usersResponse?.let { mutableLiveData.addAll(it)  }
            }
        })
        return mutableLiveData
    }
}