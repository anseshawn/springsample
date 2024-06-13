package com.spring.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy // 프록시: 횡단관심사를 주관심사와 연결해주는 역할
@Component
@Aspect // aop의 aspect로 이용하기
public class AspectTest {
	
	/*
	// Advice
	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))") // PointCut 설정(Advice의 사용범위 설정 : ("execution(타입 패키지명.클래스명.메소드명(매개변수))"))
	// *:모든타입, 메소드 괄호안이 비어있어도 매개변수를 써줘야 함 (..) << 무언가가 올 수 있다
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 aroundAdvice메소드(전)입니다. : "+joinPoint);
		// joinPoint가 getAopServiceTest1객체를 실행한다
		joinPoint.proceed();
		System.out.println("\n이곳은 aroundAdvice메소드(후)입니다. : "+joinPoint);
	}
	
	@Before("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")
	public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 beforeAdvice메소드입니다.\n");
	}
	
	@AfterReturning("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")
	public void afterReturningAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 afterReturningAdvice메소드입니다.\n");
	}
	*/
	
	/*
	@Pointcut("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")
	private void cut() {}
	
	@Before("cut()")
	public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 beforeAdvice메소드입니다. : "+joinPoint);
	}
	
	@AfterReturning("cut()")
	public void afterReturningAdvice(JoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 afterReturningAdvice메소드입니다.");
	}
	*/
	
	/*
	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest*(..))")
	public void aroundAdvice() {
		System.out.println("\n이곳은 aroundAdvice메소드입니다.");
	}
	*/
	@Pointcut("execution(* com.spring.sample.service.AopService.getAopServiceTest2(..))")
	private void cut() {}
	
	// 리턴값 받아주기
	@AfterReturning(value="cut()", returning="obj")
	public void afterReturningAdvice(Object obj) {
		System.out.println("\n이곳은 afterReturningAdvice메소드입니다. obj : "+obj);
	}
	
	/*
	//@Around("execution(* com.spring.sample.service.AopService.*.*(..))")
	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 aroundAdvice메소드입니다.");
		long startTime = System.nanoTime();
		try {		
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long endTime = System.nanoTime();
			long executionTime = endTime - startTime;
			System.out.println("수행시간 : "+executionTime+" ns");
		}
	}
	*/
	
	
}
