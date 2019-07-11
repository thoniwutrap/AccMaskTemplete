package com.teerap.codelab.aacmasktemplete.data.di

import com.teerap.codelab.aacmasktemplete.BuildConfig
import com.teerap.codelab.aacmasktemplete.data.remote.APIServices
import com.teerap.codelab.aacmasktemplete.data.remote.ConnectionInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.ConnectionSpec
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.TlsVersion
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class RemoteDataModule(var baseURL : String = BuildConfig.KeAppBaseURL) {


    @Provides
    @Singleton
    fun provideAPIServices(retrofit: Retrofit): APIServices
            = retrofit.create(APIServices::class.java)


    @Provides
    @Singleton
    fun provideOkhttp(): OkHttpClient{
        val logger = HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        }
        return OkHttpClient.Builder()
            .addInterceptor(logger)
            .addInterceptor(ConnectionInterceptor())
            .connectionSpecs(
                arrayListOf(
                    ConnectionSpec.MODERN_TLS,
                    ConnectionSpec.CLEARTEXT,
                    ConnectionSpec.COMPATIBLE_TLS)
            )
            .followRedirects(true)
            .followSslRedirects(true)
            .retryOnConnectionFailure(true)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .cache(null)
            .build()

}

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient : OkHttpClient): Retrofit
            = Retrofit.Builder()
        .baseUrl(baseURL)
        .client(okHttpClient)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}

