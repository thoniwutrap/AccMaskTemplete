package com.teerap.codelab.aacmasktemplete.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.teerap.codelab.aacmasktemplete.R


class ProgressDialog : DialogFragment() {


    companion object {
        fun shared(): ProgressDialog {
            val dialog = ProgressDialog()
            dialog.isCancelable = true
            return dialog
        }
    }

    override fun show(manager: FragmentManager?, tag: String?) {
        if(!isAdded){
            super.show(manager, tag)
        }
    }

    override fun dismiss() {
        if(dialog != null){
            super.dismiss()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.progress_bar_loading_dialog, container, true)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return view
    }


}