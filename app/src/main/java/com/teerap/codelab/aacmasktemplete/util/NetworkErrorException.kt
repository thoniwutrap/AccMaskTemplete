package com.teerap.codelab.aacmasktemplete.util

import android.content.Context
import android.util.Log
import android.widget.Toast
import retrofit2.HttpException
import java.io.IOException

class NetworkErrorException(message : String) : IOException(message)

fun Throwable.handleNetwork(context: Context?) : Boolean{
    return when (this) {
        is IOException -> {
            context?.toast("No internet Connection!!")
            false
        }
        is HttpException -> {
            //Error body
            true
        }
        else -> {
            false
        }
    }
}

