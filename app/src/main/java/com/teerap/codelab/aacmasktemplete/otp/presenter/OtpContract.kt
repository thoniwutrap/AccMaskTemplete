package com.teerap.codelab.aacmasktemplete.otp.presenter

import androidx.lifecycle.LifecycleObserver

interface OtpContract {

    interface View : OtpContract{
        fun displayList()
    }

    interface UserAcition : LifecycleObserver{
        fun requestOTP()
        fun verifyOTP()
    }
}