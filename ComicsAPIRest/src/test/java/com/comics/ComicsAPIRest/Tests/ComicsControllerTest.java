package com.comics.ComicsAPIRest.Tests;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import com.comics.ComicsAPIRest.JPA.ComicRepository;
import com.comics.ComicsAPIRest.Model.Comic;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ComicsControllerTest {
	
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private ComicRepository comicRepository;

	@SuppressWarnings("deprecation")
	@Test
	public void TestSearchByNom()
	{
		Comic comic1 = new Comic(1,"Batman", "male", "humain", "https://www.superherodb.com/pictures2/portraits/10/100/1496.jpg");
	    entityManager.persist(comic1);
	    entityManager.flush();
	    
	    
	    Comic trouve = comicRepository.findByNom(comic1.getNom());
	    //System.out.println(trouve.getNom());
	    
	    Assert.assertEquals(trouve.getNom(),comic1.getNom());
	    
	    
		// Arrange
	    //ComicRepository comicRepository = null;
	    //ComicService comicService = new ComicService();
		//ReflectionTestUtils.setField(comicService, "comicRepository", comicRepository);

//		
//		ComicController testerGetId = new ComicController();
//		//Comic comic1 = new Comic(1,"Batman", "male", "humain", "https://www.superherodb.com/pictures2/portraits/10/100/1496.jpg");
//		//comicService.saveOrUpdate(comic1);
//		//comicRepository.save(comic1);
//		Comic comic2 = new Comic(2,"Wonder Woman", "femelle", "humain", "https://www.superherodb.com/pictures2/portraits/10/100/1496.jpg");
//		comicRepository.save(comic2);
//		System.out.println(comicRepository.findAll());
//		
//		// Act
//		int id = testerGetId.getIdComic("Batman");
//		
//		// Assert
//		System.out.println(id);
//		assertEquals(1, id);
	}

}
