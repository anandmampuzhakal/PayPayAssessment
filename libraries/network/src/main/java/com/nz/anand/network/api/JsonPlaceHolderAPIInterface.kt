package com.nz.anand.network.api


import com.nz.anand.network.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface JsonPlaceHolderAPIInterface {

    @GET("rate_limit")
    suspend fun getRateLimit(): RateLimitResponse

    @GET("users")
    fun getUsers(): Call<MutableList<User>>

    @GET("posts?")
    fun getPosts(@Query("userId")userID:Int): Call<MutableList<PostWithComments>>

    @GET("comments?")
    fun getComments(@Query("postId")postId:Int): Call<ArrayList<CommentsData>>

}