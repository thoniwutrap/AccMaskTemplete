package com.teerap.codelab.aacmasktemplete.data.remote.dao.requests

import com.google.gson.annotations.SerializedName


data class SignInRequest(

    @SerializedName( "phoneNumber")
    val phoneNumber: String? = null,
    @SerializedName( "password")
    val password: String? = null


)

