

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldHaveDefaultStats() {
		VirtualPet underTest = new VirtualPet();
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = underTest.getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		VirtualPet underTest = new VirtualPet();
		underTest.play();
		Assert.assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void shouldAssignName() {
		VirtualPet underTest = new VirtualPet();
		underTest.setName("Billy");
		Assert.assertEquals("Billy", underTest.getName());
	}

	@Test
	public void shouldIncreaseWaste() {
		VirtualPet underTest = new VirtualPet();
		underTest.giveTreat();
		Assert.assertEquals(5, underTest.checkWaste());
	}

	@Test
	public void tickShouldChangeStats() {
		VirtualPet underTest = new VirtualPet();
		underTest.tickIncrease();
		Assert.assertEquals(99, underTest.getHealth());
		Assert.assertEquals(2, underTest.getHunger());
		Assert.assertEquals(5, underTest.getBoredom());
		Assert.assertEquals(0, underTest.getThirst());
		Assert.assertEquals(3, underTest.checkWaste());
	}

}
