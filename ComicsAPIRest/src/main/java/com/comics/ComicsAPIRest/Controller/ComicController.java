package com.comics.ComicsAPIRest.Controller;

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

@RestController
public class ComicController {
	@Autowired
    ComicService comicService;

    @GetMapping("/comics")
    private List<Comic> getAllComics() {
        return comicService.getAllComics();
    }

    @GetMapping("/comics/{id}")
    private Comic getComic(@PathVariable("id") int id) {
        return comicService.getComicById(id);
    }

    @DeleteMapping("/comics/{id}")
    private void deleteComic(@PathVariable("id") int id) {
        comicService.delete(id);
    }

    @PostMapping("/comics")
    private int saveComic(@RequestBody Comic comic) {
        comicService.saveOrUpdate(comic);
        return comic.getId();
    }
}
