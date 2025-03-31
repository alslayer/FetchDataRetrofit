package com.example.fetchdataretrofit.viewModel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchdataretrofit.model.Post
import kotlinx.coroutines.launch
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.fetchdataretrofit.model.OpenLibrarySearchResult
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.addAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Objects
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class PostViewModel: ViewModel() {

    //Moshi
    val _openLibrarySearchResult = mutableStateOf<OpenLibrarySearchResult?>(null)

    val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()


    val _posts = mutableStateOf(Post())


//    private var _posts=
//    val posts: State<List<Post>> = _posts
//    private lateinit var response: Response<Post>

    init {
        fetchPosts()
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun fetchPosts() {

        viewModelScope.launch {



            val response = RetrofitInstance.api.getPosts()
//            var newBody = response.


            //var body =
//            response.enqueue(object: Callback<OpenLibrarySearchResult>) {
//
//            }
//            var newBody = body.body().toString()
//            var body = response.body().toString()
//            var body = response.body?.string()

//            body = body.drop(5).dropLast(1)

//            _openLibrarySearchResult.value = moshi.adapter<OpenLibrarySearchResult>()
            _openLibrarySearchResult.value = response

            //Old not working code
//            _posts.value = response.body()!!
//            println(response.body()!!.numFound)


        //                _posts.value = RetrofitInstance.api.getPosts()
//            response.
//            println(response.toString())


//        GlobalScope.launch(Dispatchers.IO)  {
//            response = RetrofitInstance.api.getPosts()
//            catch (e: Exception) {
//                //Handle Errors
//                Log.e("TAG", "Error: " + e.message)
//            }
//            response.
//            println(response.toString())
        }
    }


}

