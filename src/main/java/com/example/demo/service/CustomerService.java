package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.demo.entity.Customer;
import com.example.demo.repos.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public String saveCustomer(Customer cust)
	{
		Optional<Customer> present = repo.findById(cust.getId());
		
		Customer customer = new Customer();
		
		if(ObjectUtils.isEmpty(present.get()))
			customer = repo.save(cust);
		else
			customer = null;
		
		if(!ObjectUtils.isEmpty(customer))
			return "customer registered";
		else
			return "customer exist";
	}
	
	public List<Customer> showAll()
	{
		return repo.findAll();
	}

}
