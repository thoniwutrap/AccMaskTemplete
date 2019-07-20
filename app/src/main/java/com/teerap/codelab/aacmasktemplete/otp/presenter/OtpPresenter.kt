package com.teerap.codelab.aacmasktemplete.otp.presenter

import com.teerap.codelab.aacmasktemplete.base.RxPresenter
import com.krungsri.uchoose.core.UseCase
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class OtpPresenter @Inject constructor(private val requestOTPUseCase: UseCase<String, OtpResponse>,
                                       private val viewModel: OtpViewModel,
                                       compositeDisposable: CompositeDisposable)
	: RxPresenter(compositeDisposable) ,OtpContract.UserAcition {

    override fun requestOTP() {
        requestOTPUseCase.execute(request = "0909866888")
		        .subscribeOn(Schedulers.io())
		        .observeOn(AndroidSchedulers.mainThread())
		        .subscribeBy(onNext = {},onError = {it.printStackTrace()})
		        .addTo(compositeDisposable = compositeDisposable)

    }
}