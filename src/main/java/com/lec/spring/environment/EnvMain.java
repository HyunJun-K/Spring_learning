package com.lec.spring.environment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class EnvMain {

	public static void main(String[] args) {

		
		// Context -> Environment -> PropertySources
		//PropertySources ( key:value )
		
		
		//외부파일을 읽어올때는 요 형식을 기억해두자 
		ConfigurableApplicationContext ctx =
				new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertSources = env.getPropertySources();
		
		
		try {
			propertSources.addLast( new ResourcePropertySource("classpath:data.auth"));	// 외부 파일을 읽어옴 
			
			
			System.out.println("data1 :" + env.getProperty("data1"));	
			System.out.println("data2 :" + env.getProperty("data2"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
