package com.example.arquiteturamvvm.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.arquiteturamvvm.data.APIService
import com.example.arquiteturamvvm.data.response.BookBodyResponse
import com.example.arquiteturamvvm.model.Book
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        //booksLiveData.value = createFakeBooks()
        APIService.service.getBooks().enqueue(object: Callback<BookBodyResponse>{
            override fun onResponse(call: Call<BookBodyResponse>, response: Response<BookBodyResponse>) {
                if (response.isSuccessful){
                    val books: MutableList<Book> = mutableListOf()
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

    fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Title 1", "Author 1"),
            Book("Title 2", "Author 2"),
            Book("Title 3", "Author 3"),
            Book("Title 4", "Author 4"),
            Book("Title 1", "Author 1"),
            Book("Title 2", "Author 2"),
            Book("Title 3", "Author 3"),
            Book("Title 4", "Author 4"),
            Book("Title 1", "Author 1"),
            Book("Title 2", "Author 2"),
            Book("Title 3", "Author 3"),
            Book("Title 4", "Author 4")
        )
    }
}

private fun <T> Call<T>.enqueue(callback: Callback<BookBodyResponse>) {

}
