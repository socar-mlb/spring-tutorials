package org.inframincer.aop

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AopApplication

fun main(args: Array<String>) {
//    runApplication<AopApplication>(*args)

    val application = SpringApplication(AopApplication::class.java)
    application.webApplicationType = WebApplicationType.NONE
    application.run(*args)
}

