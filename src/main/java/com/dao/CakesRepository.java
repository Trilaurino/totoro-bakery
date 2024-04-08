package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.Cakes;

@Repository
public interface CakesRepository extends JpaRepository<Cakes, Integer> {

}
