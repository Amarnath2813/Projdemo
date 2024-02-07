package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entities.Customer;
import com.example.repositeries.CustomerRepository;

@Component
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository r;
	

	@Override
	public List<Customer> getCustomers() {
		
		return r.findAll();
	}

	
}
