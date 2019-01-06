package com.comics.ComicsAPIRest.Controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.comics.ComicsAPIRest.Model.Comic;
import com.comics.ComicsAPIRest.Service.ComicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ComicController {
	@Autowired
    ComicService comicService;

	// Récuperer la liste des infos de tous les personnages comics
    @GetMapping("/comics")
    private List<Comic> getAllComics() {
        return comicService.getAllComics();
    }

    // Récuperer les infos du personnage en utilisant son id
    @GetMapping("/comics/{id}")
    private Comic getComic(@PathVariable("id") int id) {
        return comicService.getComicById(id);
    }
    
    // la feature intelligente (rechercher l'id d'un personnage en utilisant son nom)
    @GetMapping("/comics/search/{nom}")
    public int getIdComic(@PathVariable("nom") String nom) {
    	Comic comi = new Comic();
    	ComicService comicService = new ComicService();
    	int identifiant = 0;
    		 // parcourir la liste de tous les personnages
    	     System.out.println(comicService.getAllComics().size());
	    	 for(int i = 1; i <= comicService.getAllComics().size(); i++)
	         {
	    		 comi = comicService.getComicById(i);
	    		 System.out.println(comi.getNom());
	    		 System.out.println(nom);
	    		 System.out.println(comi.getNom().equals(nom));
	    		 // tester l'existance du nom dans la base (pour chaque itération)
	        	 if(comi.getNom().equals(nom))
	        	 {
	        		 identifiant = comi.getId(); 
	        		 System.out.println(identifiant); 
	        	 }
	         }
    	
    	 return identifiant; 
    }

    // Supprimer un personnage comic de la BDD en utilisant son identifiant "id"
    @DeleteMapping("/comics/{id}")
    private void deleteComic(@PathVariable("id") int id) {
        comicService.delete(id);
    }

    // Sauvegarder un personnage comic dans la base de données
    @PostMapping("/comics")
    private int saveComic(@RequestBody Comic comic) {
        comicService.saveOrUpdate(comic);
        return comic.getId();
    }
}
