package com.teerap.codelab.aacmasktemplete.otp.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VerifyOtpRequest(

        @SerializedName("code")
        val code: String? = null

) : Parcelable