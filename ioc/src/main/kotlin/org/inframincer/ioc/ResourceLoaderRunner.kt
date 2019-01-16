package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Component

@Component
class ResourceLoaderRunner : ApplicationRunner {

    @Autowired
    lateinit var resourceLoader: ResourceLoader

    override fun run(args: ApplicationArguments?) {
        val resource = resourceLoader.getResource("classpath:/test.txt")
        println(resource.exists())
        println(resource.filename)
        println(resource.description)
    }
}
