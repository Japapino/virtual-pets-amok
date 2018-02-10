import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {
	private PetShelter underTest;
	private VirtualPet pet;
	private static final String petDescription = "VPET";
	private static final String petName = "TEST";

	@Before
	public void setup() {
		// arrange
		underTest = new PetShelter();

	}

	@Test
	public void shouldOrganicDogAndRoboticDog() {
		VirtualPet oDog = new OrganicDog("Dog1",""); 
		VirtualPet rDog = new RoboDog("Dog2",""); 		
		underTest.addPet(oDog);
		underTest.addPet(rDog);
		VirtualPet retrieved = underTest.findPet("Dog1");
		VirtualPet retrieved1 = underTest.findPet("Dog2"); 
		Collection<VirtualPet> pets = underTest.allPets(); 
		assertThat(pets, containsInAnyOrder(oDog,rDog));

	}
//
//	@Test
//	public void shouldBeAbletoAddMultiplePets() {
//		// arrange
//		Dog anotherPet = new Dog("TEST2", "VPET2");
//
//		// act
//		underTest.addPet(pet);
//		underTest.addPet(anotherPet);
//
//		// assert
//		Collection<Dog> pets = underTest.allPets();
//
//		// using matchers
//		assertThat(pets, containsInAnyOrder(pet, anotherPet));
//
//		// using assertEquals/True
//		assertTrue(pets.contains(pet));
//		assertTrue(pets.contains(anotherPet));
//		assertEquals(2, pets.size());
//
//	}
//
//	@Test
//	public void shouldRemoveAPet() {
//		underTest.addPet(pet);
//		underTest.adopt(petName);
//
//		Dog found = underTest.findPet(petName);
//		assertThat(found, is(nullValue()));
//	}
//
//	@Test
//	public void hungerShouldReduce() {
//		pet.play();
//		pet.play();
//		pet.giveFood();
//		int check = pet.getHunger();
//		assertEquals(10, check);
//	}
//
//	@Test
//	public void hungerShouldReduceForBoth() {
//		Dog anotherPet = new Dog("TEST2", "VPET2");
//		underTest.addPet(pet);
//		underTest.addPet(anotherPet);
//		pet.play();
//		pet.play();
//		anotherPet.play();
//		anotherPet.play();
//		underTest.feedAll();
//		int check = pet.getHunger();
//		int check1 = anotherPet.getHunger();
//		assertEquals(10, check);
//		assertEquals(10, check1);
//	}
//
//	@Test
//	public void boredomShouldGoDown() {
//		pet.cleanUp();
//		pet.play();
//		int check = pet.getBoredom();
//		assertEquals(10, check);
//	}
//
//	@Test
//	public void statsShouldChangeOverTimeForAllPets() {
//		Dog anotherPet = new Dog("TEST2", "VPET2");
//		underTest.addPet(pet);
//		underTest.addPet(anotherPet);
//		underTest.tickIncreaseAll();
//		int check = pet.getWaste();
//		int check1 = anotherPet.getWaste();
//		assertEquals(3, check);
//		assertEquals(3, check1);
//	}
//
//	@Test
//	public void shouldNotifyForExcessWaste() {
//		Dog anotherPet = new Dog("TEST2", "VPET2");
//		underTest.addPet(anotherPet);
//		underTest.feedAll();
//		underTest.feedAll();
//		int check = pet.getPoops();
//		int check1 = anotherPet.getPoops();
//		assertEquals(1, check);
//		assertEquals(1, check1);
//	}
//
//	@Test
//	public void poopsShouldBuildUp() {
//		Dog anotherPet = new Dog("TEST2", "VPET2");
//		underTest.addPet(anotherPet);
//		underTest.feedAll();
//		underTest.feedAll();
//		underTest.feedAll();
//		underTest.feedAll();
//		int check = pet.getPoops();
//		int check1 = anotherPet.getPoops();
//		assertEquals(2, check);
//		assertEquals(2, check1);
//	}
//
//	@Test
//	public void shouldCheckCleanlinessAndReturnUncleanKeys() {
//		Dog anotherPet = new Dog("TEST2", "VPET2");
//		underTest.addPet(anotherPet);
//		underTest.feedAll();
//		underTest.feedAll();
//		boolean check = underTest.cleanliness().contains("TEST");
//		boolean check1 = underTest.cleanliness().contains("TEST2");
//		assertEquals(true, check);
//		assertEquals(true, check1);
//
//	}

}
