package com.example.fetchdataretrofit.model

data class Book(
    val author_key: List<String> = listOf(""),
    val author_name: List<String> = listOf() ,
    val cover_edition_key: String = "",
    val cover_i: Int = 0,
    val edition_count: Int = 0,
    val first_publish_year: Int = 0,
    val has_fulltext: Boolean = false,
    val ia: List<Any> = listOf(""),
    val ia_collection_s: String = "",
    val key: String = "",
    val language: List<String> = listOf(""),
    val lending_edition_s: String = "",
    val lending_identifier_s: String = "",
    val public_scan_b: Boolean = false,
    val title: String = ""
)