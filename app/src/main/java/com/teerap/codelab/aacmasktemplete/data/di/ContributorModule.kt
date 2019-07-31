package com.teerap.codelab.aacmasktemplete.data.di

import com.teerap.codelab.aacmasktemplete.login.LoginContributor
import com.teerap.codelab.aacmasktemplete.otp.OtpContributor
import dagger.Module

@Module(includes = [OtpContributor::class,
	LoginContributor::class])
class ContributorModule