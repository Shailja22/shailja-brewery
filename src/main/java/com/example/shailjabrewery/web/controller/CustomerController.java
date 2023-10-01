package com.example.shailjabrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.shailjabrewery.web.model.BeerDto;
import com.example.shailjabrewery.web.model.Customer;
import com.example.shailjabrewery.web.services.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	  private final CustomerService customerService;

	    public CustomerController(CustomerService customerService) {
	        this.customerService = customerService;
	    }
	
	@GetMapping({"/{customerId}"})
	public ResponseEntity<Customer> getCustomerDetails(@PathVariable("customerId") UUID id){
		
		return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
		
	}
	
	 @PostMapping("/beerdetails")
	    public ResponseEntity<Customer> addBeer(@RequestBody Customer customer){

		 Customer save = customerService.saveNewCustomer(customer);
	        
	        HttpHeaders headers = new HttpHeaders();
	        //TODO - add hostname to url
	        headers.add("Location","/api/v1/beer" + save.getId().toString());
	        return new ResponseEntity<>(headers,HttpStatus.CREATED);
	        
	    }
	    
	    @PutMapping({"/{customerId}"})
	    public ResponseEntity<Customer> updateBeer(@PathVariable("customerId") UUID id,@RequestBody Customer customer){
	    	customerService.updateCustomer(id,customer);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	    
	    
	    @DeleteMapping({"/{customerId}"})
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void deleteCustomer(@PathVariable("customerId") UUID id){
	    	customerService.deletebyId(id);
	       
	    }

}
