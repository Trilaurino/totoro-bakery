package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery( name = "Cakes.findAll", query = "SELECT c FROM Cakes c")
public class Cakes {

}
