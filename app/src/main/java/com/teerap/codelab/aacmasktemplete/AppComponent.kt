package com.teerap.codelab.aacmasktemplete

import com.teerap.codelab.aacmasktemplete.data.di.LocalDataModule
import com.teerap.codelab.aacmasktemplete.data.di.RemoteDataModule
import com.teerap.codelab.aacmasktemplete.data.di.UserRepositoryModule
import com.teerap.codelab.aacmasktemplete.ui.SignInViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [
    LocalDataModule::class,
    RemoteDataModule::class,
    UserRepositoryModule::class])
interface AppComponent {
    fun inject(signInViewModel: SignInViewModel)
}

