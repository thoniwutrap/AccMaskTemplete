package com.teerap.codelab.aacmasktemplete.otp.domain.model

import com.google.gson.annotations.SerializedName


data class VerifyOtpResponse(

        @SerializedName("access_token")
        var accessToken: String? = null,

        @SerializedName("refresh_token")
        var refreshToken: String? = null,

        @SerializedName("token_type")
        var tokenType: String? = null,

        @SerializedName("sso_id")
        val ssoId: String? = null
)