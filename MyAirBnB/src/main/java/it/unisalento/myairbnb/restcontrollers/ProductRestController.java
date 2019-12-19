package it.unisalento.myairbnb.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.ProductDTO;
import it.unisalento.myairbnb.service.ProductService;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class ProductRestController {
	
	@Autowired
	ProductService prodService;
	
	@PutMapping(
			value="/approveProduct",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	
	public void update(@RequestBody  ProductDTO prodDTO)  {
		
				
				
				System.out.println(prodDTO.getIdproduct());
				prodService.ApproveProduct(prodDTO.getIdproduct());
			
		
	}

}
