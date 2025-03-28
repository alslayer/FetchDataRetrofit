package com.example.fetchdataretrofit.viewModel

import androidx.collection.ObjectList
import com.example.fetchdataretrofit.model.Post
import retrofit2.Response
import retrofit2.http.GET
import java.util.Objects
import kotlin.jvm.internal.Ref.ObjectRef

interface ApiService {
    @GET("/search.json?q=the+lord+of+the+rings")
    suspend fun getPosts(): Response<ObjectRef<Post>>
}

//@GET("posts")
//suspend fun getPosts(): List<Post>

//https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd

//https://openlibrary.org/search.json?q=the+lord+of+the+rings