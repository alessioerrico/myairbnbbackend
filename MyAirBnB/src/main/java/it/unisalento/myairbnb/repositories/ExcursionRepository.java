package it.unisalento.myairbnb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.Excursion;
@Repository
public interface  ExcursionRepository extends JpaRepository<Excursion, Integer> {
	
	@Query ("select e,p,u from  excursion e JOIN e.product p JOIN p.user u where p.approved='0' ") 
	public List<Excursion> findAllExcursion(); 

}
