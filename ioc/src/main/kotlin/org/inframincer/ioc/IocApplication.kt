package org.inframincer.ioc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("classpath:/app.properties")
class IocApplication

fun main(args: Array<String>) {
    runApplication<IocApplication>(*args)
}
