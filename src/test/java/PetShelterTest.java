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
	private OrganicDog oDog = new OrganicDog("Dog1", "");
	private RoboDog rDog = new RoboDog("Dog2", "");
	private OrganicCat oCat = new OrganicCat("Dog1", "");
	private RoboCat rCat = new RoboCat("Cat2", "");

	@Before
	public void setup() {
		// arrange
		underTest = new PetShelter();

	}

	@Test
	public void shouldOrganicDogAndRoboticDog() {

		underTest.addPet(oDog);
		underTest.addPet(rDog);
		Collection<VirtualPet> pets = underTest.allPets();
		assertThat(pets, containsInAnyOrder(oDog, rDog));

	}

	@Test
	public void shouldRemoveAPet() {
		underTest.addPet(rDog);
		underTest.adopt("Dog2");

		VirtualPet found = underTest.findPet(rDog.name);
		assertThat(found, is(nullValue()));
	}

	@Test
	public void hungerShouldReduce() {
		underTest.addPet(oDog);
		oDog.play();
		oDog.play();
		oDog.giveFood();
		int check = oDog.getHunger();
		assertEquals(10, check);
	}

	 @Test
	 public void hungerShouldReduceForBoth() {
	 underTest.addPet(oDog);
	 underTest.addPet(oCat);
	 oDog.play();
	 int hungerBefore = oDog.getHunger(); 
	 int hungerBefore1= oCat.getHunger(); 
	 underTest.feedAll();
	 int hungerAfter = oDog.getHunger();
	 int hungerAfter1 = oCat.getHunger(); 
	 assertThat(hungerBefore-hungerAfter, is(0));
	 assertThat(hungerBefore1-hungerAfter1, is(0));
	 }
	
	// @Test
	// public void boredomShouldGoDown() {
	// pet.cleanUp();
	// pet.play();
	// int check = pet.getBoredom();
	// assertEquals(10, check);
	// }
	//
	// @Test
	// public void statsShouldChangeOverTimeForAllPets() {
	// Dog anotherPet = new Dog("TEST2", "VPET2");
	// underTest.addPet(pet);
	// underTest.addPet(anotherPet);
	// underTest.tickIncreaseAll();
	// int check = pet.getWaste();
	// int check1 = anotherPet.getWaste();
	// assertEquals(3, check);
	// assertEquals(3, check1);
	// }
	//
	// @Test
	// public void shouldNotifyForExcessWaste() {
	// Dog anotherPet = new Dog("TEST2", "VPET2");
	// underTest.addPet(anotherPet);
	// underTest.feedAll();
	// underTest.feedAll();
	// int check = pet.getPoops();
	// int check1 = anotherPet.getPoops();
	// assertEquals(1, check);
	// assertEquals(1, check1);
	// }
	//
	// @Test
	// public void poopsShouldBuildUp() {
	// Dog anotherPet = new Dog("TEST2", "VPET2");
	// underTest.addPet(anotherPet);
	// underTest.feedAll();
	// underTest.feedAll();
	// underTest.feedAll();
	// underTest.feedAll();
	// int check = pet.getPoops();
	// int check1 = anotherPet.getPoops();
	// assertEquals(2, check);
	// assertEquals(2, check1);
	// }
	//
	// @Test
	// public void shouldCheckCleanlinessAndReturnUncleanKeys() {
	// Dog anotherPet = new Dog("TEST2", "VPET2");
	// underTest.addPet(anotherPet);
	// underTest.feedAll();
	// underTest.feedAll();
	// boolean check = underTest.cleanliness().contains("TEST");
	// boolean check1 = underTest.cleanliness().contains("TEST2");
	// assertEquals(true, check);
	// assertEquals(true, check1);
	//
	// }

}
