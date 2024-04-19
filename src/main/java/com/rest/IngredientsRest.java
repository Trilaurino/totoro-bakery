package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dao.IngredientsRepository;
import com.model.Ingredients;




@RestController
@RequestMapping("IngredientsRest")
public class IngredientsRest {
	
	@Autowired
	private IngredientsRepository ingredientsRep;
	
	
	////ADD
	@PostMapping("addIngredients")
	public String addIngredients(@RequestBody Ingredients ingredients) {
		ingredientsRep.save(ingredients);
		return "IngredientsAdded";
	}
	
	////UPDATE
	@PutMapping("updateIngredients")
	public String updateIngredients(@RequestBody Ingredients ingredients) {
		ingredientsRep.save(ingredients);
		return "IngredientsUpdated";
	}
	
	////DELETE
	@DeleteMapping("deleteIngredients")
	public String deleteIngredients(@RequestBody Ingredients ingredients) {
		ingredientsRep.delete(ingredients);
		return "IngredientsDeleted";
	}

}
