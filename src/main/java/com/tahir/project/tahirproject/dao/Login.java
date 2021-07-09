package com.tahir.project.tahirproject.dao;

import org.springframework.stereotype.Repository;

import com.tahir.project.tahirproject.model.LoginDetails;

public interface Login {

	LoginDetails findByUser(String user);
}
