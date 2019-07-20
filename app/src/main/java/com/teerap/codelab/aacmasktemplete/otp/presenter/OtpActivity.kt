package com.teerap.codelab.aacmasktemplete.otp.presenter

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.teerap.codelab.aacmasktemplete.R
import com.teerap.codelab.aacmasktemplete.databinding.ActivityUserBinding
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_user.*
import javax.inject.Inject

class OtpActivity : DaggerAppCompatActivity(), OtpContract.View {

	@Inject
	lateinit var presenter: OtpContract.UserAcition

	@Inject
	lateinit var viewModel: OtpViewModel

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val binding = DataBindingUtil.setContentView<ActivityUserBinding>(this, R.layout.activity_user)
		binding.userViewmodel = viewModel

		btnTest.setOnClickListener {
			presenter.requestOTP()
		}

		verifyButton.setOnClickListener {
			presenter.verifyOTP()
		}

	}

	override fun displayList() {
		viewModel.reference
	}
}
