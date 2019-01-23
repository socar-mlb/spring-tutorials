package org.inframincer.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Component
@Aspect
class PerformanceAspect {

    @Around("execution(* org.inframincer..*.EventService.*(..))")
    @Throws(Throwable::class)
    fun logPerformance(proceedingJoinPoint: ProceedingJoinPoint): Any? {
        val begin = System.currentTimeMillis()
        val returnValue = proceedingJoinPoint.proceed()
        println(returnValue)
        println(System.currentTimeMillis() - begin)
        return returnValue
    }
}
