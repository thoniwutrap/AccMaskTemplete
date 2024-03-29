package com.teerap.codelab.aacmasktemplete.otp.datasource.network

import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.otp.datasource.OtpDataSource
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpRequest
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import com.teerap.codelab.aacmasktemplete.otp.domain.model.VerifyOtpRequest
import io.reactivex.Observable
import javax.inject.Inject

class OtpDataSourceNetwork @Inject constructor(private val api: OtpApi) : OtpDataSource {

    override fun requestOtp(mobileNo: String): Observable<OtpResponse> {
        return api.requestOTP(OtpRequest(mobileNo = mobileNo))
    }

    override fun verifyOtp(mobileNo: String, code: String): Observable<User> {
        return api.verifyOTP(mobileNo = mobileNo,body = VerifyOtpRequest(code = code))
    }
}