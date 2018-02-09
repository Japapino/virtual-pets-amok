

import org.junit.Assert;
import org.junit.Test;

public class RoboCatTest {
	@Test
	public void shouldHaveDefaultStats() {
		RoboCat underTest = new RoboCat("","");
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = underTest.getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		RoboCat underTest = new RoboCat("","");
		underTest.play();
		Assert.assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void shouldAssignName() {
		RoboCat underTest = new RoboCat("Billy","");
		Assert.assertEquals("Billy", underTest.getName());
	}

	@Test
	public void shouldIncreaseWaste() {
		RoboCat underTest = new RoboCat("","");
		underTest.giveTreat();
		Assert.assertEquals(5, underTest.checkWaste());
	}

	@Test
	public void tickShouldChangeStats() {
		RoboCat underTest = new RoboCat("","");
		underTest.tickIncrease();
		Assert.assertEquals(99, underTest.getHealth());
		Assert.assertEquals(2, underTest.getHunger());
		Assert.assertEquals(5, underTest.getBoredom());
		Assert.assertEquals(1, underTest.getThirst());
		Assert.assertEquals(3, underTest.checkWaste());
	}

}
