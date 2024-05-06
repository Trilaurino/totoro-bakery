package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CakesRepository;
import com.model.Cakes;

@RestController
@RequestMapping("/cakes")
public class CakesRest {
	
	@Autowired
	private CakesRepository cakesRep;
	
	@GetMapping("/all-cakes")
	public List<Cakes> findAllCakes(){
		List<Cakes> cakes = cakesRep.findAll(uploadDate);
	
		return cakesRep.findAll();
	}
	
	////FIND BY TYPE OF CAKE
	@GetMapping("/all-{typeOfCake}-cakes")
	public List<Cakes> findByTypeOfCake(@PathVariable("typeOfCake") String typeOfCake) {
		return cakesRep.findByTypeOfCake(typeOfCake);
	}
	
	////FIND BY NAME
	@GetMapping("/{cakeName}")
	public List<Cakes> findByName(@PathVariable("cakeName") String cakeName) {
		return cakesRep.findByName(cakeName);
	}
	
	
	////BACKOFFICE
	////ADD
	@PostMapping("/admin/add-new-cake")
	public String addCakes(@RequestBody Cakes cakes){
		cakesRep.save(cakes);
		return "CakesAdded";
	}

	////UPDATE
	@PutMapping("/admin/update-cakes")
	public String updateCakes(@RequestBody Cakes cakes) {
		cakesRep.save(cakes);
		return "CakesUpdated";
	}
	
	////DELETE
	@DeleteMapping("/admin/delete-cakes")
	public String deleteCakes(@RequestBody Cakes cakes) {
		cakesRep.delete(cakes);
		return "CakesDeleted";
	}
}
