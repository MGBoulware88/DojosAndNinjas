package com.gray.dojos.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.gray.dojos.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	//grab all
		List<Ninja> findAll();
		//all other methods needed come from CrudRepository for free
}
