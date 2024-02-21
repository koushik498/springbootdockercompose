package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	
	@PostMapping( "/save")
	public ResponseEntity<String> save(@RequestBody Customer cust)
	{
		String saveCustomer = service.saveCustomer(cust);
		return new ResponseEntity<>(saveCustomer,HttpStatus.CREATED);
	}
	
	@PostMapping( "/all")
	public ResponseEntity<List<Customer>> Allshow()
	{
		List<Customer> saveCustomer = service.showAll();
		return new ResponseEntity<>(saveCustomer,HttpStatus.OK);
	}
}
