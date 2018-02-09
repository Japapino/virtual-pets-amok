
public class RoboPet extends VirtualPet{
	private int rust = 0; 
	
	public RoboPet(String name, String description) {
		this.name = name; 
		this.description = description; 
	}
	
	public RoboPet(String name, String description, int health, int rust) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.boredom = 0;
		this.rust = rust; 

	}
	
	public int getRust() {
		return rust; 
	}
	
	public void changeOil() {
		health+=5;
		rust -=2; 
	}

}
