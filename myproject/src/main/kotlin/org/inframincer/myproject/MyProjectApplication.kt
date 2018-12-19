package org.inframincer.myproject

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

//@SpringBootApplication
//@SpringBootConfiguration
@Configuration
@ComponentScan
//@EnableAutoConfiguration
class MyProjectApplication
fun main(args: Array<String>) {
//	runApplication<MyProjectApplication>(*args)
	val application = SpringApplication(MyProjectApplication::class.java)
	application.webApplicationType = WebApplicationType.NONE
	application.run(*args)
}
