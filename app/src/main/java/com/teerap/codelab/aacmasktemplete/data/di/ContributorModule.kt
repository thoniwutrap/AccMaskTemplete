package com.teerap.codelab.aacmasktemplete.data.di

import com.teerap.codelab.aacmasktemplete.otp.OtpContributor
import dagger.Module

@Module(includes = [OtpContributor::class])
class ContributorModule