package com.mycompany.result;

import com.mycompany.beans_exam.autowired_DAO;
import com.mycompany.beans_exam.autowried_service;

public class autowired_service implements autowried_service{

	autowired_DAO at_dao;

	public autowired_service(autowired_DAO at_dao) {
		super();
		this.at_dao = at_dao;
		
		System.out.printf("service(%s) 생성", at_dao.toString());
	}

	@Override
	public String toString() {
		return "autowired_service [at_dao=" + at_dao.toString() + "]";
	}
	
	
	
	
	
}
