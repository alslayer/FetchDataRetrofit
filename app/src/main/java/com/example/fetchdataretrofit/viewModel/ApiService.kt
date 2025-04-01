package com.example.fetchdataretrofit.viewModel

import com.example.fetchdataretrofit.model.Works
import retrofit2.http.GET

interface ApiService {
    @GET("/search.json?q=the+lord+of+the+rings")
    suspend fun getPosts(): Works
}
