package org.iesvdm.tutorial;

import org.iesvdm.tutorial.repository.SocioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TutorialApplicationTests {

	@Autowired
	SocioRepository socioRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testOneToOneSocio(){
		var socioList = socioRepository.findAll();

		socioList.forEach(System.out::println);
	}
}
