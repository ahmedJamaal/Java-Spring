package com.SpringMvc.Demo.Aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	//1.setup a logger
	private Logger myLogger =Logger.getLogger(getClass().getName());
	//2.setup pointcut decluration
	@Pointcut("execution(* com.SpringMvc.Demo.Controller.*.*(..))")
	private void forController(){
	}
	
	@Pointcut("execution(* com.SpringMvc.Demo.Services.*.*(..))")
	private void forService(){
	}
	
	@Pointcut("execution(* com.SpringMvc.Demo.DAO.*.*(..))")
	private void forDao(){
	}
	
	@Pointcut("forController() || forService() || forDao()")
	private void ForAppFlow(){
	}
	
	//3.add @Before
	@Before("ForAppFlow()")
	private void before( JoinPoint theJoinPoint){
		String theMethode = theJoinPoint.getSignature().toString();
		
		myLogger.info("=======>> @before Calling Methode Name : "+theMethode);
	}
	
	
	//4.Add @AfterReturning 
	@AfterReturning(pointcut="ForAppFlow()" ,returning ="theResult")
	private void afterRe( JoinPoint theJoinPoint, Object theResult){
		String theMethode = theJoinPoint.getSignature().toString();
		
		myLogger.info("<<======= @AfterReturning Calling for Methode : "+theMethode);
		
		myLogger.info("<<=======>> Result Passing in Param : "+theResult);
	}
	
}
