package com.mycompany.result;

import com.mycompany.beans_exam.MessageHi;
import com.mycompany.beans_exam.helloBeans;

public class result_data {

	//이 메인은 messageBean 인터페이스의 의존하는 메인이다. 
	//그렇기 대문에 messageBean 이 만약 없다면? 실행이 되지 않는다. 
	// 그래서 의존 관계이다.
	// 그럼여기서 의존 하는 객체가 변경이 된다면 어떻게 될까 ? 
	// 의존하는 객체가 변경이 되면 다시 컴파이를 해야한다 다시 손을 ㄷ야한다.
	// 계속 의존객체를 바꿔주는것도 귀찮고...
	// 그럼 ? 외부에서 진입하는것은 어떨까? 
	// Spring은 Dependency Injection를 지원한다. 
	
	
	
	//기존 인터페이스를 사용한 방식
	public static void main(String[] args) {

		//helloBeans msg = new helloBeans(); 
		MessageHi msg = new MessageHi();
		
		msg.sayHi();
	}

}
