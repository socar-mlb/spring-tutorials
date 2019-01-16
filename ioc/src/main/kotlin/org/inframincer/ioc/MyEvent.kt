package org.inframincer.ioc

import org.springframework.context.ApplicationEvent

class MyEvent(source: Any) : ApplicationEvent(source) {

    var data: Int = 0

    constructor(source: Any, data: Int) : this(source) {
        this.data = data
    }
}
