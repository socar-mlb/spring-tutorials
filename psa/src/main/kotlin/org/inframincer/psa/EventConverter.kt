package org.inframincer.psa

import org.springframework.core.convert.converter.Converter

class EventConverter {

    class StringToEventConverter : Converter<String, Event> {
        override fun convert(source: String): Event? {
            return Event(source.toInt())
        }
    }

    class EventToStringConverter : Converter<Event, String> {
        override fun convert(source: Event): String? {
            return source.id.toString()
        }
    }
}
