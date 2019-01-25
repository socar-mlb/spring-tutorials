package org.inframincer.nullsafety

import org.springframework.lang.NonNull
import org.springframework.stereotype.Service

@Service
class EventService {

    @NonNull
    fun createEvent(@NonNull name: String): String {
        return "hello $name"
    }
}
