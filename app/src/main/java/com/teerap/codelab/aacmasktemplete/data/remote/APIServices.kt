package com.teerap.codelab.aacmasktemplete.data.remote

import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.data.remote.dao.requests.SignInRequest
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST



interface APIServices {


    @POST("v1/Member/Login/Phone")
    fun signIn(@Body body: SignInRequest) : Single<User>


}