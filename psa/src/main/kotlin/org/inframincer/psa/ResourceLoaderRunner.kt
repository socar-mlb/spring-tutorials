package org.inframincer.psa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationContext
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Component
import java.io.File

//@Component
class ResourceLoaderRunner : ApplicationRunner {

    @Autowired
    lateinit var resourceLoader: ResourceLoader

    @Autowired
    lateinit var applicationContext: ApplicationContext

    override fun run(args: ApplicationArguments?) {
        val resource = resourceLoader.getResource("classpath:test.txt")
        println(resource.exists())
        println(resource.file) // File Path
        println(resource.filename)
        println(resource.description)
        println(resource.isReadable)

        println(resource.uri)

        // forEachLine
        File(resource.uri).forEachLine {
            println(it)
        }

        // useLines
        val useLines = File(resource.uri).useLines {
            it.toList()
        }
        useLines.forEach {
            println(it)
        }

        // bufferedReader
        val readLines = File(resource.uri).readLines()
        readLines.forEach {
            println(it)
        }

        // class org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext
        println(applicationContext.javaClass)

        val resource1 = resourceLoader.getResource("test.txt")
        val resource2 = resourceLoader.getResource("classpath:test.txt")
        val resource3 = resourceLoader.getResource("file:///test.txt")
        println(resource1.javaClass) // class org.springframework.web.context.support.ServletContextResource
        println(resource2.javaClass) // class org.springframework.core.io.ClassPathResource
        println(resource3.javaClass) // class org.springframework.core.io.FileUrlResource
    }
}
