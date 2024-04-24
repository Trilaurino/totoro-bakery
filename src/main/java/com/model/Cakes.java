package com.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Cakes.findAll", query = "SELECT c FROM Cakes c")
public class Cakes implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int idCakes;
	
	private String name;
	private int cost;
	private String typeOfCake;
	private String size;
	private Date uploadDate;
	private List<String> idIngredients;
	
	//Getters and Setters
	public int getIdCakes() {
		return idCakes;
	}
	public void setIdCakes(int idCakes) {
		this.idCakes = idCakes;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public String getTypeOfCake() {
		return typeOfCake;
	}
	public void setTypeOfCake(String typeOfCake) {
		this.typeOfCake = typeOfCake;
	}
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	
	public List<String> getIdIngredients() {
		return idIngredients;
	}
	public void setIdIngredients(List<String> idIngredients) {
		this.idIngredients = idIngredients;
	}

	//constructor
	public Cakes(){
		
	}
	
}
