package com.SpringMvc.Demo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.SpringMvc.Demo.Entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer", Customer.class);
		/* Create Query sorted by lastname
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by LastName", Customer.class);
		*/
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	@Override
	public void SaveCustomer(Customer theCustomer) {

		//get current session hibernate

			Session currentSession = sessionFactory.getCurrentSession();
			
			///save the Customer ...finally
			currentSession.save(theCustomer);
		
		
	}

	@Override
	public Customer getCustomers(int theId) {
		//get current session hibernate

		Session currentSession = sessionFactory.getCurrentSession();
		
		///retirve the object= Customer by id ...finally
		Customer theCustomer=currentSession.get(Customer.class, theId);
	

		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {

		//get current session hibernate

		Session currentSession = sessionFactory.getCurrentSession();
		
		 Query thequery=currentSession.createQuery("delete from Customer where id =:CustomerId");
		 
		 
		 thequery.setParameter("CustomerId", theId);
		 thequery.executeUpdate();
		 
	}
	

}
