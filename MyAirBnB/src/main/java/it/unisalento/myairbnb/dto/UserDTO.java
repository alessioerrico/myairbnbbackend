
package it.unisalento.myairbnb.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import it.unisalento.myairbnb.validators.UserDTONameConstrains;;

public class UserDTO {

	int id;
	@NotEmpty   // attributo che segue deve avere un valore
	//@UserDTONameConstrains(name ="osvaldo") //annotazione custom, esclude il nome Osvaldo
	String name;
	@NotEmpty
	String surname;
	@NotEmpty
	@Email
	String email;
	@NotEmpty
	String role;
	
	Date birthdate;
	
	
	
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate=birthdate;
		
	}
	
	/*@NotEmpty
	String birthdate;
	
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate=birthdate;
		
	}
	*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}