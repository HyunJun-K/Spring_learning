package com.mycompany.springs;

public class Loger {
	
	public void loginIn() {
		System.out.println("로그인");
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end login
	
	
	public void loginOut() {
		System.out.println("로그아웃");
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// endloginOut
	
	
	
	

}
