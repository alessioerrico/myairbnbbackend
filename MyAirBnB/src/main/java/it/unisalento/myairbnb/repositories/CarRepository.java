package it.unisalento.myairbnb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, String>{
	@Query ("select c,p,u from  car c JOIN c.product p JOIN p.user u where p.approved='0' ") 
	public List<Car> findAllCars(); 

}
