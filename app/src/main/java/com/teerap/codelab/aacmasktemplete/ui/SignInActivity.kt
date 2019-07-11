package com.teerap.codelab.aacmasktemplete.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.teerap.codelab.aacmasktemplete.R
import com.teerap.codelab.aacmasktemplete.databinding.ActivitySigninBinding

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivitySigninBinding =  DataBindingUtil.setContentView(this,R.layout.activity_signin)
        val viewModel = ViewModelProviders.of(this).get(SignInViewModel::class.java)
        binding.viewmodel = viewModel
    }
}
