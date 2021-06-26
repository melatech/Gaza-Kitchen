package com.melatech.gazakitchen.repository

import com.melatech.gazakitchen.data.remote.FoodApi
import com.melatech.gazakitchen.data.remote.res.Pizza
import com.melatech.gazakitchen.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class FoodRepositoryImpl @Inject constructor(
    private val api: FoodApi
) {
    suspend fun getFoodSearch1(from: Int, to: Int): Resource<Pizza> {
        val response = try {
            api.getFoodSearch1(from, to)

        }catch (e:Exception){
            return Resource.Error("An unknown error 1 occurred...")
        }
        return Resource.Success(response)
    }

    suspend fun getFoodSearch2(from: Int, to: Int): Resource<Pizza> {
        val response = try {
            api.getFoodSearch1(from, to)

        }catch (e:Exception){
            return Resource.Error("An unknown error 2 occurred...")
        }
        return Resource.Success(response)
    }
}