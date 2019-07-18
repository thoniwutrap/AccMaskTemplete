package com.teerap.codelab.aacmasktemplete.base

import android.content.Context
import android.view.View

interface BaseView {

    fun context() : Context

    fun showDialog()

    fun dismissDialog()

}