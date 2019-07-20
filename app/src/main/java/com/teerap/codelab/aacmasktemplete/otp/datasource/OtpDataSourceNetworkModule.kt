package com.teerap.codelab.aacmasktemplete.otp.datasource

import com.teerap.codelab.aacmasktemplete.otp.datasource.network.OtpApi
import com.teerap.codelab.aacmasktemplete.otp.datasource.network.OtpDataSourceNetwork
import dagger.Module
import dagger.Provides


@Module
class OtpDataSourceNetworkModule {
	@Provides
	fun provideOtpDataSourceNetwork(api : OtpApi) : OtpDataSource
			= OtpDataSourceNetwork(api)

}