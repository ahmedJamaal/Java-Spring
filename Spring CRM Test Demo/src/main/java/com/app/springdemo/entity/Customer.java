package com.app.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Customer")
public class Customer {


	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, int age, String address, String phone) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Address = address;
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age
				+ ", Address=" + Address + ", Phone=" + Phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
}
	