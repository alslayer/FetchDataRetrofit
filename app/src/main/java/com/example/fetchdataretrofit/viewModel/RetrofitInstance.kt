package com.example.fetchdataretrofit.viewModel

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://openlibrary.org")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(ApiService::class.java)
    }
}


//val api: ApiService by lazy {
//    Retrofit.Builder()
//        .baseUrl("https://jsonplaceholder.typicode.com")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//        .create(ApiService::class.java)
//}

//https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd

//https://openlibrary.org/search.json?q=the+lord+of+the+rings