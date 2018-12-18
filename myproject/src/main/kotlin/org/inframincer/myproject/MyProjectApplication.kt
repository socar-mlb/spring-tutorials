package org.inframincer.myproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyProjectApplication

fun main(args: Array<String>) {
	runApplication<MyProjectApplication>(*args)
}

