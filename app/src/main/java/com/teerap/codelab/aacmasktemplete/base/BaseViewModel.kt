package com.teerap.codelab.aacmasktemplete.base

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel : ViewModel() {

    var disposable: CompositeDisposable? = null
    var mView : BaseView? = null

    init {
        disposable = CompositeDisposable()
    }

    override fun onCleared() {
        super.onCleared()
        if (disposable != null) {
            disposable?.clear()
            disposable = null
        }
    }
}