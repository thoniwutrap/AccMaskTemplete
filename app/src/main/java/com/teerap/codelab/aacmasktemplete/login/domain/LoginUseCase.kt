package com.teerap.codelab.aacmasktemplete.login.domain

import com.teerap.codelab.aacmasktemplete.base.UseCase
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.login.datasource.LoginDataSource
import com.teerap.codelab.aacmasktemplete.login.domain.model.LoginRequest
import io.reactivex.Observable
import javax.inject.Inject


class LoginUseCase @Inject constructor(private val remoteSource : LoginDataSource): UseCase<LoginRequest,User>(){

	override fun createObservable(request: LoginRequest): Observable<User> {
		return remoteSource.login(request.mobileNo,request.password)
	}

}
