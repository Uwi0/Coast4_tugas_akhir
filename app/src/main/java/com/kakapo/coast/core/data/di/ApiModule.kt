package com.kakapo.coast.core.data.di

import com.kakapo.coast.core.data.api.SpoonacularApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun providesSpoonacularApi(retrofit: Retrofit): SpoonacularApi{
        return retrofit.create(SpoonacularApi::class.java)
    }
}