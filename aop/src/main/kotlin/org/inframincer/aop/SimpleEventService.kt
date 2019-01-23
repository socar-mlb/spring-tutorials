package org.inframincer.aop

import org.springframework.stereotype.Service

@Service
class SimpleEventService : EventService {

    @PerformanceLogging
    override fun createEvent() {
//        val begin = System.currentTimeMillis()
        Thread.sleep(1000)
        println("Created an event")
//        println(System.currentTimeMillis() - begin)
    }

    @PerformanceLogging
    override fun publishEvent() {
//        val begin = System.currentTimeMillis()
        Thread.sleep(2000)
        println("Published an event")
//        println(System.currentTimeMillis() - begin)
    }

    override fun deleteEvent() {
        println("Deleted an event")
    }
}
