package com.example.fetchdataretrofit.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.fetchdataretrofit.model.Book
import com.example.fetchdataretrofit.model.OpenLibraryBook
import com.example.fetchdataretrofit.model.OpenLibrarySearchResult
import com.example.fetchdataretrofit.model.Post
import com.example.fetchdataretrofit.view.theme.PurpleGrey40
import com.example.fetchdataretrofit.viewModel.PostViewModel

@Composable
fun PostListScreen (viewModel: PostViewModel =PostViewModel(), paddingValues :PaddingValues) {

    val posts by viewModel._openLibrarySearchResult
//    val docs = posts.docs
    val openLibrarySearchResult = viewModel._openLibrarySearchResult.value

    if (posts == null){
        CircularProgressIndicator()
    } else {
        LazyColumn (
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
//            println("In column" + posts.numFound)
//            val sendList = convertListToMyObjectList(docs)
//            var count = 0

//            openLibrarySearchResult?.docs?.forEach { book ->
//                    PostCard(
//                        post = openLibrarySearchResult
//                    )
//            }

            val bookCount = openLibrarySearchResult?.numFound
            val bookList: List<OpenLibraryBook> = openLibrarySearchResult!!.docs

//            if (bookCount != null) {

                items(bookList){
                    if (openLibrarySearchResult != null) {
                        PostCard(
                            post = (it)
                        )
                    }
                }

//            }
        }
    }
}

@Composable
fun PostCard(post: OpenLibraryBook) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(PurpleGrey40)
    ) {
        Column (modifier = Modifier.padding(16.dp)) {
//            post?.docs?.forEach { book ->
//                Text(text = book.title)
            if (post != null) {
                Text(text = post.title,style = MaterialTheme.typography.bodyLarge, color = Color.White )
            }
//            }

//            println("In column" + post.)
//            Text(text = "Post #${post.get(count)}",style = MaterialTheme.typography.bodyLarge, color = Color.White )
//            Text(text = post.documentation_url, style = MaterialTheme.typography.bodyMedium, color = Color.White )
//            Text(text = post.body, style = MaterialTheme.typography.bodySmall, color = Color.White )

        }
    }
}


//data class MyObject(val value: String)
//
fun convertListToMyObjectList(stringList: List<Any>): List<Book> {
    val mutableList: MutableList<Book> = mutableListOf(Book())
    return stringList.map { str -> mutableList.set(
        0,
        element = TODO()
    ) }
}
//
//// Example usage:
//val strings = listOf("one", "two", "three")
//val objects = convertListToMyObjectList(strings)
//// objects will be: [MyObject(value="one"), MyObject(value="two"), MyObject(value="three")]










