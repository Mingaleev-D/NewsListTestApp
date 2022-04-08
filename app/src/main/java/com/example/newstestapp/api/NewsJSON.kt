package com.example.newstestapp.api

data class NewsJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)