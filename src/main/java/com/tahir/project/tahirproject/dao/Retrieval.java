package com.tahir.project.tahirproject.dao;

import java.util.List;

import com.tahir.project.tahirproject.model.CustomerDetails;

public interface Retrieval {

	//get details for a given customer id
	List<CustomerDetails> getAllDetails();
	
	//get details by id
	CustomerDetails getDetailsById(int customerId);
	
	//save detail
	CustomerDetails saveDetails(CustomerDetails customerDetails);
	
	
}
