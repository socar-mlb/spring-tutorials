package org.inframincer.ioc

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Repository

@Repository
@Profile("!production")
class TestBook2Repository: BookRepository {
}