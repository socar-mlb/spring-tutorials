package org.inframincer.psa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.convert.ConversionService
import org.springframework.stereotype.Component

@Component
class ConversionServiceRunner : ApplicationRunner {

    @Autowired
    lateinit var conversionService: ConversionService

    override fun run(args: ApplicationArguments?) {
        // default registered converter
        println(conversionService)

//        println(conversionService.javaClass.toString())
        // class org.springframework.boot.autoconfigure.web.format.WebConversionService
        // extends DefaultFormattingConversionService
    }
}
