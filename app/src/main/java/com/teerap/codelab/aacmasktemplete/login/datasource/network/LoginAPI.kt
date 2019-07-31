package com.teerap.codelab.aacmasktemplete.login.datasource.network

import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.login.domain.model.LoginRequest
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginAPI {

	@POST("v1/Member/Login/Phone")
	fun signInWithMobile(@Body body: LoginRequest): Observable<User>


}