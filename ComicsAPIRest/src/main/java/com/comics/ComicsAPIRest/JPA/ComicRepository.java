package com.comics.ComicsAPIRest.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.comics.ComicsAPIRest.Model.Comic;

@Repository
public interface ComicRepository extends CrudRepository<Comic, Integer> {
	
	public Comic findByNom(String nom);

}