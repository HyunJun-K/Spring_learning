package com.mycompany.apply;

import java.awt.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.mycompany.beans_exam.Score_nolombok;

public class exam1 {
	public static void main(String[] args) {
		
		// Score를 통해서 외부에서 들어온 데이터를 가지고 총점 평균 구해보기 
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:scoreCtx.xml");
		
		Score_nolombok score = ctx.getBean("arg_score", Score_nolombok.class);
		
		int eng = score.getEng();
		int math = score.getMath();
		int kor = score.getKor();
		int sum = eng+ math +kor;
		
		System.out.println(" 총점 : " + sum);
		System.out.println(" 평균 : " + sum/3);
		
	}
}
