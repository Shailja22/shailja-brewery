package com.example.shailjabrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.shailjabrewery.web.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
 
	@Override
	public Customer getCustomerById(UUID id) {
		
			return Customer.builder().id(UUID.randomUUID())
					.name("Carlsberg")
					.build();

	}

	@Override
	public Customer saveNewCustomer(Customer customer) {
		return customer;
	}

	@Override
	public void updateCustomer(UUID id, Customer customer) {
		Customer existingCustomer = getCustomerById(id);

        if (existingCustomer != null) {
            
            // Update the fields of the existing Customer with the values from the request body
        	existingCustomer.setName(customer.getName());
        	
            // Save the updated Customer back to your data source
        	saveNewCustomer(existingCustomer);
    }

		
	}

	@Override
	public void deletebyId(UUID id) {
		System.out.println("Deleting a beer");
	}

}
