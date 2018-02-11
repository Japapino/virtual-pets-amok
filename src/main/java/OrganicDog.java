
public class OrganicDog extends Organic implements Walkable{
	
	public OrganicDog(String name, String description) {
		super(name,description);
		health = 100;
		hunger = 0;
		thirst = 0;
		boredom = 0;
		waste = 0;
		poops = 0;

	}

	public OrganicDog(String name, String description, int hunger, int thirst, int health) {
		super(name,description);
		this.health = health;
		this.hunger = hunger;
		this.boredom = 0;
		this.thirst = thirst;
		waste = 0;
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
	
	public int cageCleanliness() {
		//TODO
	}
	

}
