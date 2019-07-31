package com.teerap.codelab.aacmasktemplete.login.datasource

import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.Observable
import javax.inject.Inject

class LoginRepository @Inject constructor(private val dataSource : LoginDataSource) : LoginDataSource by dataSource