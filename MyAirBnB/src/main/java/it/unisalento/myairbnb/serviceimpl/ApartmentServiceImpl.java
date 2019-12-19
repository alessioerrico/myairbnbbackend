package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.repositories.ApartmentRepository;
import it.unisalento.myairbnb.service.ApartmentService;
@Service
public class ApartmentServiceImpl implements ApartmentService{
	@Autowired
	ApartmentRepository repository;
	
	@Override
	@Transactional
	public List<Apartment> getAllApartment() {
		// TODO Auto-generated method stub
		return repository.findAllApartment();
	}
	
}
