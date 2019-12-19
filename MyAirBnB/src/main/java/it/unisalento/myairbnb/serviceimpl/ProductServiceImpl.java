package it.unisalento.myairbnb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.repositories.ProductRepository;
import it.unisalento.myairbnb.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository repository;
	@Transactional
	public void ApproveProduct(int idproduct){
		// TODO Auto-generated method stub
		 repository.approveProduct(idproduct);
	}

}
