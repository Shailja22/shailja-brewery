package com.example.shailjabrewery.web.services;

import java.util.UUID;

import com.example.shailjabrewery.web.model.Customer;

public interface CustomerService {
	
	Customer getCustomerById(UUID id);

	Customer saveNewCustomer(Customer customer);

	void updateCustomer(UUID id, Customer customer);

	void deletebyId(UUID id);

}
