package com.teerap.codelab.aacmasktemplete.data.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.teerap.codelab.aacmasktemplete.data.local.AppDatabase
import com.teerap.codelab.aacmasktemplete.data.local.query.UserDao
import dagger.Module
import dagger.Provides
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Module
class LocalDataModule() {

	val DATABASE_FILE_NAME = "tr-aac-db"


	@Provides
	@Singleton
	fun provideUserDao(db: AppDatabase): UserDao = db.userDao()



	@Provides
	@Singleton
	fun provideAppDatabase(application: Application): AppDatabase =
			Room.databaseBuilder(
					application,
					AppDatabase::class.java,
					DATABASE_FILE_NAME)
					.build()

}