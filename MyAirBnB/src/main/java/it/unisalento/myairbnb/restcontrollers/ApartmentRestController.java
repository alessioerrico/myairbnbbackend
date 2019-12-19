package it.unisalento.myairbnb.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.ApartmentDTO;
import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.service.ApartmentService;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class ApartmentRestController {
	@Autowired
	ApartmentService apartmentService;
	
	@GetMapping( value="/getAllApartment", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ApartmentDTO> getAll()	{
		List<Apartment> list= apartmentService.getAllApartment();
		List<ApartmentDTO> dtoList = new ArrayList<ApartmentDTO>();
		for(Apartment apartment:list) {
			
			ApartmentDTO apartmentDTO= new ApartmentDTO();
			apartmentDTO.setIdproduct(apartment.getProduct().getIdproduct());
			apartmentDTO.setPrice(apartment.getProduct().getPrice());
			apartmentDTO.setDescription(apartment.getProduct().getDescription());
			apartmentDTO.setLongitude(apartment.getProduct().getLong_());
			apartmentDTO.setLat(apartment.getProduct().getLat());
			apartmentDTO.setApproved(apartment.getProduct().getApproved());
			apartmentDTO.setUrlImmagine(apartment.getProduct().getUrlImmagine());
			apartmentDTO.setStartAvailability(apartment.getProduct().getStartAvailability());
			apartmentDTO.setEndAvailability(apartment.getProduct().getEndAvailability());
			apartmentDTO.setIdseller(apartment.getProduct().getUser().getIduser());
			apartmentDTO.setNameseller(apartment.getProduct().getUser().getName());
			apartmentDTO.setSurnameseller(apartment.getProduct().getUser().getSurname());
			apartmentDTO.setEmailseller(apartment.getProduct().getUser().getEmail());		
			apartmentDTO.setBirthdateseller(apartment.getProduct().getUser().getBirthdate());

			
			
			
			apartmentDTO.setIdapartment(apartment.getIdapartment());
			apartmentDTO.setBathrooms(apartment.getBathrooms());
			apartmentDTO.setBeds(apartment.getBeds());
			apartmentDTO.setRooms(apartment.getRooms());
			
			
			dtoList.add(apartmentDTO);
			
		}
		
	
		return dtoList;
		
	}

}
