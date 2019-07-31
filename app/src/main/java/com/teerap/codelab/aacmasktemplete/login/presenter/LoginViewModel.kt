package com.teerap.codelab.aacmasktemplete.login.presenter

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel : ViewModel() {

	 var mobileNo : String = ""
	 var password : String = ""
	 var isEnabled : Boolean = false

	init {
		isEnabled = mobileNo.isNotBlank() && password.isNotBlank()
	}


}