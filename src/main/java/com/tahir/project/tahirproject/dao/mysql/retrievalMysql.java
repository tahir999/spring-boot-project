package com.tahir.project.tahirproject.dao.mysql;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tahir.project.tahirproject.dao.Retrieval;
import com.tahir.project.tahirproject.model.CustomerDetails;

@Repository
public class retrievalMysql implements Retrieval {
	
	private NamedParameterJdbcTemplate jdbcTemplate;

	public retrievalMysql(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<CustomerDetails> getAllDetails() {
		
		//query for a list
		return jdbcTemplate.query("SELECT * FROM fresh.customer", (rs, rowNum) -> {
			
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setCustomerId(rs.getInt("CustomerId"));
			customerDetails.setName(rs.getString("Name"));
			customerDetails.setAge(rs.getInt("Age"));

			return customerDetails;
		});
	}

	@Override
	public CustomerDetails getDetailsById(int customerId) {
		
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("CustomerIdIn", customerId);		
		
		//queryForObject returns a single
		return jdbcTemplate.queryForObject("CALL fresh.new_procedure(:CustomerIdIn)", 
				parameters, (rs, rowNum) -> {
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setCustomerId(rs.getInt("CustomerId"));
			customerDetails.setName(rs.getString("Name"));
			customerDetails.setAge(rs.getInt("Age"));
			
			return customerDetails;
		});
	}

	@Override
	public CustomerDetails saveDetails(CustomerDetails customerDetails) {
		
		return jdbcTemplate.update("INSERT into ", null);
	}

}
