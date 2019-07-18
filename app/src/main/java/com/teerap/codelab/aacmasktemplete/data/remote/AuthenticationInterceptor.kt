package com.teerap.codelab.aacmasktemplete.data.remote

import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route

class AuthenticationInterceptor : Authenticator {

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