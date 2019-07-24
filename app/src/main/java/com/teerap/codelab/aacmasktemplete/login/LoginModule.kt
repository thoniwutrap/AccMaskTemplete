package com.teerap.codelab.aacmasktemplete.login

import androidx.lifecycle.ViewModelProviders
import com.teerap.codelab.aacmasktemplete.base.UseCase
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.login.domain.LoginUseCase
import com.teerap.codelab.aacmasktemplete.login.domain.model.LoginRequest
import com.teerap.codelab.aacmasktemplete.login.presenter.LoginActivity
import com.teerap.codelab.aacmasktemplete.login.presenter.LoginContract
import com.teerap.codelab.aacmasktemplete.login.presenter.LoginPresenter
import com.teerap.codelab.aacmasktemplete.login.presenter.LoginViewModel
import dagger.Module
import dagger.Provides


@Module
class LoginModule {

	@Provides
	fun provideView(activity: LoginActivity) : LoginContract.View{
		return activity
	}

	@Provides
	fun providePresenter(presenter : LoginPresenter) : LoginContract.Presenter{
		return presenter
	}

	@Provides
	fun provideViewModel(activity: LoginActivity) : LoginViewModel{
		return ViewModelProviders.of(activity).get(LoginViewModel::class.java)
	}


	@Provides
	fun provideLogin(loginUseCase : LoginUseCase) : UseCase<LoginRequest, User> {
		return loginUseCase
	}

}
