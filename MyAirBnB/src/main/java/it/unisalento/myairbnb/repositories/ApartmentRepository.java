package it.unisalento.myairbnb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.unisalento.myairbnb.entities.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
	
	 
	
	
	@Query ("select a,p,u from  apartment a JOIN a.product p JOIN p.user u where p.approved='0' ") 
	public List<Apartment> findAllApartment(); 

}
