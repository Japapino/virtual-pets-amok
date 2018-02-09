
public class RoboDog extends Dog implements Robotic{
	private int rust = 0; 
	private int oil = 10; 
	
	public RoboDog(String name, String description) {
		super(name, description); 
	}
	
	public RoboDog(String name, String description, int health, int rust) {
		super(name, description); 
		this.health = health;
		this.rust = rust; 
	}
	
	@Override
	public void clean() {
		health+=10; 
		rust = 0;
		oil = 10; 
	}

	@Override
	public int getRust() {
		return rust; 
		
	}

	@Override
	public int getOil() {
		return oil; 
		
	}


}
