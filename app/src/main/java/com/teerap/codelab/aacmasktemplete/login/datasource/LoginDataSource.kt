package com.teerap.codelab.aacmasktemplete.login.datasource

import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import io.reactivex.Observable

interface LoginDataSource {



	fun login(mobileNo : String,password : String) : Observable<User>

}