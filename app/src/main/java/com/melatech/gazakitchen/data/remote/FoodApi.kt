package com.melatech.gazakitchen.data.remote

import com.melatech.gazakitchen.data.remote.res.Pizza
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FoodApi {

    @GET("pizza")
    suspend fun getFoodSearch1(
        @Query("from") from:Int,
        @Query("") to: Int
    ): Pizza

    @GET("{name}")
    suspend fun getFoodSearch2(
        @Path("name") q:String,
        @Query("") to: Int
    ): Pizza


}