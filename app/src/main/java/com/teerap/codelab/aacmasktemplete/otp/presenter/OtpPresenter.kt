package com.teerap.codelab.aacmasktemplete.otp.presenter

import com.krungsri.uchoose.core.UseCase
import com.teerap.codelab.aacmasktemplete.otp.domain.RequestOTPUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kerry.express.th.mobile.tracking.api.pojo.otp.OtpResponse
import javax.inject.Inject

class OtpPresenter @Inject constructor(private val requestOTPUseCase: RequestOTPUseCase,
                                       private val viewModel: OtpViewModel) : OtpContract.UserAcition {

    override fun requestOTP() {
        requestOTPUseCase.execute(request = "0909866888")
		        .subscribeOn(Schedulers.io())
		        .observeOn(AndroidSchedulers.mainThread())
		        .doOnNext {  }
		        .doOnError {  }
		        .subscribe()

    }
}