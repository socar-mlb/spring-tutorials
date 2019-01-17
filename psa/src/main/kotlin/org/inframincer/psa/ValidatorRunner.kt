package org.inframincer.psa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.validation.BeanPropertyBindingResult
import org.springframework.validation.Validator
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean

@Component
class ValidatorRunner : ApplicationRunner{

    @Autowired
    lateinit var validator: Validator

    @Bean
    fun validator(): Validator {
        return LocalValidatorFactoryBean()
    }

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

        println(validator.javaClass)

        event.limit = -1
        event.email = "aaa"

        validator.validate(event, errors)
        println(errors.hasErrors())

        errors.allErrors.forEach {
            it.codes!!.forEach {
                println(it)
            }
            println(it.defaultMessage)
        }
    }
}
