package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.service.CarService;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.repositories.CarRepository;

@Service
public class CarServiceImpl implements CarService  {
	
	@Autowired
	CarRepository repository;
	
	@Override
	@Transactional
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return repository.findAllCars();
	}

	
	}


