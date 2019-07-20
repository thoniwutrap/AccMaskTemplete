package kerry.express.th.mobile.tracking.api.pojo.otp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VerifyOtpRequest(

        @SerializedName("code")
        val code: String? = null

) : Parcelable