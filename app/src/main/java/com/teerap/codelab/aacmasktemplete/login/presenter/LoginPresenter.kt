package com.teerap.codelab.aacmasktemplete.login.presenter

import android.util.Log
import com.teerap.codelab.aacmasktemplete.base.UseCase
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.data.local.query.UserDao
import com.teerap.codelab.aacmasktemplete.login.domain.model.LoginRequest
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.Observables
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class LoginPresenter @Inject constructor(private var  view : LoginContract.View,
                                         private var loginUseCase: UseCase<LoginRequest, User>,
                                         private var userDao: UserDao,
                                         private var viewModel: LoginViewModel) : LoginContract.Presenter {


	override fun getUser() {
			Observable.fromCallable {
				userDao.getUser()
			}
					.subscribeOn(Schedulers.io())
					.observeOn(AndroidSchedulers.mainThread())
					.subscribe {
						Log.e("ddd",it[0].accessToken)
					}
	}


	override fun login() {
		loginUseCase.execute(request = LoginRequest(mobileNo = viewModel.mobileNo,password = viewModel.password))
				.map {
					userDao.upsert(it)
				}
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribeBy(
						onNext = {
							Log.e("login","success")
						},
						onError = {
							Log.e("login",it.printStackTrace().toString())
							Log.e("msg",it.message)
						}
				)
	}
}