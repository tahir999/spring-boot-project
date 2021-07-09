package com.tahir.project.tahirproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tahir.project.tahirproject.dao.Retrieval;
import com.tahir.project.tahirproject.model.CustomerDetails;

@RestController
public class RestControllerC {
	
	@Autowired
	private Retrieval retrieve;
	
	@Autowired
	private CustomerDetails customerDetails;
	
	@GetMapping("/home")
	public String Home() {
		return "This is the homepage";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<CustomerDetails>> getItAll(){
		List<CustomerDetails> getIt = retrieve.getAllDetails();
		return new ResponseEntity<>(getIt, HttpStatus.OK);
	}
	
	@GetMapping("/all/{customerid}")
	public ResponseEntity<CustomerDetails> getAllById(@PathVariable("customerid") int customerId)
	{
		customerDetails = retrieve.getDetailsById(customerId);
		return new ResponseEntity<>(customerDetails, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<CustomerDetails> addCustomer(@RequestBody CustomerDetails customerDetails)
	{
		customerDetails = retrieve.saveDetails(customerDetails);
		return new ResponseEntity<>(customerDetails, HttpStatus.CREATED);
	}
	
}
