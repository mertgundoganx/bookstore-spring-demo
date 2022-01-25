package com.example.bookstorespring.datasource

import com.example.bookstorespring.model.Book

interface IBooksDataSource {

    fun getAllBooks(): List<Book>

    fun getBook(id: Long): Book

    fun saveBook(book: Book): Book

    fun deleteBook(id: Long): Book

}
