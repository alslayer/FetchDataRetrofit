package com.example.fetchdataretrofit.model

data class Post(
    val docs: List<Any>,
    val documentation_url: String,
    val numFound: Int,
    val numFoundExact: Boolean,
    val num_found: Int,
    val offset: Any,
    val q: String,
    val start: Int
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