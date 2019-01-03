package org.inframincer.ioc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IocApplication

fun main(args: Array<String>) {
    val context = runApplication<IocApplication>(*args)
//    val context = ClassPathXmlApplicationContext("application.xml")
//    val context: ApplicationContext = AnnotationConfigApplicationContext(ApplicationConfig::class.java)
    val beanDefinitionNames = Array(context.beanDefinitionCount) {
        i -> context.beanDefinitionNames[i]
    }
    for (name in beanDefinitionNames)
        println(name)

//    val bookService = context.getBean("bookService") as BookService
//    println(bookService.bookRepository != null)
}
