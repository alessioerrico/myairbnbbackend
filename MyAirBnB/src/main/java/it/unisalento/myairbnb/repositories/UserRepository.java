package it.unisalento.myairbnb.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Product;
import it.unisalento.myairbnb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByName(String name,Sort sort); //con il findBy già spring sa che deve fare una select, poi Name gli fa capire che la proprietà per cui scegliere è il nome, dichiarato come proprietà in User
	 
	@Query ("select u from User u where u.name=:name") 
	public List<User> findByNameUsingQuery(@Param("name")String name);
	 
	 //public List<User> findRole(String email); //con il findBy già spring sa che deve fare una select, poi Name gli fa capire che la proprietà per cui scegliere è il nome, dichiarato come proprietà in User
	
	 @Query ("select u.role from User u where u.email=:email") 
	public String findRole(@Param("email")String email); 
	 
	
	 
	public List<User> findByNameAndSurname(String name, String surname);
	@Query("select u from User u where u.name=:name and u.surname=:surname")
	public List<User> findByNameAndSurnameUsingQuery(@Param("name")String name,@Param("surname") String surname);
	
/*	//QUERY PER OTTENERE TUTTI I PRODOTTI PER L'ADMIN
	@Query ("select p from  product p where p.category.idcategory=:idcategory") 
	public List<Product> findAllProductsByCategory(@Param("idcategory")int idcategory); */
	
	//QUERY PER OTTENERE TUTTI I PRODOTTI PER L'ADMIN
		
		
		/*//QUERY PER OTTENERE TUTTI I PRODOTTI PER L'ADMIN
		@Query ("select c,p from  car c JOIN product p ") 
		public List<Car> findAllCars(); */		
	
	@Query ("select p from  product p where p.idproduct=:idproduct") 
	public List<Product> findProductById(@Param("idproduct")int idproduct); 
	
	

}