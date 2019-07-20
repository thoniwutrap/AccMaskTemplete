package com.teerap.codelab.aacmasktemplete.otp.datasource

import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.Observable

interface OtpDataSource {
    fun requestOtp(mobileNo : String) : Observable<OtpResponse>
}