package org.inframincer.ioc

import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class MyEventHandler : ApplicationListener<MyEvent> {

    override fun onApplicationEvent(event: MyEvent) {
        println("My Event Handler data: ${event.data}")
    }
}
