package org.inframincer.ioc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Single {

    @Autowired
    lateinit var proto: Proto
}
