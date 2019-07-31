package com.teerap.codelab.aacmasktemplete.otp.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OtpRequest(

        @SerializedName("mobileNo")
        val mobileNo: String? = null

) : Parcelable