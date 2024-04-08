package com.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Ingredients.findAll", query = "SELECT i FROM Ingredients i")
public class Ingredients implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int idIngredients;
	
	
	

}
