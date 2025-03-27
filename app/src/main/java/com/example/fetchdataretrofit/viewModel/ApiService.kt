package com.example.fetchdataretrofit.viewModel

import com.example.fetchdataretrofit.model.BitcoinX
import com.example.fetchdataretrofit.model.Post
import com.example.fetchdataretrofit.model.bitcoin
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}

//@GET("posts")
//suspend fun getPosts(): List<Post>

//https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd