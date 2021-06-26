package com.melatech.gazakitchen.di

import com.melatech.gazakitchen.data.remote.FoodApi
import com.melatech.gazakitchen.repository.FoodRepositoryImpl
import com.melatech.gazakitchen.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideFoodRepositoryImpl(
        api: FoodApi
    ) = FoodRepositoryImpl(api)

    @Singleton
    @Provides
    fun provideFoodApi(
    ): FoodApi{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(FoodApi::class.java)
    }
}