import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoboticPetsTest {
	private RoboPet underTest;
	private static final String petDescription = "RPET";
	private static final String petName = "TEST";

	@Before
	public void setup() {
		underTest = new RoboPet(petName, petDescription);
	}

	@Test
	public void shouldInstantiateARoboticPet() {
		Assert.assertNotNull(underTest);
	}

	 @Test
	 public void shouldHaveDefaultStats() {
		 int check1 = underTest.getHealth(); 
		 int check2 = underTest.getRust(); 
		 Assert.assertEquals(check1,10); 
		 Assert.assertEquals(check2,0); 
	 }
	 
	 

}
