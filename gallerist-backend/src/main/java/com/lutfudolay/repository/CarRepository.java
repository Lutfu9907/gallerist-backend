package com.lutfudolay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lutfudolay.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
