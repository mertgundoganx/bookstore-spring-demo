package com.example.bookstorespring.model

import org.springframework.data.annotation.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,
    val author: String,
    val category: String = "No Category",
    val pages: Int = 0,
    val year: Int = 0,
    val publisher: String = "No Publisher",
    val stock: Int = 0,
    val isOnSale: Boolean = false
)
