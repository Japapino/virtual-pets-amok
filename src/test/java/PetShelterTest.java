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

	@Before
	public void setup() {
		// arrange
		underTest = new PetShelter();

	}

	@Test
	public void shouldOrganicDogAndRoboticDog() {
		OrganicDog oDog = new OrganicDog("Dog1", "");
		RoboDog rDog = new RoboDog("Dog2", "");
		underTest.addPet(oDog);
		underTest.addPet(rDog);
		Collection<VirtualPet> pets = underTest.allPets();
		assertThat(pets, containsInAnyOrder(oDog, rDog));

	}

	@Test
	public void shouldRemoveAPet() {
		RoboDog rDog = new RoboDog("Dog2", "");
		underTest.addPet(rDog);
		underTest.adopt("Dog2");
		VirtualPet found = underTest.findPet(rDog.name);
		assertThat(found, is(nullValue()));
	}

	@Test
	public void hungerShouldReduce() {
		OrganicDog oDog = new OrganicDog("", "");
		underTest.addPet(oDog);
		oDog.play();
		oDog.play();
		int hungerBefore = oDog.getHunger();
		oDog.giveFood();
		int hungerAfter = oDog.getHunger();
		assertThat(hungerBefore - hungerAfter, is(10));
	}

	@Test
	public void hungerShouldReduceForBoth() {
		OrganicDog nDog = new OrganicDog("", "");
		underTest.addPet(nDog);
		nDog.play();
		int hungerBefore = nDog.getHunger();
		underTest.feedAll();
		int hungerAfter = nDog.getHunger();
		assertThat(hungerBefore - hungerAfter, is(10));
	}

	@Test
	public void boredomShouldGoDown() {
		OrganicDog oDog = new OrganicDog("TEST","");
		RoboCat rCat = new RoboCat("TEST2","");
		oDog.cleanUp();
		oDog.play();
		rCat.maintain();
		rCat.play();
		int check = oDog.getBoredom();
		assertEquals(10, check);
		assertEquals(10, check);
	}

	@Test
	public void statsShouldChangeOverTimeForAllPets() {
		OrganicDog oDog = new OrganicDog("TEST","");
		RoboCat rCat = new RoboCat("TEST2","");
		underTest.addPet(oDog);
		underTest.addPet(rCat);
		underTest.tickIncreaseAll();
		int thirstAfter = oDog.getThirst();
		int check1 = rCat.getOilLevel();
		assertThat(thirstAfter, is(2));
		assertEquals(24, check1);
	}

	@Test
	public void shouldIncreaseThirstForOrganics() {
		OrganicDog nDog = new OrganicDog("", "");
		underTest.addPet(nDog);
		underTest.tickIncreaseAll();
		int thirstBefore = nDog.getThirst();
		underTest.waterAll();
		int thirstAfter = nDog.getThirst();
		assertThat(thirstBefore - thirstAfter, is(2));

	}

	@Test
	public void shouldNotifyForExcessWaste() {
		OrganicDog tDog = new OrganicDog("", "");
		underTest.addPet(tDog);
		underTest.feedAll();
		underTest.feedAll();
		int check = tDog.getPoops();
		assertEquals(2, check);
	}

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
