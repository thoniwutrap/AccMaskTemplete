package com.teerap.codelab.aacmasktemplete.login.presenter

import androidx.lifecycle.LifecycleObserver


interface LoginContract {

	interface View : LoginContract {

	}

	interface Presenter : LifecycleObserver {
		fun login()
		fun getUser()
	}

}