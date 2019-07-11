package com.teerap.codelab.aacmasktemplete.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.teerap.codelab.aacmasktemplete.MainApplication
import com.teerap.codelab.aacmasktemplete.R
import com.teerap.codelab.aacmasktemplete.databinding.ActivitySigninBinding
import com.teerap.codelab.aacmasktemplete.extension.initDialog

class SignInActivity : AppCompatActivity(),SignInListener {




    var loadingDialog  = this.initDialog()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivitySigninBinding =  DataBindingUtil.setContentView(this,R.layout.activity_signin)
        val viewModel = ViewModelProviders.of(this).get(SignInViewModel::class.java).also {
            (application as MainApplication).component?.inject(it)
        }
        binding.viewmodel = viewModel
        viewModel.signInListener = this
    }



    override fun showLoading() {
        loadingDialog.show(supportFragmentManager,"Loading")
    }

    override fun hineLoading() {
        loadingDialog.dismiss()

    }
    override fun onSuccess() {

    }

    override fun onFailure() {

    }

}
