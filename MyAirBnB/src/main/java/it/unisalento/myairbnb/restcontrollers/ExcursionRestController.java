package it.unisalento.myairbnb.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.ExcursionDTO;
import it.unisalento.myairbnb.entities.Excursion;
import it.unisalento.myairbnb.service.ExcursionService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class ExcursionRestController {
	@Autowired
	ExcursionService excursionService;

	@GetMapping( value="/getAllExcursion", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ExcursionDTO> getAllExcursion()	{
		List<Excursion> list= excursionService.getAllExcursion();
		List<ExcursionDTO> dtoList = new ArrayList<ExcursionDTO>();
		for(Excursion ex:list) {
			
			
			
			ExcursionDTO exDTO=new ExcursionDTO();
			exDTO.setEnd_lat(ex.getEndLat());
			exDTO.setEnd_lon(ex.getEndLon());
			exDTO.setIdexcursion(ex.getIdexcursion());
			
			exDTO.setIdproduct(ex.getProduct().getIdproduct());
			exDTO.setPrice(ex.getProduct().getPrice());
					
			exDTO.setDescription(ex.getProduct().getDescription());
			exDTO.setLongitude(ex.getProduct().getLong_());
			exDTO.setLat(ex.getProduct().getLat());
			exDTO.setApproved(ex.getProduct().getApproved());
			exDTO.setUrlImmagine(ex.getProduct().getUrlImmagine());
			exDTO.setStartAvailability(ex.getProduct().getStartAvailability());
			exDTO.setEndAvailability(ex.getProduct().getEndAvailability());
			exDTO.setIdseller(ex.getProduct().getUser().getIduser());
			exDTO.setNameseller(ex.getProduct().getUser().getName());
			exDTO.setSurnameseller(ex.getProduct().getUser().getSurname());
			exDTO.setEmailseller(ex.getProduct().getUser().getEmail());	
			exDTO.setBirthdateseller(ex.getProduct().getUser().getBirthdate());
			//System.out.println(carDTO.getBirthdateseller());			
			dtoList.add(exDTO);			
		}	
		return dtoList;
		
	}
}
