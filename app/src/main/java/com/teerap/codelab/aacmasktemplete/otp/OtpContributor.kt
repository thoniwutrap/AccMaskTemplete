package com.teerap.codelab.aacmasktemplete.otp

import com.teerap.codelab.aacmasktemplete.otp.presenter.OtpActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class OtpContributor {
    @ContributesAndroidInjector(modules = [OtpModule::class])
    abstract fun userContribute() : OtpActivity
}