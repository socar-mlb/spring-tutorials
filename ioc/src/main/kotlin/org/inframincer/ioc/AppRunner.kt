package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationContext

//@Component
class AppRunner: ApplicationRunner {

    @Autowired
    lateinit var single: Single

    @Autowired
    lateinit var proto: Proto

    @Autowired
    lateinit var context: ApplicationContext

    override fun run(args: ApplicationArguments?) {
        println("scope singleton")
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

        println("scope prototype")
        println("Single")
        println(context.getBean(Single::class.java))
        println(context.getBean(Single::class.java))
        println(context.getBean(Single::class.java))

        println("Proto")
        println(context.getBean(Proto::class.java))
        println(context.getBean(Proto::class.java))
        println(context.getBean(Proto::class.java))

        println(context.getBean(Single::class.java).proto)
        println(context.getBean(Single::class.java).proto)
        println(context.getBean(Single::class.java).proto)
    }
}
