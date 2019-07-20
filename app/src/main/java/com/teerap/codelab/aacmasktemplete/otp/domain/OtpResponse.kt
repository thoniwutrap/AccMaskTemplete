package kerry.express.th.mobile.tracking.api.pojo.otp

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