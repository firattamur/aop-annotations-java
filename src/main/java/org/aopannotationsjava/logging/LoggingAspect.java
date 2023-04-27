package org.aopannotationsjava.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("@annotation(logMethod)")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint, LogMethod logMethod) throws Throwable {

        String message = logMethod.message();

        long start = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;

        CustomLogger.log(message + " : " + proceedingJoinPoint.getSignature() + " executed in " + executionTime + "ms");

        return proceed;

    }

}
