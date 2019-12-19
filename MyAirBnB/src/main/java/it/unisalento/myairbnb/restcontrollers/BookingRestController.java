package it.unisalento.myairbnb.restcontrollers;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.BookingDTO;
import it.unisalento.myairbnb.dto.UserDTO;

@RestController //i metodi di questa classe non devono renderizzare pagine html ma in un formato che specifico io
@RequestMapping("/booking")

public class BookingRestController {
	
	
	
	@RequestMapping(value="/get/{id}",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE		
					)
	public BookingDTO get(@PathVariable int id) {
		
		
		BookingDTO bookingDTO = new BookingDTO();
		UserDTO user = new UserDTO();
		//per passare dei parametri posso farlo dal browser tramite URL localhost80880/booking/get/4848
		bookingDTO.setId(id);
		bookingDTO.setCheckin(new Date());
		bookingDTO.setDaynumber(4);
		bookingDTO.setUser(user);
		bookingDTO.setPrice(40);
		//bookingDTO.setBookingdate(NULL);
		user.setId(129);
		user.setName("epami");
		user.setSurname("Diaz");
		return bookingDTO;
		
	}

}
