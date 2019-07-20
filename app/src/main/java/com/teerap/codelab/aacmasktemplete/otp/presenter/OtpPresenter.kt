package com.teerap.codelab.aacmasktemplete.otp.presenter

import com.krungsri.uchoose.core.RxPresenter
import com.teerap.codelab.aacmasktemplete.otp.domain.RequestOTPUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class OtpPresenter @Inject constructor(private val requestOTPUseCase: RequestOTPUseCase,
                                       private val viewModel: OtpViewModel,
                                       compositeDisposable: CompositeDisposable):RxPresenter(compositeDisposable) ,OtpContract.UserAcition {

    override fun requestOTP() {
        requestOTPUseCase.execute(request = "0909866888")
		        .subscribeOn(Schedulers.io())
		        .observeOn(AndroidSchedulers.mainThread())
		        .subscribeBy(onNext = {},onError = {it.printStackTrace()})
		        .addTo(compositeDisposable = compositeDisposable)

    }
}