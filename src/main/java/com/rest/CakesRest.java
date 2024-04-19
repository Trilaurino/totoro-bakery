package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CakesRepository;
import com.model.Cakes;

@RestController
@RequestMapping("CakesRest")
public class CakesRest {
	
	@Autowired
	private CakesRepository cakesRep;
	
	
	////ADD
	@PostMapping("addCakes")
	public String addCakes(@RequestBody Cakes cakes){
		cakesRep.save(cakes);
		return "CakesAdded";
	}

	////UPDATE
	@PutMapping("updateCakes")
	public String updateCakes(@RequestBody Cakes cakes) {
		cakesRep.save(cakes);
		return "CakesUpdated";
	}
	
	////DELETE
	@DeleteMapping("deleteCakes")
	public String deleteCakes(@RequestBody Cakes cakes) {
		cakesRep.delete(cakes);
		return "CakesDeleted";
	}
}
