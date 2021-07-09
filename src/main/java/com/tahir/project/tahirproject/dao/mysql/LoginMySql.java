package com.tahir.project.tahirproject.dao.mysql;

import org.springframework.stereotype.Repository;

import com.tahir.project.tahirproject.dao.Login;
import com.tahir.project.tahirproject.model.LoginDetails;

@Repository
public class LoginMySql implements Login{

	@Override
	public LoginDetails findByUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

}
