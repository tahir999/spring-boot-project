package com.tahir.project.tahirproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tahir.project.tahirproject.dao.Retrieval;
import com.tahir.project.tahirproject.model.CustomerDetails;

@Service
public class RetrieveService {

	private Retrieval retrieval;
	
	private CustomerDetails customerDetails;
	
	public RetrieveService(Retrieval retrieval, CustomerDetails customerDetails) {
		this.retrieval = retrieval;
		this.customerDetails = customerDetails;
	}
	
	public List<CustomerDetails> getAllDetailsAvailable(){
		
		List<CustomerDetails> getAll = retrieval.getAllDetails();
		return getAll;
	}
	
	public CustomerDetails getDetailsById(int customerId) {
		
		customerDetails = retrieval.getDetailsById(customerId);
		return customerDetails;
	}
	
	public CustomerDetails saveDetailsThisTime(CustomerDetails customerDetails) {
		
		customerDetails = retrieval.saveDetails(customerDetails);
		return customerDetails;
	}
}
