package org.inframincer.psa

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import org.springframework.validation.BeanPropertyBindingResult

@Component
class ValidatorRunner : ApplicationRunner{

    override fun run(args: ApplicationArguments?) {
        val event = Event()
        val eventValidator = EventValidator()
        val errors = BeanPropertyBindingResult(event, "event")

        eventValidator.validate(event, errors)
        println(errors.hasErrors())

        errors.allErrors.forEach {
            it.codes!!.forEach {
                println(it)
            }
            println(it.defaultMessage)
        }
    }
}
