package org.inframincer.ioc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.ReloadableResourceBundleMessageSource

@SpringBootApplication
@PropertySource("classpath:/app.properties")
class IocApplication

fun main(args: Array<String>) {
    val application = runApplication<IocApplication>(*args)
    application.start()
    Thread.sleep(5000)
    application.stop()

    @Bean
    fun messageSource(): MessageSource {
        val messageSource = ReloadableResourceBundleMessageSource()
        messageSource.setBasename("classpath:/messages")
        messageSource.setDefaultEncoding("UTF-8")
        messageSource.setCacheSeconds(3)
        return messageSource
    }
}
