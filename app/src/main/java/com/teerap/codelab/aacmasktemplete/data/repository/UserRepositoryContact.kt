package com.teerap.codelab.aacmasktemplete.data.repository

import androidx.lifecycle.LiveData
import com.teerap.codelab.aacmasktemplete.data.local.entity.User

interface UserRepositoryContact {

    fun upsert(user: User)
    fun singIn(phoneNumber : String, password : String): LiveData<User>
}