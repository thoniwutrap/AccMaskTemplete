package com.teerap.codelab.aacmasktemplete.otp.presenter

import com.teerap.codelab.aacmasktemplete.base.RxPresenter
import com.teerap.codelab.aacmasktemplete.base.UseCase
import com.teerap.codelab.aacmasktemplete.otp.domain.VerifyOTPUseCase
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import com.teerap.codelab.aacmasktemplete.otp.domain.model.VerifyOtpResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class OtpPresenter @Inject constructor(private val view: OtpContract.View,
                                       private val requestOTPUseCase: UseCase<String, OtpResponse>,
                                       private val verifyOTPUseCase: UseCase<VerifyOTPUseCase.Request, VerifyOtpResponse>,
                                       private val viewModel: OtpViewModel,
                                       compositeDisposable: CompositeDisposable)
	: RxPresenter(compositeDisposable) ,OtpContract.UserAcition {


	override fun requestOTP() {
        requestOTPUseCase.execute(request = viewModel.mobileNo)
		        .subscribeOn(Schedulers.io())
		        .observeOn(AndroidSchedulers.mainThread())
		        .subscribeBy(onNext = {
			        viewModel.reference = it.reference ?: ""
			        view.displayList()
		        },onError = {it.printStackTrace()})
		        .addTo(compositeDisposable = compositeDisposable)

    }

	override fun verifyOTP() {
		verifyOTPUseCase.execute(VerifyOTPUseCase.Request(mobileNo = viewModel.mobileNo,code = viewModel.verify))
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribeBy(onNext = {
					view.displayList()
				},onError = {it.printStackTrace()})
				.addTo(compositeDisposable = compositeDisposable)
	}
}