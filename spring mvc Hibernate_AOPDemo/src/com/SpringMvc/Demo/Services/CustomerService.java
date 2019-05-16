package com.SpringMvc.Demo.Services;

import java.util.List;

import com.SpringMvc.Demo.Entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();

	public void SaveCustomer(Customer theCustomer);

	public Customer getOneCustomer(int theId);

	public void DeleteCustomer(int theId);
}
