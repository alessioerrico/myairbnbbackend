package it.unisalento.myairbnb.dto;

import java.sql.Timestamp;
import java.util.Date;


import javax.validation.constraints.NotEmpty;



public class CarDTO {
	@NotEmpty
	String license_plate;
	String model;
	int seats;
	String fuel;	
	String brand;
	String type;
	String transmission;
	@NotEmpty
	int idproduct;
	
	//Parent attributes
	float price;
	
	String description;
	float longitude;
	float lat;
	String approved;
	String urlImmagine;
	Timestamp startAvailability;
	Timestamp endAvailability;
	int idseller;
	String nameseller;
	String surnameseller;
	Date birthdateseller;
	String emailseller;

	public String getNameseller() {
		return nameseller;
	}
	public void setNameseller(String nameseller) {
		this.nameseller = nameseller;
	}
	public String getSurnameseller() {
		return surnameseller;
	}
	public void setSurnameseller(String surnameseller) {
		this.surnameseller = surnameseller;
	}
	public Date getBirthdateseller() {
		return birthdateseller;
	}
	public void setBirthdateseller(Date birthdateseller) {
		this.birthdateseller = birthdateseller;
	}
	public String getEmailseller() {
		return emailseller;
	}
	public void setEmailseller(String emailseller) {
		this.emailseller = emailseller;
	}
	    
	
	
	
	
		
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getUrlImmagine() {
		return urlImmagine;
	}
	public void setUrlImmagine(String urlImmagine) {
		this.urlImmagine = urlImmagine;
	}
	public Timestamp getStartAvailability() {
		return startAvailability;
	}
	public void setStartAvailability(Timestamp startAvailability) {
		this.startAvailability = startAvailability;
	}
	public Timestamp getEndAvailability() {
		return endAvailability;
	}
	public void setEndAvailability(Timestamp endAvailability) {
		this.endAvailability = endAvailability;
	}
	public int getIdseller() {
		return idseller;
	}
	public void setIdseller(int idseller) {
		this.idseller = idseller;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	
	
	
}
