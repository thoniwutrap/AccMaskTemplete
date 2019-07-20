package com.teerap.codelab.aacmasktemplete.otp.datasource

import io.reactivex.Observable
import kerry.express.th.mobile.tracking.api.pojo.otp.OtpResponse

interface OtpDataSource {
    fun requestOtp(mobileNo : String) : Observable<OtpResponse>
}