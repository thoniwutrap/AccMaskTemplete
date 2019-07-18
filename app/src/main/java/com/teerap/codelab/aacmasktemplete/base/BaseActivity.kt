package com.teerap.codelab.aacmasktemplete.base

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.teerap.codelab.aacmasktemplete.MainApplication
import com.teerap.codelab.aacmasktemplete.dialog.ProgressDialog
import com.teerap.codelab.aacmasktemplete.extension.initDialog

open class BaseActivity : AppCompatActivity(),BaseView {


    var loadingDialog = this.initDialog()

    override fun context(): Context  = this

    override fun showDialog() {
        loadingDialog.show(supportFragmentManager,"Loading")
    }

    override fun dismissDialog() {
        loadingDialog.dismissAllowingStateLoss()
    }
}