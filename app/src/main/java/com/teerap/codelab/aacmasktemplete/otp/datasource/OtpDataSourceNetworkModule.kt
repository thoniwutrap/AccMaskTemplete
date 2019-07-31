package com.teerap.codelab.aacmasktemplete.otp.datasource

import com.teerap.codelab.aacmasktemplete.otp.datasource.network.OtpApi
import com.teerap.codelab.aacmasktemplete.otp.datasource.network.OtpDataSourceNetwork
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class OtpDataSourceNetworkModule {

	@Provides
	fun provideOtpApi(retrofit: Retrofit): OtpApi = retrofit.create(OtpApi::class.java)


	@Provides
	fun provideOtpDataSourceNetwork(dataSourceNetwork: OtpDataSourceNetwork) : OtpDataSource
			= OtpRepository(dataSourceNetwork)

}