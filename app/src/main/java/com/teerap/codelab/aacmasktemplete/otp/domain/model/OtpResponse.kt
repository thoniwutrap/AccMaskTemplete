package com.teerap.codelab.aacmasktemplete.otp.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OtpResponse(

        @SerializedName("reference")
        val reference: String? = null,

        @SerializedName("repeatTime")
        val repeatTime: Int? = null

) : Parcelable