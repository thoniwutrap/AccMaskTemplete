package com.teerap.codelab.aacmasktemplete.ui

import android.util.Log
import android.view.View
import com.teerap.codelab.aacmasktemplete.base.BaseViewModel
import com.teerap.codelab.aacmasktemplete.data.repository.UserRepository
import com.teerap.codelab.aacmasktemplete.util.handleNetwork
import javax.inject.Inject


class SignInViewModel : BaseViewModel() {

    var phoneNumber : String? = null
    var password : String? = null
    var signInListener : SignInListener? = null

    @Inject
    lateinit var userRepo : UserRepository


    fun onSignInClick(view : View){
        mView?.showDialog()
            disposable?.add(
                userRepo.singIn(phoneNumber, password)
                    .subscribe(
                        {
                            signInListener?.onSuccess()
                        },
                        {
                            mView?.dismissDialog()
                            if(it.handleNetwork(mView?.context())){
                                signInListener?.onFailure("Error ja")
                            }
                        },
                        {
                            mView?.dismissDialog()
                        }
                    )
            )
    }

}