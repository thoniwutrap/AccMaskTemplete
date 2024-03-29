package com.teerap.codelab.aacmasktemplete

import android.app.Application
import com.teerap.codelab.aacmasktemplete.data.di.AppModule
import com.teerap.codelab.aacmasktemplete.data.di.ContributorModule
import com.teerap.codelab.aacmasktemplete.data.di.LocalDataModule
import com.teerap.codelab.aacmasktemplete.data.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    LocalDataModule::class,
    ContributorModule::class])

interface AppComponent  : AndroidInjector<MainApplication>{
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>() {
        @BindsInstance
        abstract fun application(application: Application): Builder
    }

}
