package com.assignment.singtel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.assignment.singtel.constant.AnimalSounds;
import com.assignment.singtel.constant.AnimalType;
import com.assignment.singtel.constant.FishCriteria;
import com.assignment.singtel.constant.FishType;
import com.assignment.singtel.constant.Language;
import com.assignment.singtel.requestDto.Animal;
import com.assignment.singtel.requestDto.Bird;
import com.assignment.singtel.requestDto.Butterfly;
import com.assignment.singtel.requestDto.Cat;
import com.assignment.singtel.requestDto.Chicken;
import com.assignment.singtel.requestDto.Clownfish;
import com.assignment.singtel.requestDto.Dog;
import com.assignment.singtel.requestDto.Dolhpin;
import com.assignment.singtel.requestDto.Duck;
import com.assignment.singtel.requestDto.Fish;
import com.assignment.singtel.requestDto.Frog;
import com.assignment.singtel.requestDto.Parrot;
import com.assignment.singtel.requestDto.Rooster;
import com.assignment.singtel.requestDto.Shark;
import com.assignment.singtel.responseDto.AnimalCounterRespDto;
import com.assignment.singtel.responseDto.AnimalRespDto;
import com.assignment.singtel.responseDto.FishCriteriaRespDto;
import com.assignment.singtel.rest.controllers.AnimalsController;
import com.assignment.singtel.services.AnimalDetailsService;
import com.assignment.singtel.services.AnimalDetailsServiceImpl;
import com.assignment.singtel.services.FishCriteriaServiceImpl;
import com.assignment.singtel.util.AnimalsUtil;

/**
 * Junit 5 test case
 * 
 * @author Veisheng
 *
 */
@WebMvcTest(controllers = AnimalsController.class)
@ContextConfiguration(classes = AnimalsController.class)
@ExtendWith(MockitoExtension.class)
class SolutionTests {

	@InjectMocks
	private FishCriteriaServiceImpl fishCriteriaServiceImpl;

	@InjectMocks
	private AnimalDetailsServiceImpl animalDetailsServiceImpl;

	@MockBean
	private AnimalDetailsService animalDetailsService;

	@Autowired
	private MockMvc mockMvc;

	/**
	 * Unit test for Question A.1.1
	 */
	@Test
	public void testBird() {
		System.out.println("----------------BIRD----------------");
		Bird bird = new Bird();
		boolean isWalk = bird.isWalk();
		boolean isFly = bird.isFly();
		boolean isSing = bird.isSing();
		assertTrue(isWalk);
		assertTrue(isFly);
		assertTrue(isSing);
	}

	/**
	 * Unit test for Question A.2.1 , A.2.2
	 */
	@Test
	public void testDuck() {
		System.out.println("----------------DUCK----------------");
		Duck duck = new Duck();
		boolean isSing = duck.isSing();
		boolean isisSwim = duck.isSwim();
		assertTrue(isSing);
		assertTrue(isisSwim);
	}

	/**
	 * Unit test for Question A.2.3 , A.2.4
	 */
	@Test
	public void testChicken() {
		System.out.println("----------------CHICKEN----------------");
		Chicken chicken = new Chicken();
		boolean isSing = chicken.isSing();
		boolean isFly = chicken.isFly();
		assertTrue(isSing);
		assertFalse(isFly);
	}

	/**
	 * Unit test for Question A.3.1 , A.3.2, A.3.3
	 */
	@Test
	public void testRooster() {
		System.out.println("----------------ROOSTER----------------");
		Rooster rooster = new Rooster();
		boolean isSing = rooster.sing(Language.ENGLISH.getLanguage());
		boolean isFly = rooster.isFly();
		assertTrue(isSing);
		assertFalse(isFly);
	}

	/**
	 * Unit test for Question A.4.1 , A.4.2, A.4.3, A.4.4
	 */
	@Test
	public void testParrot() {
		Parrot parrot = new Parrot();
		System.out.println("----------------PARROT WITH DOG----------------");
		String livingWithDog = parrot.livingWith(AnimalType.DOG.getType());
		assertTrue(livingWithDog.equalsIgnoreCase(AnimalSounds.DOG.getSound()));
		System.out.println("----------------PARROT WITH CAT----------------");
		String livingWithCat = parrot.livingWith(AnimalType.CAT.getType());
		assertTrue(livingWithCat.equalsIgnoreCase(AnimalSounds.CAT.getSound()));
		System.out.println("----------------PARROT WITH ROOSTER----------------");
		String livingWithRooster = parrot.livingWith(AnimalType.ROOSTER.getType());
		assertTrue(livingWithRooster.equalsIgnoreCase(AnimalSounds.ROOSTER.getSound()));
		System.out.println("----------------PARROT WITH DUCK----------------");
		String livingWithDuck = parrot.livingWith(AnimalType.DUCK.getType());
		assertTrue(livingWithDuck.equalsIgnoreCase(AnimalSounds.DUCK.getSound()));
	}

	/**
	 * Unit test for Question B.1.1 , B.1.2, B.1.3
	 */
	@Test
	public void testFish() {
		System.out.println("----------------FISH----------------");
		Fish fish = new Fish();
		boolean isSing = fish.isSing();
		boolean isWalk = fish.isWalk();
		boolean isisSwim = fish.isSwim();
		assertFalse(isSing);
		assertFalse(isWalk);
		assertTrue(isisSwim);
	}

	/**
	 * Unit test for fish criteria
	 */
	@Test
	public void testFishCriteriaService() {
		assertThrows(NullPointerException.class, () -> {
			fishCriteriaServiceImpl.getFishCriteria("");
		});
	}

	/**
	 * Unit test for Question B.2.1 , B.2.4
	 */
	@Test
	public void testShark() {
		System.out.println("----------------SHARK----------------");
		Shark shark = new Shark();
		boolean isisSwim = shark.isSwim();
		assertTrue(isisSwim);

		FishCriteriaRespDto sharkResult = fishCriteriaServiceImpl.getFishCriteria(FishType.SHARK.getFishType());
		assertTrue(sharkResult.getSize().equals(FishCriteria.LARGE.getFishCriteria()));
		assertTrue(sharkResult.getColor().equals(FishCriteria.GREY.getFishCriteria()));
		assertTrue(sharkResult.getHobbies().equals(FishCriteria.SHARK_HOBBIES.getFishCriteria()));
	}

	/**
	 * Unit test for Question B.2.2 , B.2.3
	 */
	@Test
	public void testClownfish() {
		System.out.println("----------------CLOWNFISH----------------");
		Clownfish clownfish = new Clownfish();
		boolean isisSwim = clownfish.isSwim();
		assertTrue(isisSwim);

		FishCriteriaRespDto clownfishResult = fishCriteriaServiceImpl.getFishCriteria(FishType.CLOWNFISH.getFishType());
		assertTrue(clownfishResult.getSize().equals(FishCriteria.SMALL.getFishCriteria()));
		assertTrue(clownfishResult.getColor().equals(FishCriteria.ORANGE.getFishCriteria()));
		assertTrue(clownfishResult.getHobbies().equals(FishCriteria.CLOWNFISH_HOBBIES.getFishCriteria()));
	}

	/**
	 * Unit test for Question B.3.1 , B.3.2
	 */
	@Test
	public void testDolphinfish() {
		System.out.println("----------------DOLPHIN----------------");
		Dolhpin dolhpin = new Dolhpin();
		boolean isisSwim = dolhpin.isSwim();
		assertTrue(isisSwim);

		FishCriteriaRespDto dolphinResult = fishCriteriaServiceImpl.getFishCriteria(FishType.DOLHPIN.getFishType());
		assertTrue(dolphinResult.getSize().equals(FishCriteria.MEDIUM.getFishCriteria()));
		assertTrue(dolphinResult.getColor().equals(FishCriteria.GREY.getFishCriteria()));
		assertTrue(dolphinResult.getHobbies().equals(FishCriteria.DOLPHIN_HOBBIES.getFishCriteria()));
	}

	/**
	 * Unit test for Question C.1.1 , C.1.2
	 */
	@Test
	public void testButterfly() {
		System.out.println("----------------BUTTERFLY----------------");
		Butterfly butterfly = new Butterfly();
		butterfly.setCaterpillar(false);
		boolean isFly = butterfly.isFly();
		assertTrue(isFly);
		boolean isSing = butterfly.isSing();
		assertFalse(isSing);
		boolean isWalk = butterfly.isWalk();
		assertFalse(isWalk);
	}

	/**
	 * Unit test for Question C.2.1 , C.2.2
	 */
	@Test
	public void testCaterpillar() {
		System.out.println("----------------CATERPILLAR----------------");
		Butterfly butterfly = new Butterfly();
		butterfly.setCaterpillar(true);
		boolean isFly = butterfly.isFly();
		assertFalse(isFly);
		boolean isWalk = butterfly.isWalk();
		assertTrue(isWalk);
	}

	/**
	 * Unit test for Question D.1.1, D.1.2, D.1.3, D.1.4
	 */
	@Test
	public void testCountAnimalBehaviour() {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolhpin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };
		AnimalCounterRespDto countResult = AnimalsUtil.AnimalCount(animals);
		assertEquals(countResult.getFlyCount(), 4);
		assertEquals(countResult.getWalkCount(), 8);
		assertEquals(countResult.getSingCount(), 8);
		assertEquals(countResult.getSwimCount(), 5);
	}

	/**
	 * Unit test for Bonus Question 1
	 */
	@Test
	public void testRoosterOtherLanguages() {
		Rooster rooster = new Rooster();
		Arrays.asList(Language.values()).forEach(result -> rooster.sing(result.getLanguage()));
	}

	/**
	 * Unit test for Bonus Question 2 - Single animal
	 */
	@Test
	public void testAnimalsControllerRestApiForSingleAnimal() throws Exception {
		List<AnimalRespDto> animalResponseList = new ArrayList<>();
		AnimalRespDto animalResult = new AnimalRespDto();
		animalResult.setAnimalType(AnimalType.BIRD.getType());
		animalResult.setCriteria(new Bird());
		animalResponseList.add(animalResult);

		Mockito.when(animalDetailsService.getAnimalDetails(AnimalType.BIRD.getType())).thenReturn(animalResponseList);
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/animal/details").param("type", AnimalType.BIRD.getType()))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		assertEquals(200, result.getResponse().getStatus());
		assertNotNull(animalDetailsServiceImpl.getAnimalDetails(AnimalType.BIRD.getType()));
	}

	/**
	 * Unit test for Bonus Question 2 - All animals
	 */
	@Test
	public void testAnimalsControllerRestApiForAllAnimal() throws Exception {
		List<AnimalRespDto> responseList = new ArrayList<>();
		for (AnimalType animalType : AnimalType.values()) {
			AnimalRespDto resp = new AnimalRespDto();
			resp.setAnimalType(animalType.getType());
			resp.setCriteria(animalType.getCriteria());
			responseList.add(resp);
		}

		Mockito.when(animalDetailsService.getAnimalDetails("all")).thenReturn(responseList);
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/animal/details").param("type", "all"))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		assertEquals(200, result.getResponse().getStatus());
		assertNotNull(animalDetailsServiceImpl.getAnimalDetails("all"));
	}
}
