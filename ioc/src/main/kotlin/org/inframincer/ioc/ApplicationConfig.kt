package org.inframincer.ioc

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
class ApplicationConfig {

//    @Bean
//    fun bookRepository(): BookRepository {
//        return BookRepository()
//    }
//
//    @Bean
//    fun bookService(): BookService {
//        val bookService = BookService()
//        bookService.bookRepository = BookRepository()
//        return bookService
//    }
}
