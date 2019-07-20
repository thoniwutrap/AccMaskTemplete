package com.teerap.codelab.aacmasktemplete.data.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


@Module
class AppModule {

	@Provides
	fun provideRxPresenter() : CompositeDisposable = CompositeDisposable()
}