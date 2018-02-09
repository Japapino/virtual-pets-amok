
public class RoboPet extends VirtualPet{
	private int health = 10; 
	private int rust = 0; 
	
	public RoboPet(String name, String description) {
		this.name = name; 
		this.description = description; 
	}
	
	public int getHealth() {
		return health; 
	}
	
	public int checkRust() {
		return rust; 
	}

}
