package com.teerap.codelab.aacmasktemplete.otp.presenter

import android.content.Context
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class OtpViewModel @Inject constructor() : ViewModel() {
    var reference: String = ""
    var mobileNo : String = ""
    var verify: String = ""
}