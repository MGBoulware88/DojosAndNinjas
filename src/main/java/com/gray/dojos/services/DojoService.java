package com.gray.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gray.dojos.models.Dojo;
import com.gray.dojos.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	/*
	 ********************************
	 **************DATA**************
	 ********************************
	 */
	//get all
	public List<Dojo> findAllDojos() {
		return dojoRepository.findAll();
	}
	//get one by ID
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else return null;
	}
	//create one
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	//update one by ID
	public Dojo updateDojo(Dojo dojo) {	
		return dojoRepository.save(dojo);
	}
	//delete one by ID
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
}
