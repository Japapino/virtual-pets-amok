

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class OrganicDogTest {
	@Test
	public void shouldHaveDefaultStats() {
		Dog underTest = new OrganicDog("","");
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = ((OrganicDog) underTest).getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		OrganicDog underTest = new OrganicDog("","");
		underTest.tickIncrease(); 
		int boredomBefore = underTest.getBoredom();
		underTest.play();
		int boredomAfter = underTest.getBoredom();
		Assert.assertThat(boredomBefore-boredomAfter, is(10));
	}
//
//	@Test
//	public void shouldAssignName() {
//		OrganicDogTest underTest = new OrganicDogTest("Billy","");
//		Assert.assertEquals("Billy", underTest.getName());
//	}
//
//	@Test
//	public void shouldIncreaseWaste() {
//		OrganicDogTest underTest = new OrganicDogTest("","");
//		underTest.giveTreat();
//		Assert.assertEquals(5, underTest.getWaste());
//	}
//
//	@Test
//	public void tickShouldChangeStats() {
//		RoboDog underTest = new RoboDog("","");
//		underTest.tickIncrease();
//		Assert.assertEquals(99, underTest.getHealth());
//		Assert.assertEquals(2, underTest.getHunger());
//		Assert.assertEquals(10, underTest.getBoredom());
//		Assert.assertEquals(1, underTest.getThirst());
//		Assert.assertEquals(3, underTest.getWaste());
//	}
//	
//	@Test
//	public void walkShouldReducePoop() {
//		RoboDog underTest = new RoboDog("","");
//		underTest.giveFood();
//		underTest.giveFood();
//		int wasteBefore = underTest.getPoops(); 
//		underTest.takeWalk();
//		int wasteAfter = underTest.getPoops();
//		assertThat(wasteBefore-wasteAfter, is(1)); 
//	}
//	
//	@Test
//	public void walkShouldIncreaseHealth() {
//		RoboDog underTest = new RoboDog("","");
//		underTest.giveTreat();
//		int healthBefore = underTest.getHealth();
//		underTest.takeWalk(); 
//		int healthAfter = underTest.getHealth(); 
//		assertThat(healthAfter-healthBefore, is(5)); 
//	}

}
