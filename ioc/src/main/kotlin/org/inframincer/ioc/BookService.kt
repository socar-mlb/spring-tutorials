package org.inframincer.ioc

import org.springframework.stereotype.Service

@Service
class BookService {

    var bookRepository: BookRepository
        get() = BookRepository()
        set(value) {
            BookRepository()
        }
}
