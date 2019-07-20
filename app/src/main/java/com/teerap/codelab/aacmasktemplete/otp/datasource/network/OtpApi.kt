package com.teerap.codelab.aacmasktemplete.otp.datasource.network

import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpRequest
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import com.teerap.codelab.aacmasktemplete.otp.domain.model.VerifyOtpRequest
import com.teerap.codelab.aacmasktemplete.otp.domain.model.VerifyOtpResponse
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface OtpApi {

    @POST("v1/OTP")
    fun requestOTP(@Body body: OtpRequest): Observable<OtpResponse>


    @POST("v1/OTP/{mobileNo}/TOKEN")
    fun verifyOTP(@Path("mobileNo") mobileNo: String, @Body body: VerifyOtpRequest): Observable<VerifyOtpResponse>

}