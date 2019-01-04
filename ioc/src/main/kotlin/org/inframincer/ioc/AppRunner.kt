package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class AppRunner: ApplicationRunner {

    @Autowired
    lateinit var single: Single

    @Autowired
    lateinit var proto: Proto

    override fun run(args: ApplicationArguments?) {
        println("Single")
        println(single)
        println(single)
        println(single)

        println("Proto")
        println(proto)
        println(proto)
        println(proto)

        println(single.proto)
        println(single.proto)
        println(single.proto)
    }
}
