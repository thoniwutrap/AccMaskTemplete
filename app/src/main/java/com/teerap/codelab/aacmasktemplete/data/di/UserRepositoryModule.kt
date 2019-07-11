package com.teerap.codelab.aacmasktemplete.data.di

import com.teerap.codelab.aacmasktemplete.data.local.query.UserDao
import com.teerap.codelab.aacmasktemplete.data.remote.APIServices
import com.teerap.codelab.aacmasktemplete.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

@Module
class UserRepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository(localSource: UserDao, remoteSource: APIServices): UserRepository
            = UserRepository(localSource, remoteSource, Schedulers.io())
}