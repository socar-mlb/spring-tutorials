package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
class EnvironmentRunner: ApplicationRunner {

    @Autowired
    lateinit var context: ApplicationContext

    @Autowired
    lateinit var testBook1Repository: TestBook1Repository

    @Autowired
    lateinit var testBook2Repository: TestBook2Repository

    override fun run(args: ApplicationArguments?) {
        val environment = context.environment

        for (profile in environment.activeProfiles)
            println(profile)
        for (profile in environment.defaultProfiles)
            println(profile)
    }
}
