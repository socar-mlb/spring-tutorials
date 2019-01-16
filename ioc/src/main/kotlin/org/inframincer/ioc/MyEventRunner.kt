package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class MyEventRunner : ApplicationRunner {

    @Autowired
    lateinit var context: ApplicationContext

    @Autowired
    lateinit var publishEvent: ApplicationEventPublisher

    override fun run(args: ApplicationArguments?) {
//        context.publishEvent(MyEvent(this, 100))
        publishEvent.publishEvent(MyEvent(this, 100))
        publishEvent.publishEvent(MyPojoEvent(this, 100))
    }
}
