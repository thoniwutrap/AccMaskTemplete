package com.teerap.codelab.aacmasktemplete.otp.datasource

import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.Observable
import javax.inject.Inject

class OtpRepository @Inject constructor(private val remoteSource: OtpDataSource) : OtpDataSource by remoteSource