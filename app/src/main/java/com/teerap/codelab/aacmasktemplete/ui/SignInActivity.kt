package com.teerap.codelab.aacmasktemplete.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.teerap.codelab.aacmasktemplete.MainApplication
import com.teerap.codelab.aacmasktemplete.R
import com.teerap.codelab.aacmasktemplete.base.BaseActivity
import com.teerap.codelab.aacmasktemplete.databinding.ActivitySigninBinding
import com.teerap.codelab.aacmasktemplete.extension.initDialog
import com.teerap.codelab.aacmasktemplete.util.toast

class SignInActivity : BaseActivity(),SignInListener {

    lateinit var viewModel : SignInViewModel
    lateinit var binding : ActivitySigninBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProviders.of(this).get(SignInViewModel::class.java).also {
            (application as MainApplication).component?.inject(it)
            it.mView = this
            it.signInListener = this
        }
        binding = DataBindingUtil.setContentView(this,R.layout.activity_signin)
        binding.viewmodel = viewModel
    }


    override fun onSuccess() {
        toast("Success")
    }


    override fun onFailure(msg: String) {
        toast(msg)
    }


}
