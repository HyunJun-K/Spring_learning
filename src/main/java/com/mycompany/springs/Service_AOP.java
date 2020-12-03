package com.mycompany.springs;

public abstract class Service_AOP {
	//추상클래스 
	
	
	//테스트 메소드
	
	public void printInfo () {
		String className = this.getClass().getSimpleName();
		StackTraceElement[] stackTrace = new Throwable().getStackTrace();
		String methodName = stackTrace[1].getMethodName();
		System.out.println(className + " 의  " + methodName + "() 호ㅜㄹ");
	}
	
	
	public abstract void doAction();
}
