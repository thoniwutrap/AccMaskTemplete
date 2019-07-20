package com.teerap.codelab.aacmasktemplete.otp.datasource.network

import com.teerap.codelab.aacmasktemplete.otp.datasource.OtpDataSource
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpRequest
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.Observable
import javax.inject.Inject

class OtpDataSourceNetwork @Inject constructor(private val api: OtpApi) : OtpDataSource {

    override fun requestOtp(mobileNo: String): Observable<OtpResponse> {
        return api.requestOTP(OtpRequest(mobileNo = mobileNo))
    }
}