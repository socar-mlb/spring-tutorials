package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class BookService {

//    var bookRepository: BookRepository
//        get() = BookRepository()
//        set(value) {
//            BookRepository()
//        }

    @Autowired
    lateinit var myBook1Repository: BookRepository

    @Autowired
    @Qualifier("myBook2Repository")
    lateinit var bookRepository: BookRepository

    @Autowired
    lateinit var bookRepositories: Array<BookRepository>

    @PostConstruct
    fun printBookRepository() {
        println(myBook1Repository.javaClass.name)

        println(bookRepository.javaClass.name)

        bookRepositories.forEach {
            println(it.javaClass.name)
        }
    }
}
