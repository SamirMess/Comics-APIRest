package com.comics.ComicsAPIRest.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comics.ComicsAPIRest.JPA.ComicRepository;
import com.comics.ComicsAPIRest.Model.Comic;

@Service
public class ComicService {
	@Autowired
    ComicRepository comicRepository;

    public List<Comic> getAllComics() {
        List<Comic> comics = new ArrayList<Comic>();
        comicRepository.findAll().forEach(comic -> comics.add(comic));
        return comics;
    }

    public Comic getComicById(int id) {
        return comicRepository.findById(id).get();
    }

    public void saveOrUpdate(Comic comic) {
        comicRepository.save(comic);
    }

    public void delete(int id) {
        comicRepository.deleteById(id);
    }
}
