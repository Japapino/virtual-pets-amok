
public class OrganicDog extends Organic implements Walkable{
	
	public OrganicDog (String name, String description) {
		super(name,description);
	}
	
	public void takeWalk() {
		boredom -= 5;
		waste = 0;
		poops = 0;
		hunger += 5;
		thirst += 10;
		health += 10;
		this.checkStats();
	}
	

}
