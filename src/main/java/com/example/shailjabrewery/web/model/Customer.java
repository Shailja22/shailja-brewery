package com.example.shailjabrewery.web.model;

import java.util.Objects;
import java.util.UUID;


public class Customer {
	
	private UUID id;
	private String name;
	
	
	public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Customer customer = new Customer();

        public Builder id(UUID id) {
        	customer.id = id;
            return this;
        }

        public Builder name(String name) {
        	customer.name = name;
            return this;
        }


        public Customer build() {
            return customer;
        }
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
    
    

}
