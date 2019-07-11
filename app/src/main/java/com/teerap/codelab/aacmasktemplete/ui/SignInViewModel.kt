package com.teerap.codelab.aacmasktemplete.ui

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.data.repository.UserRepository
import com.teerap.codelab.aacmasktemplete.extension.initDialog
import javax.inject.Inject

class SignInViewModel : ViewModel() {


    var phoneNumber : String? = null
    var password : String? = null
    //var authListener : AuthListener? = null
    var signInListener : SignInListener? = null

    @Inject
    lateinit var userRepo : UserRepository
    private var post: LiveData<User>? = null



    fun onSignInClick(view : View){
        signInListener?.showLoading()
        post = userRepo.singIn("0909866888","123456")

    }


}