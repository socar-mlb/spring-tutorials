package org.inframincer.ioc

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {

    @Bean
    fun bookRepository(): BookRepository {
        return BookRepository()
    }

    @Bean
    fun bookService(): BookService {
        val bookService = BookService()
        bookService.bookRepository = BookRepository()
        return bookService
    }
}
