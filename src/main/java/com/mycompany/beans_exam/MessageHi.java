package com.mycompany.beans_exam;

public class MessageHi implements MessageBean{
	
	String strs = "메세지 하이 입니다.";
	
	public void sayHi() {
		System.out.println(strs);
	}

	public MessageHi() {
		System.out.println(" 기본 생성자 실행 ");
	}

	
	
}
