package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CakesRepository;
import com.model.Cakes;

@RestController
@RequestMapping("/cakes")
public class CakesRest {
	
	@Autowired
	private CakesRepository cakesRep;
	
	////ADD
	@PostMapping("/add-new-cake")
	public String addCakes(@RequestBody Cakes cakes){
		cakesRep.save(cakes);
		return "CakesAdded";
	}

	////UPDATE
	@PutMapping("/update-cakes")
	public String updateCakes(@RequestBody Cakes cakes) {
		cakesRep.save(cakes);
		return "CakesUpdated";
	}
	
	////DELETE
	@DeleteMapping("/delete-cakes")
	public String deleteCakes(@RequestBody Cakes cakes) {
		cakesRep.delete(cakes);
		return "CakesDeleted";
	}
}
