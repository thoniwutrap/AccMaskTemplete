package com.teerap.codelab.aacmasktemplete.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.data.local.query.UserDao
import com.teerap.codelab.aacmasktemplete.data.remote.APIServices
import com.teerap.codelab.aacmasktemplete.data.remote.dao.requests.SignInRequest
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class UserRepositoryImpl(val localSource: UserDao, val remoteSource: APIServices,val scheduler: Scheduler) :
    UserRepository {


    override fun upsert(user: User) {
        localSource.upsert(user)
    }

    override fun singIn(phoneNumber: String?, password: String?): Observable<User> =
    remoteSource.signIn(SignInRequest(phoneNumber,password))
    .subscribeOn(Schedulers.io())
    .observeOn(AndroidSchedulers.mainThread())


}





