package com.SpringMvc.Demo.DAO;

import java.util.List;

import com.SpringMvc.Demo.Entity.Customer;



public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void SaveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);
}
