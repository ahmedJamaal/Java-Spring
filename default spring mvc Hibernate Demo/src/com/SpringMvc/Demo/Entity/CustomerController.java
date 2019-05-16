package com.SpringMvc.Demo.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/Customer")
public class CustomerController {
	

	@RequestMapping("/List")
	public String listCustomer(Model theModel)
	{
	
		
		return "list-customers";
	}
}
