package com.WebApp.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebApp.DAO.CustomerDAO;
import com.WebApp.Entity.Customer;






@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	//inject dao in customerDOA
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/List")
	public String listCustomer(Model theModel)
	{
		//get customer from dao
		List<Customer> thecustomers=customerDAO.getCustomers();
		
		//add customer to model
		theModel.addAttribute("customers",thecustomers);
		
		return "list-customers";
	}
}
