package org.inframincer.nullsafety

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NullSafetyApplication

fun main(args: Array<String>) {
    runApplication<NullSafetyApplication>(*args)
}

