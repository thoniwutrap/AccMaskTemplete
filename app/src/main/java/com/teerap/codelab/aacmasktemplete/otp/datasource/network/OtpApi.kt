package com.teerap.codelab.aacmasktemplete.otp.datasource.network

import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpRequest
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface OtpApi {

    @POST("v1/OTP")
    fun requestOTP(@Body body: OtpRequest): Observable<OtpResponse>

}