package com.gray.dojos.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.gray.dojos.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	//grab all
		List<Dojo> findAll();
		//all other methods needed come from CrudRepository for free
}
