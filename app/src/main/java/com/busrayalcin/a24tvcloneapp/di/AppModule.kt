package com.busrayalcin.a24tvcloneapp.di

import com.busrayalcin.a24tvcloneapp.data.repo.NewsRepo
import com.busrayalcin.a24tvcloneapp.retrofit.ApiUtils
import com.busrayalcin.a24tvcloneapp.retrofit.NewsDao
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
    fun provideNewsDaoRepo(ndao : NewsDao) : NewsRepo {
        return NewsRepo(ndao)
    }

    @Provides
    @Singleton
    fun provideNewsDao() : NewsDao{
        return ApiUtils.getNewsDao()
    }
}