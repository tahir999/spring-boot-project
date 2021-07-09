package com.tahir.project.tahirproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tahir.project.tahirproject.configuration.CustomUserDetails;
import com.tahir.project.tahirproject.dao.Login;
import com.tahir.project.tahirproject.model.LoginDetails;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private Login login;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		LoginDetails loginDetails = login.findByUser(username);
		
		return new CustomUserDetails(loginDetails);
	}

}
