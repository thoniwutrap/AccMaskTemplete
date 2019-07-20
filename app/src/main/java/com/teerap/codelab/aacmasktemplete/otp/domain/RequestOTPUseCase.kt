package com.teerap.codelab.aacmasktemplete.otp.domain

import com.krungsri.uchoose.core.UseCase
import com.teerap.codelab.aacmasktemplete.otp.datasource.OtpDataSource
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.Observable
import javax.inject.Inject

class RequestOTPUseCase @Inject constructor(private val remoteSource: OtpDataSource) : UseCase<String, OtpResponse>() {
    override fun createObservable(request: String): Observable<OtpResponse> {
        return remoteSource.requestOtp(request)
    }
}