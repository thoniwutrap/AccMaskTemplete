package com.teerap.codelab.aacmasktemplete.data.remote

import com.teerap.codelab.aacmasktemplete.BuildConfig
import okhttp3.*



class HeaderInterceptor : Interceptor {


    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        proceed(
            request()
                .newBuilder()
                .addHeader("app_id", BuildConfig.KeAppID)
                .addHeader("app_key", BuildConfig.KeAppKey)
                .addHeader("version", BuildConfig.VERSION_NAME)
                .addHeader("os","Android").build()
        )
    }


}