package org.inframincer.ioc

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class MyPojoEventHandler {

    @EventListener
    fun onApplicationEvent(event: MyPojoEvent) {
        println("My Pojo Event Handler data: ${event.data}")
    }
}
