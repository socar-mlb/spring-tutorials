package org.inframincer.ioc

import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.stereotype.Component

@Component
@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
class Proto {
}
