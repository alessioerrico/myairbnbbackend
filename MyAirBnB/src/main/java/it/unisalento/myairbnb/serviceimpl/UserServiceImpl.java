package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Product;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.repositories.UserRepository;
import it.unisalento.myairbnb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository repository;
	
	@Override
	@Transactional
	public User saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}
	@Override
	@Transactional //serve per semplificare i dialoghi con il database
	public String getUserRole(String email) {
		// TODO Auto-generated method stub
		return repository.findRole(email);//metodo già implementato per ottenere tutti gli utenti
	}

	@Override
	@Transactional //serve per semplificare i dialoghi con il database
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();//metodo già implementato per ottenere tutti gli utenti
	}
	
	

	
	
	@Override
	@Transactional
	public List<Product> getProductbyId(int idproduct) {
		// TODO Auto-generated method stub
		return repository.findProductById(idproduct);
	}
	

	@Override
	@Transactional
	public List<User> getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = UserNotFoundException.class) //se qualcosa va storto nel db il roll back ripristina lo stato precedente
	public User getById(int id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		/*
		//Primo modo di implementare get by id
		User user=repository.getOne(id); //metodo che ritorna l'oggetto user che corrisponde a quell id
		//devo verificare se user id è null o no per poter lanciare l'eccezione
		if (user==null)
		{
			throw new UserNotFoundException();
			
		}
		else 
		{
			return user;
		}	*/
		//Un altro modo è il seguente
		/*
		Optional<User> optional=repository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		else {
			throw  new UserNotFoundException();
		}*/
		//Terzo metodo per cui mi posso rispariamre le 5 righe di codice precedenti
		return repository.findById(id).orElseThrow(()-> new UserNotFoundException());
		// questa sintassi permette di passare una funzione (lambda expression ->)come argomento e mi permette di compattare in una riga di codice sia il lancio dell'eccezione sia la stampa del id trovato
	}

	@Override
	@Transactional
	public List<User> getByName(String name) {
		// TODO Auto-generated method stub
		Sort sort =new Sort(Sort.Direction.DESC, "iduser"); // con l oggetto della classe sort ordino in maniera discendete la lista secondo l iduser
		return repository.findByName(name,sort);
	}

	@Override
	@Transactional
	public List<User> getByNameAndSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return repository.findByNameAndSurname(name, surname);
	}

	@Override
	@Transactional(rollbackFor = UserNotFoundException.class)
	public void delete(int id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		User user= repository.findById(id).orElseThrow(()-> new UserNotFoundException());
		repository.deleteById(id);// il metedo delete è un void per cui non sappiamo se la cancellazizone è avvenuta, risolvo il problema facendo un controllo sull id
		
	}

	@Override
	@Transactional
	public Page<User> gettAll(int page, int size) { //metodo che serve per visuallizare quanti elementi voglio di una pagina di una pagina specifica che voglio io .Evita di fare una chiamata al service rest controller
		// TODO Auto-generated method stub
		Pageable pageable= PageRequest.of(page, size);
		return repository.findAll(pageable);
	}

}
