package com.teerap.codelab.aacmasktemplete

import android.app.Application
import com.teerap.codelab.aacmasktemplete.data.di.LocalDataModule
import com.teerap.codelab.aacmasktemplete.data.di.RemoteDataModule
import com.teerap.codelab.aacmasktemplete.data.di.UserRepositoryModule


class MainApplication : Application() {

   var  component: AppComponent? = null


    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .localDataModule(LocalDataModule(applicationContext))
            .remoteDataModule(RemoteDataModule())
            .userRepositoryModule(UserRepositoryModule())
            .build()
    }

}
