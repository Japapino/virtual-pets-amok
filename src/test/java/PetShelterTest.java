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
		int hungerBefore = oDog.getHunger();
		oDog.giveFood();
		int hungerAfter = oDog.getHunger();
		assertThat(hungerBefore-hungerAfter, is(10));
	}

	 @Test
	 public void hungerShouldReduceForBoth() {
	 underTest.addPet(oDog);
	 underTest.addPet(oCat);
	 oDog.play();
	 oCat.play(); 
	 int hungerBefore = oDog.getHunger(); 
	 int hungerBefore1= oCat.getHunger(); 
	 underTest.feedAll();
	 int hungerAfter = oDog.getHunger();
	 int hungerAfter1 = oCat.getHunger(); 
	 assertThat(hungerBefore-hungerAfter, is(5));
	 assertThat(hungerBefore1-hungerAfter1, is(5));
	 }
	
	 @Test
	 public void boredomShouldGoDown() {
	 oDog.cleanUp();
	 oDog.play();
	 rCat.maintain();
	 rCat.play(); 
	 int check = oDog.getBoredom();
	 assertEquals(10, check);
	 assertEquals(10,check); 
	 }
	 
	
	 @Test
	 public void statsShouldChangeOverTimeForAllPets() {
	 underTest.addPet(oDog);
	 underTest.addPet(rCat);
	 int thirstBefore = oDog.getThirst();
	 underTest.tickIncreaseAll();
	 int thirstAfter = oDog.getThirst();
	 int check1 = rCat.getOilLevel();
	 assertThat(thirstAfter-thirstBefore,is(2)); 
	 assertEquals(24, check1);
	 }
	 
//	 @Test
//	 public void shouldIncreaseThirstForOrganics() {
//		 underTest.addPet(oDog);
//		 underTest.addPet(oCat);
//		 underTest.addPet(rCat);
//		 underTest.addPet(rDog);
//		 underTest.tickIncreaseAll();
//		 //underTest.waterAll(); 
//		 int check1 = oDog.getThirst();
//		 int check2 = oCat.getThirst(); 
//		 assertThat(check1, is(1)); 
//		 
//	 }
	
//	 @Test
//	 public void shouldNotifyForExcessWaste() {
//	 underTest.addPet(oDog);
//	 underTest.feedAll();
//	 underTest.feedAll();
//	 int check = oDog.getWaste();
//	 assertEquals(1, check);
//	 }
	
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
