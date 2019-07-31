package com.teerap.codelab.aacmasktemplete.otp.domain

import com.teerap.codelab.aacmasktemplete.base.UseCase
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.otp.datasource.OtpDataSource

import io.reactivex.Observable
import javax.inject.Inject

class VerifyOTPUseCase @Inject constructor(private val remoteSource : OtpDataSource) : UseCase<VerifyOTPUseCase.Request, User>() {

	override fun createObservable(request: Request): Observable<User> {
		return remoteSource.verifyOtp(request.mobileNo,request.code)
	}

	data class Request(val mobileNo : String,val code : String)
}