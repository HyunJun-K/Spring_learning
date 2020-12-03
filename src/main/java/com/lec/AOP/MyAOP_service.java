package com.lec.AOP;

import com.mycompany.springs.Service_AOP;

public class MyAOP_service extends Service_AOP {

	@Override
	public void doAction() {
//		new Loger().loginIn();
//		
//		System.out.println("Service 1 의 doAction () ");
//		
//		new Loger().loginOut(); 
		
		//공통기능을 없애다 
		
		printInfo();
	}

}
