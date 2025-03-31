package com.example.fetchdataretrofit.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.fetchdataretrofit.model.OpenLibrarySearchResult

class PostViewModel: ViewModel() {
    //Moshi
    val _openLibrarySearchResult = mutableStateOf<OpenLibrarySearchResult?>(null)

    init {
        fetchPosts()
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun fetchPosts() {
        viewModelScope.launch {
            val response = RetrofitInstance.api.getPosts()
            _openLibrarySearchResult.value = response
        }
    }

}

