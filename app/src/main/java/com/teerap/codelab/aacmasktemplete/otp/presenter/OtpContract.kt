package com.teerap.codelab.aacmasktemplete.otp.presenter

import androidx.lifecycle.LifecycleObserver

interface OtpContract {

    interface View : OtpContract{

    }

    interface UserAcition : LifecycleObserver{
        fun requestOTP()
    }
}