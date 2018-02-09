

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class RoboDogTest {
	@Test
	public void shouldHaveDefaultStats() {
		Dog underTest = new Dog("","");
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = underTest.getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		Dog underTest = new Dog("","");
		underTest.play();
		Assert.assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void shouldAssignName() {
		Dog underTest = new Dog("Billy","");
		Assert.assertEquals("Billy", underTest.getName());
	}

	@Test
	public void shouldIncreaseWaste() {
		Dog underTest = new Dog("","");
		underTest.giveTreat();
		Assert.assertEquals(5, underTest.checkWaste());
	}

	@Test
	public void tickShouldChangeStats() {
		Dog underTest = new Dog("","");
		underTest.tickIncrease();
		Assert.assertEquals(99, underTest.getHealth());
		Assert.assertEquals(2, underTest.getHunger());
		Assert.assertEquals(10, underTest.getBoredom());
		Assert.assertEquals(1, underTest.getThirst());
		Assert.assertEquals(3, underTest.checkWaste());
	}
	
	@Test
	public void walkShouldReducePoop() {
		Dog underTest = new Dog("","");
		underTest.giveFood();
		underTest.giveFood();
		int wasteBefore = underTest.getPoops(); 
		underTest.takeWalk();
		int wasteAfter = underTest.getPoops();
		assertThat(wasteBefore-wasteAfter, is(1)); 
	}
	
	@Test
	public void walkShouldIncreaseHealth() {
		Dog underTest = new Dog("","");
		underTest.giveTreat();
		int healthBefore = underTest.getHealth();
		underTest.takeWalk(); 
		int healthAfter = underTest.getHealth(); 
		assertThat(healthAfter-healthBefore, is(5)); 
	}

}
