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

	// Récuperer la liste de tous les personnages
    public List<Comic> getAllComics() {
        List<Comic> comics = new ArrayList<Comic>();
        System.out.println(comicRepository.findAll());
        comicRepository.findAll().forEach(comic -> comics.add(comic));
        return comics;
    }

    // Récuperer les infos d'un personnage en utilisant son id
    public Comic getComicById(int id) {
        return comicRepository.findById(id).get();
    }

    // Sauvegarder ou mettre à jours un personnage
    public void saveOrUpdate(Comic comic) {
        comicRepository.save(comic);
    }

    // Supprimer un personnage en utilisant son identifiant
    public void delete(int id) {
        comicRepository.deleteById(id);
    }
}
