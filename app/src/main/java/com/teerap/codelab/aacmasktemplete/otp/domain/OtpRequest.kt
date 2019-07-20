package kerry.express.th.mobile.tracking.api.pojo.otp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OtpRequest(

        @SerializedName("mobileNo")
        val mobileNo: String? = null

) : Parcelable