package com.example.fetchdataretrofit.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.fetchdataretrofit.model.Works

class PostViewModel: ViewModel() {
    //Moshi
    val _openLibrarySearchResult = mutableStateOf<Works?>(null)

    init {
        fetchPosts()
    }

    private fun fetchPosts() {
        viewModelScope.launch {
            val response = RetrofitInstance.api.getPosts()
            _openLibrarySearchResult.value = response
        }
    }
}

