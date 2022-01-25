package com.example.bookstorespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookstoreSpringApplication

fun main(args: Array<String>) {
    runApplication<BookstoreSpringApplication>(*args)
}
