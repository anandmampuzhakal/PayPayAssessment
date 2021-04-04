package modularization.features.currencyconveter.data.api

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var original = chain.request()
        val url =
            original.url.newBuilder().addQueryParameter("access_key", "a776aa6599c0f66125ba0e2571f08a39").build()
        original = original.newBuilder().url(url).build()
        return chain.proceed(original)
    }
}