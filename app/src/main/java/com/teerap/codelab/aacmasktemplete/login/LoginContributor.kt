package com.teerap.codelab.aacmasktemplete.login

import com.teerap.codelab.aacmasktemplete.login.datasource.network.LoginDataSourceNetworkModule
import com.teerap.codelab.aacmasktemplete.login.presenter.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class LoginContributor {
	@ContributesAndroidInjector(modules = [LoginModule::class, LoginDataSourceNetworkModule::class])
	abstract fun loginContribute() : LoginActivity
}