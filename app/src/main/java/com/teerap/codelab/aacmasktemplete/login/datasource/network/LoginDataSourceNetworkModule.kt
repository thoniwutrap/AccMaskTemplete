package com.teerap.codelab.aacmasktemplete.login.datasource.network

import com.teerap.codelab.aacmasktemplete.login.datasource.LoginDataSource
import com.teerap.codelab.aacmasktemplete.login.datasource.LoginRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class LoginDataSourceNetworkModule {

	@Provides
	fun provideLoginAPI(retrofit: Retrofit) : LoginAPI{
		return retrofit.create(LoginAPI::class.java)
	}

	@Provides
	fun provideLoginDataSourceNetwork(dataSourceNetwork: LoginDataSourceNetwork) : LoginDataSource{
		return LoginRepository(dataSourceNetwork)
	}

}
