package com.teerap.codelab.aacmasktemplete.otp

import androidx.lifecycle.ViewModelProviders
import com.krungsri.uchoose.core.UseCase
import com.teerap.codelab.aacmasktemplete.otp.datasource.OtpDataSource
import com.teerap.codelab.aacmasktemplete.otp.datasource.network.OtpApi
import com.teerap.codelab.aacmasktemplete.otp.datasource.network.OtpDataSourceNetwork
import com.teerap.codelab.aacmasktemplete.otp.domain.RequestOTPUseCase
import com.teerap.codelab.aacmasktemplete.otp.domain.model.OtpResponse
import com.teerap.codelab.aacmasktemplete.otp.presenter.OtpActivity
import com.teerap.codelab.aacmasktemplete.otp.presenter.OtpContract
import com.teerap.codelab.aacmasktemplete.otp.presenter.OtpPresenter
import com.teerap.codelab.aacmasktemplete.otp.presenter.OtpViewModel
import dagger.Module
import dagger.Provides

@Module
class OtpModule {

	@Provides
	fun providePresenter(presenter: OtpPresenter): OtpContract.UserAcition {
		return presenter
	}

	@Provides
	fun provideView(activity: OtpActivity): OtpContract.View {
		return activity
	}

	@Provides
	fun provideViewModel(activity: OtpActivity) : OtpViewModel {
		return ViewModelProviders.of(activity).get(OtpViewModel::class.java)
	}


	@Provides
	fun provideOtpUseCase(requestOTPUseCase: RequestOTPUseCase) :  UseCase<String, OtpResponse>{
		return requestOTPUseCase
	}

}