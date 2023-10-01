package com.example.shailjabrewery.web.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.shailjabrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Carlsberg")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beer) {
		return beer;
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beer) {
		// Retrieve the existing BeerDto by id
        BeerDto existingBeerOptional = getBeerById(beerId);

        if (existingBeerOptional != null) {
            
            // Update the fields of the existing BeerDto with the values from the request body
        	existingBeerOptional.setBeerName(beer.getBeerName());
        	existingBeerOptional.setBeerStyle(beer.getBeerStyle());
        	existingBeerOptional.setUpc(beer.getUpc());

            // Save the updated BeerDto back to your data source
            saveNewBeer(existingBeerOptional);
    }

		
	}

	@Override
	public void deletebyId(UUID beerId) {
	System.out.println("Deleting a beer");
		
	}
	
	
}
