package com.WebApp.Entity.copy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="person")
public class Customer {


	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="fname")
	private String FirstName;
	
	@Column(name="lname")
	private String LastName;
	
	@Column(name="age")
	private int Age;
	
	@Column(name="address")
	private String Address;
	
	@Column(name="phone")
	private String Phone;

	public Customer(int id, String firstName, String lastName, int age, String address, String phone) {
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Address = address;
		Phone = phone;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age
				+ ", Address=" + Address + ", Phone=" + Phone + "]";
	}
	
	
	
}
