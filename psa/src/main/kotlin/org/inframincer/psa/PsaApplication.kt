package org.inframincer.psa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PsaApplication

fun main(args: Array<String>) {
    runApplication<PsaApplication>(*args)
}
