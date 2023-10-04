package com.example.shailjabrewery.web.services;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;
import com.example.shailjabrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
	
	 private final Map<UUID, BeerDto> beerStore = new ConcurrentHashMap<>(); // In-memory storage
	 
	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Carlsberg")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beer) {
		UUID beerId = UUID.randomUUID();
		beer.setId(beerId);
		
		beerStore.put(beerId, beer);

        return beer;
	}

	@Override
	public BeerDto updateBeer(UUID beerId, BeerDto beer) {
		// Retrieve the existing BeerDto by id
        BeerDto existingBeerOptional = getBeerById(beerId);
        BeerDto updatedBeer = new BeerDto() ;

        if (existingBeerOptional != null) {
            
            // Update the fields of the existing BeerDto with the values from the request body
        	existingBeerOptional.setBeerName(beer.getBeerName());
        	existingBeerOptional.setBeerStyle(beer.getBeerStyle());
        	existingBeerOptional.setUpc(beer.getUpc());

            // Save the updated BeerDto back to your data source
          updatedBeer =  saveNewBeer(existingBeerOptional);
    }
        return updatedBeer;

		
	}

	@Override
	public void deletebyId(UUID beerId) {
	System.out.println("Deleting a beer");
		
	}
	
	
}
