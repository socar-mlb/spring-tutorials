package org.inframincer.ioc

import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.ContextStartedEvent
import org.springframework.context.event.ContextStoppedEvent
import org.springframework.context.event.EventListener
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
class MyEventHandlerOrder {

    @EventListener
    @Order(Ordered.LOWEST_PRECEDENCE)
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

    @EventListener
    fun handle3(event: ContextRefreshedEvent) {
        println("ContextRefreshedEvent ${event.source}")
    }

    @EventListener
    fun handle4(event: ContextStartedEvent) {
        println("ContextStartedEvent ${event.source}")
    }

    @EventListener
    fun handle5(event: ContextStoppedEvent) {
        println("ContextStoppedEvent ${event.source}")
    }

    @EventListener
    fun handle6(event: ContextClosedEvent) {
        println("ContextClosedEvent ${event.source}")
    }
}
