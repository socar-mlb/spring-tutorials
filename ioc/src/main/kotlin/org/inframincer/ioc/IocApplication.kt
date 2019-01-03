package org.inframincer.ioc

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext


class IocApplication

fun main(args: Array<String>) {
//    runApplication<IocApplication>(*args)
//    val context = ClassPathXmlApplicationContext("application.xml")
    val context: ApplicationContext = AnnotationConfigApplicationContext(ApplicationConfig::class.java)
    val beanDefinitionNames = Array(context.beanDefinitionCount) {
        i -> context.beanDefinitionNames[i]
    }
    for (name in beanDefinitionNames)
        println(name)

    val bookService = context.getBean("bookService") as BookService
    println(bookService.bookRepository != null)
}
