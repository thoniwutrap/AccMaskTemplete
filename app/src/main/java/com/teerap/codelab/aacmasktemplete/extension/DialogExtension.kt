package com.teerap.codelab.aacmasktemplete.extension

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.teerap.codelab.aacmasktemplete.dialog.ProgressDialog


fun AppCompatActivity.initDialog() : ProgressDialog {
    var progressDialog = ProgressDialog.shared()
    progressDialog.also {
        it.isCancelable = false
        return it
    }
}

