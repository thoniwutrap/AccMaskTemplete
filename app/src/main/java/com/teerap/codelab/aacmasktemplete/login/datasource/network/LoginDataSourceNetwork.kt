package com.teerap.codelab.aacmasktemplete.login.datasource.network

import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.login.datasource.LoginDataSource
import com.teerap.codelab.aacmasktemplete.login.domain.model.LoginRequest
import io.reactivex.Observable
import javax.inject.Inject

class LoginDataSourceNetwork @Inject constructor(private val api : LoginAPI) : LoginDataSource {


	override fun login(mobileNo: String, password: String): Observable<User> {
		return api.signInWithMobile(LoginRequest(mobileNo = mobileNo, password = password))
	}
}