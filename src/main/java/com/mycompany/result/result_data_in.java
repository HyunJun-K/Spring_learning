package com.mycompany.result;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.mycompany.beans_exam.MessageBean;

public class result_data_in {

	public static void main(String[] args) {

		// Ctx.xml을 이용하여 Bean 을통해 데이터를 주입받아서 사용함
		//외부에서 진입한 빈 객체를 가지고 사용을 하는것 
		String configLocation = "classpath:appCtx.xml"; //우리가 설정한 Spring configlocation 파일
		
		
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MessageBean msg = ctx.getBean("myBean", MessageBean.class);
		msg.sayHi();
		
	}

}
