package com.gray.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gray.dojos.models.Ninja;
import com.gray.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	/*
	 ********************************
	 **************DATA**************
	 ********************************
	 */
	//get all
	public List<Ninja> findAllNinja() {
		return ninjaRepository.findAll();
	}
	//get one by ID
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else return null;
	}
	//create one
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	//update one by ID
	public Ninja updateNinja(Ninja ninja) {	
		return ninjaRepository.save(ninja);
	}
	//delete one by ID
	public void deleteDojo(Long id) {
		ninjaRepository.deleteById(id);
	}
}
