package com.teerap.codelab.aacmasktemplete.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.teerap.codelab.aacmasktemplete.data.local.entity.User
import com.teerap.codelab.aacmasktemplete.data.local.query.UserDao


@Database(
    entities = [User::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
