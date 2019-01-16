package org.inframincer.ioc

import org.springframework.context.event.EventListener
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class MyEventHandlerOrder {

    @EventListener
    @Order(Ordered.LOWEST_PRECEDENCE)
    @Async
    fun handle1(event: MyPojoEvent) {
        println("My Event LOWEST_PRECEDENCE Handler data: ${event.data}")
        println(Thread.currentThread().toString())
    }

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    fun handle2(event: MyPojoEvent) {
        println("My Event HIGHEST_PRECEDENCE Handler data: ${event.data}")
        println(Thread.currentThread().toString())
    }
}
