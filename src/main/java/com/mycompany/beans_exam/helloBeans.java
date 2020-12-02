package com.mycompany.beans_exam;

public class helloBeans implements MessageBean {

	String str = "hi my name is Spring";
	
	public void sayHi() {
		System.out.println(str);
	}

	public helloBeans() {
		System.out.println("기본 생성자 실행합니다");
	}

	
	
	
}
