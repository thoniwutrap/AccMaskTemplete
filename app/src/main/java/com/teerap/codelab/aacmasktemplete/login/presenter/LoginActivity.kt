package com.teerap.codelab.aacmasktemplete.login.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.teerap.codelab.aacmasktemplete.R
import com.teerap.codelab.aacmasktemplete.databinding.ActivityLoginBinding
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : DaggerAppCompatActivity(),LoginContract.View {

	@Inject
	lateinit var presenter: LoginPresenter

	@Inject
	lateinit var viewModel: LoginViewModel


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		var binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,R.layout.activity_login)
		binding.loginViewModel = viewModel

		btnLogin.setOnClickListener {
			presenter.login()
		}

		btnUser.setOnClickListener {
			presenter.getUser()
		}
	}



}
