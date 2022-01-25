package com.example.bookstorespring.datasource

import com.example.bookstorespring.model.Book
import org.springframework.stereotype.Repository

@Repository
class BooksDataSource : IBooksDataSource {

    val bookList = mutableListOf(
        Book(title = "Nutuk", author = "Mustafa Kemal Ataturk"),
        Book(title = "Dar Koridor", author = "Daron Acemoglu")
    )

    override fun getAllBooks(): List<Book> {
        return bookList
    }

    override fun getBook(id: Long): Book {
        return bookList.firstOrNull() {
            it.id == id
        } ?: throw NoSuchElementException()
    }

    override fun saveBook(book: Book): Book {
        if (bookList.any { it.id == book.id }) {
            throw IllegalArgumentException()
        }
        bookList.add(book)
        return book
    }

    override fun deleteBook(id: Long): Book {
        bookList.firstOrNull { it.id == id }
            ?: throw NoSuchElementException()
        return bookList[0]
    }

}
