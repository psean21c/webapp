package spring.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Aspect
public class Logging {
	/**
	 * Following is the definition for a pointcut to select all the methods
	 * available. So advice will be called for all the methods.
	 */
	@Pointcut("execution(* spring.aspectj.*.*(..))")
	private void selectAll() {
	}

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("@Before - Going to setup student profile.");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("@After - Student profile has been setup.");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	@AfterReturning(pointcut = "selectAll()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("@AfterReturning - Returning:" + retVal.toString());
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised by any method.
	 */
	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("@AfterThrowing - There has been an exception: " + ex.toString());
	}
	
	@After("selectAll()")
	public void namedPointCutExample(JoinPoint jp) {
	System.out.println(" ***** namePointCut ***** " + jp.getSignature() + " is called");
	}

	
	// Need to fix the problem for @Around
//	@Around("selectAll()")
//	public void AroundAdvise(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("@Around: ");
//		Object retVal = pjp.proceed();
//		System.out.println("@Around retVal=" + retVal);
//	}
}