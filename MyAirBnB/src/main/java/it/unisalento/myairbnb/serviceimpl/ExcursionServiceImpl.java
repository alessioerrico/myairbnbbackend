package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Excursion;
import it.unisalento.myairbnb.repositories.ExcursionRepository;
import it.unisalento.myairbnb.service.ExcursionService;
@Service
public class ExcursionServiceImpl implements ExcursionService{
	
	@Autowired
	ExcursionRepository repository;
	
	@Override
	@Transactional
	public List<Excursion> getAllExcursion() {
		// TODO Auto-generated method stub
		return repository.findAllExcursion();
	}

}
