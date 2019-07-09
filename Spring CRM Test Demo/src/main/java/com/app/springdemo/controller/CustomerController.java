package com.app.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springdemo.entity.Customer;
import com.app.springdemo.handler.CustomerNotFoundException;
import com.app.springdemo.service.CustomerService;


@RestController
@RequestMapping("/Api")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/Customers")
	public List <Customer> getCustomers()
	{
		return customerservice.getCustomers();
	}
	
	@GetMapping("/Customers/{customerID}")
	public Customer getCustomer(@PathVariable int customerID)
	{
		Customer theCustomer=customerservice.getCustomer(customerID);
		if(theCustomer ==null )
		{
			throw new CustomerNotFoundException("didnt found the user id in database");
		}
		
		return theCustomer;
	}
	//@RequestBody ... convert pojo to method parramter
	@PostMapping("/Customers")
	public Customer addCustomer(@RequestBody Customer theCustomer){
		theCustomer.setId(0);
		
		customerservice.saveCustomer(theCustomer);
		

		return theCustomer;
	}
	
	@PutMapping("/Customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer){
		theCustomer.setId(0);
		
		customerservice.saveCustomer(theCustomer);
		

		return theCustomer;
	}
	@DeleteMapping("/Customers/{customerID}")
	public String deleteCustomer(@PathVariable int customerID){
	
		Customer theCustomer=customerservice.getCustomer(customerID);
		if(theCustomer ==null )
		{
			throw new CustomerNotFoundException("Customer id -"+customerID+" Not Found");
		}
		customerservice.deleteCustomer(customerID);
		
		return "Delete the Customer id = "+customerID;
	}
	
}
