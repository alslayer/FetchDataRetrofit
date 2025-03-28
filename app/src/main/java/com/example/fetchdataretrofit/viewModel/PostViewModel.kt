package com.example.fetchdataretrofit.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchdataretrofit.model.Post
import kotlinx.coroutines.launch
import androidx.compose.runtime.State
import java.util.Objects

class PostViewModel: ViewModel() {
    private val _posts= mutableStateOf<List<Post>>(emptyList())
    val posts: State<List<Post>> = _posts

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