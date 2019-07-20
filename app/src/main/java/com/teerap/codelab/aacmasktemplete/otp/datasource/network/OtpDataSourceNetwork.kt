package com.teerap.codelab.aacmasktemplete.otp.datasource.network

import com.teerap.codelab.aacmasktemplete.otp.datasource.OtpDataSource
import io.reactivex.Observable
import kerry.express.th.mobile.tracking.api.pojo.otp.OtpRequest
import kerry.express.th.mobile.tracking.api.pojo.otp.OtpResponse
import javax.inject.Inject

class OtpDataSourceNetwork @Inject constructor(private val api: OtpApi) : OtpDataSource {

    override fun requestOtp(mobileNo: String): Observable<OtpResponse> {
        return api.requestOTP(OtpRequest(mobileNo = mobileNo))
    }
}