package com.example.bookstorespring.controller

import com.example.bookstorespring.model.Book
import com.example.bookstorespring.service.BooksService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/books")
class BooksController(private val service: BooksService) {

    @GetMapping
    fun getAllBooks(): List<Book> = service.getAllBooks()

    @GetMapping("/{id}")
    fun getBook(@PathVariable id: Long): Book = service.getBook(id)

    @PostMapping
    fun saveBook(@RequestBody book: Book): Book = service.saveBook(book)

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id: Long): Book = service.deleteBook(id)

}