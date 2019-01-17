package org.inframincer.psa

import org.springframework.validation.Errors
import org.springframework.validation.ValidationUtils
import org.springframework.validation.Validator

class EventValidator : Validator {

    override fun supports(clazz: Class<*>): Boolean {
        return Event::class.java == clazz
    }

    override fun validate(target: Any, errors: Errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "not empty", "Empty title is not allowed")

        val event = target as Event
        if (event.title == "") {
            errors.reject("not empty title")
        }
    }
}
