package org.inframincer.spel

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
class SpELRunner : ApplicationRunner {

    // #{} expression
    // ${} property

    @Value("#{1 + 1}")
    val two: Int = 0

    @Value("#{1 eq 1}")
    val trueOrFalse = false

    @Value("hello")
    lateinit var hello: String

    @Value("#{'hello ' + 'world'}")
    lateinit var helloWorld: String

    @Value("\${my.value}")
    val myValue: Int = 0

    @Value("#{\${my.value} eq 100}")
    val isMyValue100 = false

    @Value("#{sampleBean.data}")
    val sampleBeanData = 0

    override fun run(args: ApplicationArguments?) {
        println(hello)
        println(two)
        println(trueOrFalse)
        println(helloWorld)
        println(myValue)
        println(isMyValue100)
        println(sampleBeanData)
    }
}
