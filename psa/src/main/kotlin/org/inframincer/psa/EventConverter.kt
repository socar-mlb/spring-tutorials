package org.inframincer.psa

import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

class EventConverter {

//    @Component
    class StringToEventConverter : Converter<String, Event> {
        override fun convert(source: String): Event? {
            return Event(source.toInt())
        }
    }

//    @Component
    class EventToStringConverter : Converter<Event, String> {
        override fun convert(source: Event): String? {
            return source.id.toString()
        }
    }
}
