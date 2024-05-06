package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.Cakes;

@Repository
public interface CakesRepository extends JpaRepository<Cakes, Integer> {
	List<Cakes> findByTypeOfCake(String typeOfCake);
	List<Cakes> findByName(String name);
}
