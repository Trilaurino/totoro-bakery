package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UsersRepository;
import com.model.Users;


@RestController
@RequestMapping("UsersRest")
public class UsersRest {
	
	@Autowired
	private UsersRepository usersRep;
	
	////ADD
	@PostMapping("addUsers")
	public String addUsers(@RequestBody Users users) {
		usersRep.save(users);
		return "UsersAdded";
	}
	
	////UPDATE
	@PutMapping("updateUsers")
	public String updateUsers(@RequestBody Users users) {
		usersRep.save(users);
		return "UsersUpdated";
	}
	
	////DELETE
	@DeleteMapping("deleteUsers")
	public String deleteUsers(@RequestBody Users users) {
		usersRep.delete(users);
		return "UsersDeleted";
	}
}
