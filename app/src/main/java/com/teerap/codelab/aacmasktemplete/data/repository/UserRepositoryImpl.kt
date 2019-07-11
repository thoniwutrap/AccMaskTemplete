package com.teerap.codelab.aacmasktemplete.data.repository

import androidx.lifecycle.LiveData
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.data.local.query.UserDao
import com.teerap.codelab.aacmasktemplete.data.remote.APIServices
import com.teerap.codelab.aacmasktemplete.data.remote.dao.requests.SignInRequest
import io.reactivex.Scheduler



class UserRepositoryImpl(val localSource: UserDao, val remoteSource: APIServices,val scheduler: Scheduler) :
    UserRepository {


    override fun upsert(user: User) {
        localSource.upsert(user)
    }


    override fun singIn(phoneNumber : String, password : String): LiveData<User> {
        remoteSource.signIn(SignInRequest(phoneNumber = phoneNumber, password = password))
            .subscribeOn(scheduler)
            .subscribe{ user, _ -> user.let { localSource.upsert(user) }
            }
        return localSource.getUser("0")
    }


}





