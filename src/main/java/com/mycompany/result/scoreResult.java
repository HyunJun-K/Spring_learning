package com.mycompany.result;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.mycompany.beans_exam.Score_nolombok;

public class scoreResult {

	public static void main(String[] args) {
		// application 컨테이너 생성  
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:scoreCtx.xml"); //이부분은 빈을가지고있는 xml 위치 
		
		Score_nolombok score = null;
		
		//Bean 객체를 꺼내올때에는 ( "bean id", "bean 경로 클래스"
		// score = ctx.getBean("score", Score_nolombok.class); 매개변수가 없는 형식 
		// score = ctx.getBean("arg_score", Score_nolombok.class); 매개변수가 있는 형식 
		score = ctx.getBean("index_score", Score_nolombok.class); //인덱스 사용방식
		System.out.println(score);
		
	
			
	}
}
