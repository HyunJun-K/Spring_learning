package com.lec.AOP;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {

		
		System.out.println("start ");
		// 컨테이너 객체 생성
		AbstractApplicationContext ctx = new 
				GenericXmlApplicationContext("classpath:AopCtx.xml");
		
		System.out.println();
		MyAOP_service svc1 = ctx.getBean("service1", MyAOP_service.class );
		MyAOP_service2 svc2 = ctx.getBean("service2", MyAOP_service2.class );
		
		
		//로그인과 로그아웃은 반복되는 기능들
		svc1.doAction();
		System.out.println("svc1 do action 종료 ");
		
		
		svc2.doAction();
		System.out.println("svc2 do action 종료 ");
		
		ctx.close(); //자원반납
		
		
		System.out.println("end");
	}

}
