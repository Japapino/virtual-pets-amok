import org.junit.Test;

public class CatTest {
	
	@Test
	public void shouldInstantiateACatObject() {
		Cat underTest = new Cat(); 
		assertNotNull(underTest); 
		
	}

}
