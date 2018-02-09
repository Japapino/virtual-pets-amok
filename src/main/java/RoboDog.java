
public class RoboDog extends Robotic implements Walkable{
	public RoboDog (String name, String description) {
		super(name,description);
	}
	
	public void takeWalk() {
		boredom -= 5;
		oilLevel -=5;
		rust =+2;
		health += 10;
		this.checkStats();
	}
}
