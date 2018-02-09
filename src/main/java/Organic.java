
public class Organic extends VirtualPet{
	
	protected int waste;
	protected int thirst;
	protected int hunger;
	protected int boredom;
	protected int poops;

	public Organic(String name, String description) {
		this.name = name;
		this.description = description; 
		health = 100;
		hunger = 0;
		thirst = 0;
		boredom = 0;
		waste = 0;
		poops = 0;

	}

	public Organic(String name, String description, int hunger, int thirst, int health) {
		this.name = name;
		this.description = description; 
		this.health = health;
		this.hunger = hunger;
		this.boredom = 0;
		this.thirst = thirst;
		waste = 0;
	}

	public void checkStats() {
		if (this.health > 100) {
			this.health = 100;
		}
		if (this.hunger <= 0) {
			this.hunger = 0;
		}
		if (this.boredom <= 0) {
			this.boredom = 0;
		}
		if (this.thirst <= 0) {
			this.thirst = 0;
		}
		if (this.waste <= 0) {
			this.waste = 0;
		}
	}

	public void tickIncrease() {
		health -= 1;
		hunger += 2;
		boredom += 10;
		thirst += 1;
		waste += 3;
		this.checkStats();
	}

	public void giveTreat() {
		thirst += 3;
		hunger -= 1;
		health -= 5;
		waste += 5;
		this.checkStats();
	}
	

	public void play() {
		hunger += 10;
		health += 5;
		boredom -= 15;
		thirst += 10;
		this.checkStats();
	}

	public void giveWater() {
		hunger -= 3;
		thirst -= 10;
		boredom += 10;
		waste += 3;
		this.checkStats();
	}

	public void giveFood() {
		hunger -= 10;
		health -= 2;
		thirst += 3;
		waste += 5;
		this.checkStats();
	}

	public void cleanUp() {
		waste = 0;
		boredom += 25;
		poops = 0;
		this.checkStats();

	}

	public int getWaste() {
		return waste;
	}

	
	public int getHunger() {
		return hunger;
	}


	public int getThirst() {
		return thirst;
	}


	public int getPoops() {
		if (this.waste >= 10) {
			poops += (waste / 10);
		}
		return poops;
	}


	public int getBoredom() {
		return boredom;
	}

}
