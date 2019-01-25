package org.inframincer.nullsafety

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class EventRunner : ApplicationRunner {

    @Autowired
    lateinit var eventService: EventService

    override fun run(args: ApplicationArguments?) {
//        eventService.createEvent(null) // Error: Null can not be a value of a non-null type String
    }
}
