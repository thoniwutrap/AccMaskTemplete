package com.teerap.codelab.aacmasktemplete.data.repository

import androidx.lifecycle.LiveData
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import io.reactivex.Observable


interface UserRepository{
    fun upsert(user: User)
    fun singIn(phoneNumber : String?, password : String?): Observable<User>
}
