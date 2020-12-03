package com.lec.spring.environment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	/* 외부파일 이용한 설정 
	다양한 빈 설정 방법들 
	Environment 객체 + Property 파일 이용한 스프링 빈 설정 
	Property 파일 이용한 설정 : XML, java에 명시 
	Profile 속성을 이용한 설정 : XML, JAVA 명시

	*/
	
	
	// Environment 객체란? java가 아닌 외부에서 코드를 가지고 오는것 java 파일은 건드리지 않음 
	
	private Environment env;
	private String adminId;
	private String adminPw;
	
	//게터세터로 데이터를 받아옴 ( 외부 빈을 통해서 )
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() lifeCycle check");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	
	}
	

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public void setEnvironment(Environment environment) {
		System.out.println("SetEnvironment() lifeCycle check");
		setEnv(environment);
		
	}
	
	
	
}
