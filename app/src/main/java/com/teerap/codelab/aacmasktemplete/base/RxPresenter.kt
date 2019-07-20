package com.teerap.codelab.aacmasktemplete.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

open class RxPresenter @Inject constructor(val compositeDisposable: CompositeDisposable) :
		LifecycleObserver {

	@OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
	fun onDestroy() {
		compositeDisposable.dispose()
	}
}