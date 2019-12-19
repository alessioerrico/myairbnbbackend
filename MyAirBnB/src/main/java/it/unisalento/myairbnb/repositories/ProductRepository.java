package it.unisalento.myairbnb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Transactional
	 @Modifying
	@Query ("update product p SET p.approved='1' where p.idproduct=:idproduct") 
	public void  approveProduct(@Param("idproduct")int idproduct); 

}
