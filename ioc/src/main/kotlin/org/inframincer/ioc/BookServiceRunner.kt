package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class BookServiceRunner : ApplicationRunner {

    @Autowired
    lateinit var bookService: BookService

    override fun run(args: ApplicationArguments?) {
        bookService.printBookRepository()
    }
}