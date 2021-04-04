package com.nz.anand.network.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RateLimitResponse(var rate: Rate? = null, var resources: Resources? = null) : BaseResponse(), Parcelable

@Parcelize
data class Rate(var limit: Int?, var remaining: Int?, var reset: Int?) : Parcelable

@Parcelize
data class Resources(var core: Core?, var graphql: Graphql?, var integration_manifest: IntegrationManifest?, var search: Search?, var source_import: SourceImport?) : Parcelable

@Parcelize
data class Core(var limit: Int?, var remaining: Int?, var reset: Int?) : Parcelable

@Parcelize
data class Graphql(var limit: Int?, var remaining: Int?, var reset: Int?) : Parcelable

@Parcelize
data class IntegrationManifest(var limit: Int?, var remaining: Int?, var reset: Int?) : Parcelable

@Parcelize
data class Search(var limit: Int?, var remaining: Int?, var reset: Int?) : Parcelable

@Parcelize
data class SourceImport(var limit: Int?, var remaining: Int?, var reset: Int?) : Parcelable

@Parcelize
data class PostsData(var userId:  Int? = null, var id:  Int? = null, var title:  String? = null, var body:  String? = null): Parcelable

@Parcelize
data class  PostsResponse(val results : List<PostsData>): BaseResponse(), Parcelable


