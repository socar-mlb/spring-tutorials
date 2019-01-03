package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService {

//    var bookRepository: BookRepository
//        get() = BookRepository()
//        set(value) {
//            BookRepository()
//        }

    @Autowired
    lateinit var bookRepository: BookRepository
}
