package com.SpringMvc.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMvc.Demo.Entity.Customer;
import com.SpringMvc.Demo.Services.CustomerService;





@Controller
@RequestMapping("/Customer")
public class CustomerController {
	

	// //inject customer service
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/List")
	public String listCustomers(Model theModel) {
		
		// get customers from the customer serves
		List<Customer> theCustomers = customerService.getCustomer();
		
		for (Customer customer : theCustomers) {
			
			System.out.println(customer);
		}
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

	@GetMapping("/Add")
	public String AddCustomer(Model theModel) {
		
		///create model attribute to bind form data
		Customer theCustomer=new Customer();
		
		theModel.addAttribute("customer",theCustomer);
		
		return "Add";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		customerService.SaveCustomer(theCustomer);
		return "redirect:/Customer/List";
	}
	
	/// Update Customer Form
	@GetMapping("/formForUpdate")
	public String formForUpdate(@RequestParam ("customerId") int theId ,Model theModel) {
		
		//get customer from services
		Customer theCustomer =customerService.getOneCustomer(theId);
		//set customer as model attibute to form
		theModel.addAttribute("customer", theCustomer);
		//send over to our form
		
		return "Add";
	}
	
	@GetMapping("/Delete")
	public String deleteCustomer(@RequestParam ("customerId") int theId ,Model theModel) {
		
		//delete customer from services
		customerService.DeleteCustomer(theId);
		
		
		return "redirect:/Customer/List";
	}
	
}

