package com.example.basics

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue

@Composable
fun PostList(viewModel: MainViewModel) {
    val posts by viewModel.posts
    LazyColumn {
        items(posts) {
                post ->
            Text(text = post.title)
        }
    }
    DisposableEffect(Unit) {
        viewModel.getPosts()
        onDispose {}
    }
}