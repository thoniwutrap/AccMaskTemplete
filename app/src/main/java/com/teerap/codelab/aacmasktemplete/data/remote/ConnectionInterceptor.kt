package com.teerap.codelab.aacmasktemplete.data.remote

import com.teerap.codelab.aacmasktemplete.BuildConfig
import okhttp3.*

class ConnectionInterceptor : Interceptor, Authenticator {


    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request().newBuilder()
                .addHeader("app_id", BuildConfig.KeAppID)
                .addHeader("app_key", BuildConfig.KeAppKey)
                .addHeader("version", BuildConfig.VERSION_NAME)
                .addHeader("os","Android").build()
        return chain.proceed(request)
    }



    override fun authenticate(route: Route?, response: Response): Request? {
        response?.let {
            if (response.code == 401) {
                while (true) {
                    val token = ""
                        token?.let {
                            return generateRequest(response, token)
                        }
                    }
                }
            }
        return null
    }


    private fun generateRequest(response: Response, token: String): Request? {
        return response.request.newBuilder()
            .header("Authorization", token)
            .build()
    }

}