package org.inframincer.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class ProxySimpleEventService : EventService {

    @Autowired
//    lateinit var simpleEventService: SimpleEventService
    lateinit var simpleEventService: EventService

    override fun createEvent() {
        val begin = System.currentTimeMillis()
        // delegation
        simpleEventService.createEvent()
        println(System.currentTimeMillis() - begin)
    }

    override fun publishEvent() {
        val begin = System.currentTimeMillis()
        // delegation
        simpleEventService.publishEvent()
        println(System.currentTimeMillis() - begin)
    }

    override fun deleteEvent() {
        // delegation
        simpleEventService.deleteEvent()
    }
}
