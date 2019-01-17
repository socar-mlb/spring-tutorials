package org.inframincer.psa

import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController {

    @InitBinder
    fun binder(webDataBinder: WebDataBinder) {
        webDataBinder.registerCustomEditor(Event::class.java, EventEditor())
    }

    @GetMapping("/event/{event}")
    fun getEvent(@PathVariable event: Event): String {
        println("event.id: ${event.id}, event.email: ${event.email}")
        return event.id.toString()
    }
}