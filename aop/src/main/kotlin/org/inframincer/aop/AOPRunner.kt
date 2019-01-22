package org.inframincer.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class AOPRunner : ApplicationRunner {

    @Autowired
    lateinit var eventService: EventService

    override fun run(args: ApplicationArguments?) {
        eventService.createEvent()
        eventService.publishEvent()
        eventService.deleteEvent()
    }
}
