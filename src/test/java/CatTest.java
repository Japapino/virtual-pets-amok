

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
	@Test
	public void shouldHaveDefaultStats() {
		Cat underTest = new Cat("","");
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = underTest.getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		Cat underTest = new Cat("","");
		underTest.play();
		Assert.assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void shouldAssignName() {
		Cat underTest = new Cat("Billy","");
		Assert.assertEquals("Billy", underTest.getName());
	}

	@Test
	public void shouldIncreaseWaste() {
		Cat underTest = new Cat("","");
		underTest.giveTreat();
		Assert.assertEquals(5, underTest.checkWaste());
	}

	@Test
	public void tickShouldChangeStats() {
		Cat underTest = new Cat("","");
		underTest.tickIncrease();
		Assert.assertEquals(99, underTest.getHealth());
		Assert.assertEquals(2, underTest.getHunger());
		Assert.assertEquals(5, underTest.getBoredom());
		Assert.assertEquals(1, underTest.getThirst());
		Assert.assertEquals(3, underTest.checkWaste());
	}

}
