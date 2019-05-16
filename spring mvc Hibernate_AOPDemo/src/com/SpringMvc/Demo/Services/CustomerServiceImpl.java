package com.SpringMvc.Demo.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMvc.Demo.DAO.CustomerDAO;
import com.SpringMvc.Demo.Entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	//inject customer dAO
	@Autowired
	private CustomerDAO customerDao;
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getCustomers();
	}
	@Override
	@Transactional
	public void SaveCustomer(Customer theCustomer) {
		//
		customerDao.SaveCustomer(theCustomer);
		
	}
	@Override
	@Transactional
	public Customer getOneCustomer(int theId) {
		
		
		return customerDao.getCustomers(theId);
	}
	@Override
	@Transactional
	public void DeleteCustomer(int theId) {

		 customerDao.deleteCustomer(theId);
		
	}

}
