package com.example.arquiteturamvvm.data

import com.example.arquiteturamvvm.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "xoS6ZuRYgG3YgrLEAq8SDPdCZXnFrqzu",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<List<BookBodyResponse>>
}