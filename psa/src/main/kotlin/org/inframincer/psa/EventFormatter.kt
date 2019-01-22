package org.inframincer.psa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.MessageSource
import org.springframework.format.Formatter
import org.springframework.stereotype.Component
import java.util.Locale

//@Component
class EventFormatter : Formatter<Event> {

    @Autowired
    lateinit var messageSource: MessageSource

    override fun print(`object`: Event, locale: Locale): String {
//        messageSource.getMessage("name", locale)
        return `object`.id.toString()
    }

    override fun parse(text: String, locale: Locale): Event {
        return Event(text.toInt())
    }
}
