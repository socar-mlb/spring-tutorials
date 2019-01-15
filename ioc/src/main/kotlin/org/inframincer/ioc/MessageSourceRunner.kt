package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.MessageSource
import org.springframework.stereotype.Component
import java.util.Locale

@Component
class MessageSourceRunner : ApplicationRunner {

    @Autowired
    lateinit var messageSource: MessageSource

    override fun run(args: ApplicationArguments?) {
        println("Locale.getDefault() ${Locale.getDefault()}")
        Locale.setDefault(Locale.US)
        println(messageSource.getMessage("greeting", arrayOf("developer"), Locale.getDefault()))
        Locale.setDefault(Locale.KOREA)
        println(messageSource.getMessage("greeting", arrayOf("developer"), Locale.KOREA))
    }


}