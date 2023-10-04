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
import com.example.shailjabrewery.web.services.BeerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerbyId(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(BeerDto.builder().build() ,HttpStatus.OK);
    }
    
    @PostMapping("/beerdetails")
    public ResponseEntity<BeerDto> addBeer(@RequestBody BeerDto beer){

        BeerDto save = beerService.saveNewBeer(beer);
        
       // HttpHeaders headers = new HttpHeaders();
        
        //headers.add("Location","/api/v1/beer" + save.getId().toString());
        return new ResponseEntity<>(save,HttpStatus.CREATED);
        
    }
    
    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beer){
    	 BeerDto updated = beerService.updateBeer(beerId,beer);
        return new ResponseEntity<>(updated,HttpStatus.NO_CONTENT);
    }
    
    
    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
    	beerService.deletebyId(beerId);
       
    }


}