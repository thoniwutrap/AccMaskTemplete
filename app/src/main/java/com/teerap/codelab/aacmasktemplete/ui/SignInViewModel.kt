package com.teerap.codelab.aacmasktemplete.ui

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.teerap.codelab.aacmasktemplete.data.repository.UserRepository
import javax.inject.Inject

class SignInViewModel : ViewModel() {

    var phoneNumber : String? = null
    var password : String? = null
    //var authListener : AuthListener? = null

    @Inject lateinit var userRepo : UserRepository


    fun onSignInClick(view : View){
        Log.e("ff","Singin")
    }


}