package com.example.fetchdataretrofit.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OpenLibrarySearchResult(
    val numFound: Int,
    val start: Int,
    val numFoundExact: Boolean,
    val docs: List<OpenLibraryBook>
)

@JsonClass(generateAdapter = true)
data class OpenLibraryBook(
    val key: String,
    val title: String,
)