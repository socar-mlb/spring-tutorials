package org.inframincer.ioc

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("test")
class TestConfiguration {

    @Bean
    fun bookRepository(): BookRepository {
        return TestBook1Repository()
    }
}
