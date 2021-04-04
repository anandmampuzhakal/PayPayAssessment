package com.nz.anand.network.model

import androidx.lifecycle.MutableLiveData
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class  PostWithComments (

    @SerializedName("userId")
    val userId: Int? = null,

    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("body")
    val body: String? = null,

    val comments:ArrayList<CommentsData> = ArrayList<CommentsData>()

): Serializable

