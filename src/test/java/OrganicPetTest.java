

import org.junit.Assert;
import org.junit.Test;

public class OrganicPetTest {
	@Test
	public void shouldHaveDefaultStats() {
		OrganicPet underTest = new OrganicPet("","");
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = underTest.getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		OrganicPet underTest = new OrganicPet("","");
		underTest.play();
		Assert.assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void shouldAssignName() {
		OrganicPet underTest = new OrganicPet("Billy","");
		Assert.assertEquals("Billy", underTest.getName());
	}

	@Test
	public void shouldIncreaseWaste() {
		OrganicPet underTest = new OrganicPet("","");
		underTest.giveTreat();
		Assert.assertEquals(5, underTest.checkWaste());
	}

	@Test
	public void tickShouldChangeStats() {
		OrganicPet underTest = new OrganicPet("","");
		underTest.tickIncrease();
		Assert.assertEquals(99, underTest.getHealth());
		Assert.assertEquals(2, underTest.getHunger());
		Assert.assertEquals(5, underTest.getBoredom());
		Assert.assertEquals(1, underTest.getThirst());
		Assert.assertEquals(3, underTest.checkWaste());
	}

}
