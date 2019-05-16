package com.WebApp.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.WebApp.Entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO{

	
	//injected hibernate session factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//get curresnt session Factory
		Session CurrentSession=sessionFactory.getCurrentSession();
		
		//Create a query
		Query<Customer> theQuery=CurrentSession.createQuery("from student", Customer.class);
		
		//get list of cutsomer of query
		List<Customer> customerList=theQuery.getResultList();
		
		//return list Customer
		return customerList;
	}
	

}
