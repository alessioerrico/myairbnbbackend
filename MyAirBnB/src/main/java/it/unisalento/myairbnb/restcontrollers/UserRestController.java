package it.unisalento.myairbnb.restcontrollers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.ProductDTO;
import it.unisalento.myairbnb.dto.UserDTO;
import it.unisalento.myairbnb.entities.Product;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserRestController {
	
	@Autowired
	UserService userService;

	
	@PostMapping(
				value = "/save",
				consumes = MediaType.APPLICATION_JSON_VALUE, //formato in cui passiamo i dati (JSON)
				produces = MediaType.APPLICATION_JSON_VALUE
			)
public User post(@RequestBody @Valid UserDTO userDTO) {  
		
		//oggetto contenuto nel body convertilo in oggetto java
		//@valid permette di specificare validation definiti in DTO
		
		userDTO.setId(457); // l'id viene restituito dal sistema e non dall'utente
		User user = new User();
		
		
		user.setBirthdate(this.dataConvert(userDTO.getBirthdate()));
		
		user.setName(userDTO.getName());
		user.setSurname(userDTO.getSurname());
		user.setEmail(userDTO.getEmail());  
		user.setIduser(userDTO.getId());
		user.setRole(userDTO.getRole());
		System.out.println(user.getBirthdate());
		return userService.saveOrUpdate(user);  
		
		
		
			
		
	}
	
	@PutMapping(
			value="/update",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public User update(@RequestBody @Valid UserDTO userDTO) throws UserNotFoundException {
		if(userDTO.getId()!=0) {
			userDTO.setId(457); // l'id viene restituito dal sistema e non dall'utente
			User user = new User();
			
			
			//user.setBirthdate(new Timestamp(0));
			user.setName(userDTO.getName());
			user.setSurname(userDTO.getSurname());
			user.setEmail(userDTO.getEmail());  
			user.setIduser(userDTO.getId());
			
			return userService.saveOrUpdate(user);    
			}
			else {
				throw new UserNotFoundException();
			}
			
				
			
		
	}
	
	
	@GetMapping( value="/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public UserDTO get( @PathVariable int id)  throws UserNotFoundException {
	User user=userService.getById(id);
	UserDTO userDTO= new UserDTO();
	userDTO.setId(user.getIduser());
	//userDTO.setDataNascita(new Date(user.getBirthdate().getTime()));
	userDTO.setEmail(user.getEmail());
	userDTO.setName(user.getName());
	userDTO.setSurname(user.getSurname());
	return userDTO;
	}
	
	@GetMapping( value="/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDTO> getAll()	{
		List<User> list= userService.getAll();
		List<UserDTO> dtoList = new ArrayList<UserDTO>();
		for(User user:list) {
			
			UserDTO userDTO= new UserDTO();
			userDTO.setId(user.getIduser());
			//userDTO.setDataNascita(new Date(user.getBirthdate().getTime()));
			userDTO.setEmail(user.getEmail());
			userDTO.setName(user.getName());
			userDTO.setSurname(user.getSurname());
			dtoList.add(userDTO);
			
		}
		
	
		return dtoList;
		
	}
	@GetMapping( value="/getProductById/{idproduct}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDTO> getProductById(@PathVariable int idproduct)	{
		List<Product> list= userService.getProductbyId(idproduct);
		List<ProductDTO> dtoList = new ArrayList<ProductDTO>();
		for(Product product:list) {
			
			ProductDTO productDTO= new ProductDTO();
			
			
			productDTO.setIdproduct(idproduct);
			//userDTO.setDataNascita(new Date(user.getBirthdate().getTime()));
			
			productDTO.setDescription(product.getDescription());
			
			
			dtoList.add(productDTO);
			
		}
		
		System.out.println(dtoList);
		return dtoList;
	}
	
	
	
	
	@GetMapping( value="/getByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDTO> getByName(@PathVariable String name)	{
		List<User> list= userService.getByName(name);
		List<UserDTO> dtoList = new ArrayList<UserDTO>();
		for(User user:list) {
			
			UserDTO userDTO= new UserDTO();
			userDTO.setId(user.getIduser());
			//userDTO.setDataNascita(new Date(user.getBirthdate().getTime()));
			userDTO.setEmail(user.getEmail());
			userDTO.setName(user.getName());
			userDTO.setSurname(user.getSurname());
			dtoList.add(userDTO);
			
		}
		
		System.out.println(dtoList);
		return dtoList;
	}
	
	@GetMapping( value="/getUserRole/{email:.+}", produces = MediaType.APPLICATION_JSON_VALUE)// IMPORTANTE. METTERE PUNTO ALLA FINE DELLA RICHIESTA POSTMAN CIOE' http://localhost:8080/user/getUserRole/simone@mail.it. 
	public String getUserRole(@PathVariable String email)	{
		System.out.println(email);
		String role= userService.getUserRole(email);
		return role;
		
		
	/*	List<User> list= userService.getUserRole(email);
		List<UserDTO> dtoList = new ArrayList<UserDTO>();
		for(User user:list) {
			
			UserDTO userDTO= new UserDTO();
			userDTO.setId(user.getIduser());
			userDTO.setDataNascita(new Date(user.getBirthdate().getTime()));
			userDTO.setEmail(user.getEmail());
			userDTO.setName(user.getName());
			userDTO.setSurname(user.getSurname());
			dtoList.add(userDTO);
			
		}
		
		System.out.println(dtoList);
		return dtoList;*/
	}
	
	
	@GetMapping( value="/getByNameAndSurname/{name}&{surname}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDTO> getByNameAndSurname(@PathVariable String name, @PathVariable String surname)	{
		List<User> list= userService.getByNameAndSurname(name, surname);
		List<UserDTO> dtoList = new ArrayList<UserDTO>();
		for(User user:list) {
			
			UserDTO userDTO= new UserDTO();
			userDTO.setId(user.getIduser());
			//userDTO.setDataNascita(new Date(user.getBirthdate().getTime()));
			userDTO.setEmail(user.getEmail());
			userDTO.setName(user.getName());
			userDTO.setSurname(user.getSurname());
			dtoList.add(userDTO);
			
		}
		
		return dtoList;
	}
	
	private static java.sql.Date dataConvert (java.util.Date uDate) {
		new SimpleDateFormat("yyyy-MM-dd").format(uDate);
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
	
	
	
}
























