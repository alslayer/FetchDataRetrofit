package com.example.fetchdataretrofit.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Works(
    @Json(name = "docs")
    val books: List<BookModel>,
//    val timeStamp: String,
)

@JsonClass(generateAdapter = true)
data class BookModel(
    val title: String,
    @Json(name = "author_name")
    val author: List<String>?,
    val key: String,
    val imageUrl: String = "",
)

@JsonClass(generateAdapter = true)
data class DetailModel(
    val book: BookModel,
    val description: String = "",
    val publishDate: String = "",
)
{
    companion object {
        val EMPTY = DetailModel(BookModel("", ArrayList<String>(), "", ""), "", "")
    }
}

//@JsonClass(generateAdapter = true)
//data class Works(
//    val numFound: Int,
//    val start: Int,
//    val numFoundExact: Boolean,
//    val docs: List<OpenLibraryBook>
//)
//
//@JsonClass(generateAdapter = true)
//data class OpenLibraryBook(
//    val key: String,
//    val title: String,
//)


//@JsonClass(generateAdapter = true)
//data class Works(
//    val books: List<BookModel>,
//    val timeStamp: String,
//)

//@JsonClass(generateAdapter = true)
//data class BookModel(
//    val title: String,
//    val author: String,
//    val key: String,
//    val imageUrl: String = "",
//)
//
//@Serializable
//data class DetailModel(
//    val book: BookModel,
//    val description: String = "",
//    val publishDate: String = "",
//) {
//    companion object {
//        val EMPTY = DetailModel(BookModel("", "", "", ""), "", "")
//    }
//}
