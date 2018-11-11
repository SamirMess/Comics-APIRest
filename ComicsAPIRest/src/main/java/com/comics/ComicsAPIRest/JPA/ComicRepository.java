package com.comics.ComicsAPIRest.JPA;

import org.springframework.data.repository.CrudRepository;
import com.comics.ComicsAPIRest.Model.Comic;

public interface ComicRepository extends CrudRepository<Comic, Integer> {

}