package com.kindoz.todo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* com.kindoz.todo.page.home.model.Goal.* (..))")
    private void allMethodsFromGoal(){}

    @Pointcut("execution(* com.kindoz.todo.page.home.model.Goal.addStep (..))")
    private void addMethodsFromGoal(){}

    @Pointcut("allMethodsFromGoal() && !addMethodsFromGoal()")
    private void allMethodsFromGoalExeptAdd(){}

//    @Pointcut ("execution(* * (..))")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut ("execution(* * (..))")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnMethodsFromUniLibrary() {
//        System.out.println("beforeGetAndReturnMethodsFromUniLibrary(): writing Log#3");
//    }



//    @Pointcut ("execution(* * (..))")
//    private void allGetMethods () {}
//
//    @Before ("allGetMethods()")
//    public void beforeGetBookAdvice () {
//        System.out.println("beforeGetBookAdvice: выполнение метода");
//   }

}
