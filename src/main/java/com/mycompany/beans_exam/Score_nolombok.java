package com.mycompany.beans_exam;


public class Score_nolombok {
	
	// 롬복을 사용하기전 
	
	int kor;
	int eng;
	int math;
	String comment;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Score_nolombok(int kor, int eng, int math, String comment) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.comment = comment;
	}	
	
	
	public Score_nolombok() {
		System.out.println("스코어 기본 생성자 입니다.");
	}
	
	@Override
	public String toString() {
		return "Score_nolombok [kor=" + kor + ", eng=" + eng + ", math=" + math + ", comment=" + comment + "]";
	}
	
	
	
	
}
