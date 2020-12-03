package com.lec.AOP;

import com.mycompany.springs.Service_AOP;

public class MyAOP_service2 extends Service_AOP {

	@Override
	public void doAction() {
//		new Loger().loginIn();
//		
//		System.out.println("Service 2 의 doAction () ");
//		
//		new Loger().loginOut(); 
		
		printInfo();
	}

}
