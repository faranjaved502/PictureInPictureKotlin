package com.example.android.pictureinpicture.di

import com.example.android.pictureinpicture.usecase.SystemClockWrapper
import com.example.android.pictureinpicture.usecase.SystemClockWrapperImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideSystemClock(): SystemClockWrapper {
        return SystemClockWrapperImpl()
    }
}