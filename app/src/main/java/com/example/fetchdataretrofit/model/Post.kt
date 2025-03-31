package com.example.fetchdataretrofit.model

data class Post(
    val docs: List<Any> = listOf(""),
    val documentation_url: String = "",
    val numFound: Int = 0,
    val numFoundExact: Boolean = false,
    val num_found: Int = 0,
    val q: String = "",
    val start: Int = 0
)


//val docs: List<Any>,
//val documentation_url: String,
//val numFound: Int,
//val numFoundExact: Boolean,
//val num_found: Int,
//val offset: Any,
//val q: String,
//val start: Int


//val id: String,
//val title: String,
//val body: String