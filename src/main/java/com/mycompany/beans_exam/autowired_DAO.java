package com.mycompany.beans_exam;

public class autowired_DAO {
	
	String uid;
	
	public autowired_DAO() {
		System.out.println("생성자");
	}

	public autowired_DAO(String uid) {
		super();
		System.out.printf("DAO(%s) \n", uid );
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "autowired_DAO [uid=" + uid + "]";
	}
	
	
	
	

	
}
