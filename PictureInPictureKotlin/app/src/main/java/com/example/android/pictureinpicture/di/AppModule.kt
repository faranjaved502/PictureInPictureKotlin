package com.example.android.pictureinpicture.di

import com.example.android.pictureinpicture.repository.TimerRepository
import com.example.android.pictureinpicture.repository.TimerRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideTimerRepository(): TimerRepository {
      return TimerRepositoryImpl()
    }
}