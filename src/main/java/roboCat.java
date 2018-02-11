
public class RoboCat extends Robotic{
	
	public RoboCat (String name, String description) {
		super(name,description);
		this.health = 100;
		this.rust = 0;
		this.boredom = 0;
		this.oilLevel = 25;
	}
	
	public RoboCat(String name, String description, int rust, int oilLevel, int health) {
		super(name,description);
		this.health = health;
		this.rust = rust;
		this.boredom = 0;
		this.oilLevel = oilLevel;

	}
}
