package org.inframincer.ioc

import org.inframincer.ioc2.MyBook3Repository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import java.util.function.Supplier

@SpringBootApplication
class IocApplication

fun main(args: Array<String>) {
//    runApplication<IocApplication>(*args)
    var application = SpringApplication(IocApplication::class.java)
    application.addInitializers(ApplicationContextInitializer<GenericApplicationContext> {
        applicationContext -> applicationContext.registerBean(MyBook3Repository::class.java)
        applicationContext.registerBean(ApplicationRunner::class.java, Supplier<ApplicationRunner> {
                ApplicationRunner {
                    println("Functional Bean Definition!!")
                }
            })
    })
    application.run(*args)

}
