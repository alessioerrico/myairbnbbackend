package it.unisalento.myairbnb.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Product;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;

public interface UserService {

	public User saveOrUpdate(User user);
	public List <User> getAll();
	public List <User> getByEmail(String email);
	public User getById (int id) throws UserNotFoundException; //faccio lanciare a questo metodo eventuali eccezzioni cheho definito in exceptions
	public List <User> getByName(String name);
	
	public List<Product> getProductbyId(int idproduct);
	public List <User> getByNameAndSurname(String name, String surname);
	public String getUserRole(String email);
	public void delete(int id) throws UserNotFoundException;
	
	public Page<User> gettAll(int page, int size);
	
	
	
	
	
}