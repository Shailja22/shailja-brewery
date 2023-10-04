package com.example.shailjabrewery.web.services;



import java.util.UUID;

import com.example.shailjabrewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beer);

	BeerDto updateBeer(UUID beerId, BeerDto beer);

	void deletebyId(UUID beerId);
}