package com.example.newstestapp

import com.example.newstestapp.api.NewsJSON
import retrofit2.http.GET

interface APIRequest {

    @GET("/v1/latest-news?language=ru&apiKey=7goxs3CKQUAJRGhquf6BovIkIToi_vj5Uii2lTrQCVE9EtY2")
    suspend fun getNews() : NewsJSON
}