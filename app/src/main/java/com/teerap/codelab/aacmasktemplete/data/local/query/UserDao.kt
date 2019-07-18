package com.teerap.codelab.aacmasktemplete.data.local.query

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.teerap.codelab.aacmasktemplete.data.local.entity.User


@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    fun upsert(user : User) : Long

    @Query("SELECT * FROM user WHERE uid = :uid")
    fun getUser(uid : String) : LiveData<User>



}