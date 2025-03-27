package com.example.fetchdataretrofit.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchdataretrofit.model.Post
import kotlinx.coroutines.launch
import androidx.compose.runtime.State
import com.example.fetchdataretrofit.model.BitcoinX
import com.example.fetchdataretrofit.model.bitcoin
import java.util.Objects

class PostViewModel: ViewModel() {
    private val _posts= mutableStateOf<Post>(
        value = TODO(),
        policy = TODO()
    )
    val posts: State<Post> = _posts

    init {
        fetchPosts()
    }

    private fun fetchPosts() {
        viewModelScope.launch {
            try {
                _posts.value = RetrofitInstance.api.getPosts()
            } catch (e: Exception) {
                //Handle Errors
            }
        }
    }


}