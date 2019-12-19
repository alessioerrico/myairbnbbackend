package it.unisalento.myairbnb.restcontrollers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.CarDTO;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.service.CarService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class CarRestController {
	
	@Autowired
	CarService carService;
	
	@GetMapping( value="/getAllCars", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CarDTO> getAllCars()	{
		List<Car> list= carService.getAllCars();
		List<CarDTO> dtoList = new ArrayList<CarDTO>();
		for(Car car:list) {
			
			
			
			CarDTO carDTO=new CarDTO();
			carDTO.setLicense_plate(car.getLicensePlate());
			carDTO.setModel(car.getModel());
			carDTO.setSeats(car.getSeats());
			carDTO.setFuel(car.getFuel());
			carDTO.setBrand(car.getBrand());
			carDTO.setType(car.getType());
			carDTO.setTransmission(car.getTransmission());
			
			carDTO.setIdproduct(car.getProduct().getIdproduct());
			carDTO.setPrice(car.getProduct().getPrice());
			carDTO.setDescription(car.getProduct().getDescription());
			carDTO.setLongitude(car.getProduct().getLong_());
			carDTO.setLat(car.getProduct().getLat());
			carDTO.setApproved(car.getProduct().getApproved());
			carDTO.setUrlImmagine(car.getProduct().getUrlImmagine());
			carDTO.setStartAvailability(car.getProduct().getStartAvailability());
			carDTO.setEndAvailability(car.getProduct().getEndAvailability());
			carDTO.setIdseller(car.getProduct().getUser().getIduser());
			carDTO.setNameseller(car.getProduct().getUser().getName());
			carDTO.setSurnameseller(car.getProduct().getUser().getSurname());
			carDTO.setEmailseller(car.getProduct().getUser().getEmail());			
			carDTO.setBirthdateseller(car.getProduct().getUser().getBirthdate());
			System.out.println(carDTO.getBirthdateseller());			
			dtoList.add(carDTO);			
		}	
		return dtoList;
		
	}
	
	

}
