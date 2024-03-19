package com.example.basics

import retrofit2.http.GET
data class Post(
    val id: Int,
    val title: String,
    val body: String
)
interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}

