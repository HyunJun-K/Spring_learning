package com.mycompany.result;

import org.springframework.context.support.GenericXmlApplicationContext;

public class autowired_serviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:autowiredCtx1.xml");
		System.out.println();
		System.out.println(ctx.getBean("regService")); //빈객체 꺼내기
		
		/* 결과 
		 * 
		 *  DAO(dao1)  //DAO 에 매개변수 받는 빈을 호출하고 그뒤에는 ref한 빈의 데이터 ( service 의 데이터들) 
			service(autowired_DAO [uid=dao1]) 생성
			autowired_service [at_dao=autowired_DAO [uid=dao1]]
					
		*/
		ctx.close();
	}

}
