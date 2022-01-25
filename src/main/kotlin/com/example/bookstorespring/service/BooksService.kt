package com.example.bookstorespring.service

import com.example.bookstorespring.datasource.IBooksDataSource
import com.example.bookstorespring.model.Book
import org.springframework.stereotype.Service

@Service
class BooksService(private val dataSource: IBooksDataSource) {

    fun getAllBooks(): List<Book> = dataSource.getAllBooks()

    fun getBook(id: Long): Book = dataSource.getBook(id)

    fun saveBook(book: Book): Book = dataSource.saveBook(book)

    fun deleteBook(id: Long): Book = dataSource.deleteBook(id)

}