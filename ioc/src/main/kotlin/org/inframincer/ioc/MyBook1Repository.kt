package org.inframincer.ioc

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository

@Repository
@Primary
class MyBook1Repository: BookRepository {
}