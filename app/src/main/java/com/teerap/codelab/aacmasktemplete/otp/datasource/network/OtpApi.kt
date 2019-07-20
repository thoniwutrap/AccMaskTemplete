package com.teerap.codelab.aacmasktemplete.otp.datasource.network

import io.reactivex.Observable
import kerry.express.th.mobile.tracking.api.pojo.otp.OtpRequest
import kerry.express.th.mobile.tracking.api.pojo.otp.OtpResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface OtpApi {

    @POST("v1/OTP")
    fun requestOTP(@Body body: OtpRequest): Observable<OtpResponse>

}