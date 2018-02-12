
public abstract class Robotic extends VirtualPet{

	protected int boredom;
	protected int oilLevel; 
	protected int rust; 
	
	public Robotic(String name, String description) {
		this.name = name;
		this.description = description; 
		health = 100;
		boredom = 0;
		oilLevel = 25; 
	}
	
	public Robotic(String name, String description, int rust, int oilLevel, int health) {
		this.name = name;
		this.description = description; 
		this.health = health;
		this.rust = rust;
		this.boredom = 0;
		this.oilLevel = oilLevel;

	}


	public void checkStats() {
		if (this.health > 100) {
			this.health = 100;
		}
		if (this.boredom <= 0) {
			this.boredom = 0;
		}
		if (this.oilLevel >= 25) {
			this.oilLevel = 25;
		}
		if (this.rust <= 0) {
			this.rust = 0;
		}
	}
	
	public void tickIncrease() {
		health -= 1;
		boredom += 10;
		oilLevel -=1;
		rust += 1;
		this.checkStats();
	}
	

	public void play() {
		oilLevel -=1;
		health += 5;
		boredom -= 15;
		rust += 1;
		this.checkStats();
	}

	public void maintain() {
		rust = 0;
		boredom += 25;
		oilLevel = 25;
		this.checkStats();

	}

	public int getOilLevel() {
		return oilLevel;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getRust() {
		return rust;
	}

}