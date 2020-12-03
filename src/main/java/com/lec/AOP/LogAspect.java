package com.lec.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.mycompany.springs.Loger;


// 이 클래스가 Aspect 역할을 할 클래임을 명시 
@Aspect
public class LogAspect {
	
	@Before("within(com.lec.AOP.*)")
	public void beforAdvice() {
		System.out.println("[before]");
		new Loger().loginIn();
	}
	
	@After("within(com.lec.AOP.*)")
	public void AfterAdvice() {
		System.out.println("[after]");
		new Loger().loginOut();
	}
	
	// Around advice : 메소드의 실행을 제어하는 가장 강력한 코드
		//                직접 새상 메소드를 호출하고 결과나 예외 처리 가능!
		@Around("within(com.lec.AOP.*)")
		public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
			// 메소드 이름.
			String signatureStr = joinPoint.getSignature().toShortString();
			
			// 메소드 수행전
			System.out.println("[Around] " +  signatureStr + " 시작");
			long st = System.currentTimeMillis(); // 시간체크
			
			try {
				// 메소드 수행
				Object obj = joinPoint.proceed();  // throws Throwable 
				return obj;
			} finally {
				// 메소드 수행후
				long et = System.currentTimeMillis();
				System.out.println("[Around] " + signatureStr + " 종료, 경과시간 : "+ (et - st));	
			}// Around advice : 메소드의 실행을 제어하는 가장 강력한 코드
		//                직접 새상 메소드를 호출하고 결과나 예외 처리 가능!
	
		} 


	
	
}
