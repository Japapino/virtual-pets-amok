
public class RoboDog extends Robotic implements Walkable{
	public RoboDog (String name, String description) {
		super(name,description);
		this.health = 100;
		this.rust = 0;
		this.boredom = 0;
		this.oilLevel = 10;
	}
	
	public RoboDog(String name, String description, int rust, int oilLevel, int health) {
		super(name,description);
		this.health = health;
		this.rust = rust;
		this.boredom = 0;
		this.oilLevel = oilLevel;

	}
	public void takeWalk() {
		boredom -= 5;
		oilLevel -=5;
		rust =+2;
		health += 10;
		this.checkStats();
	}
}
