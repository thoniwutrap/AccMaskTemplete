package com.teerap.codelab.aacmasktemplete.otp.presenter

import android.os.Bundle
import com.teerap.codelab.aacmasktemplete.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_user.*
import javax.inject.Inject

class OtpActivity : DaggerAppCompatActivity(), OtpContract.View {

	@Inject
	lateinit var presenter: OtpContract.UserAcition

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_user)
		btnTest.setOnClickListener {
			presenter.requestOTP()
		}
	}
}
