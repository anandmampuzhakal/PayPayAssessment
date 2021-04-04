package com.nz.anand.network.model

import com.google.gson.annotations.SerializedName

data class CommentsData(
    @SerializedName("postId")
    val postId: Int? = null,

    @SerializedName("id")
    val commentId: Int? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("email")
    val email: String? = null,

    @SerializedName("body")
    val body: String? = null
)
