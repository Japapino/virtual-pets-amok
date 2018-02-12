import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class PetShelter {

	private Map<String, VirtualPet> inhabitants = new HashMap<String, VirtualPet>();
	private int litterBox = 0;

	public void addPet(VirtualPet pet) {
		inhabitants.put(pet.name, pet);
	}
	
	public VirtualPet findPet(String name) {
		return inhabitants.get(name);
	}

	public void adopt(String petName) {
		inhabitants.remove(petName);
	}

	public void feedAll() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof Organic)
				((Organic) entry).giveFood();
		}
	}

	public void waterAll() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof Organic)
				((Organic) entry).giveWater();
		}
	}

	public void tickIncreaseAll() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof Organic)
				((Organic) entry).tickIncrease();
			if (entry instanceof Robotic)
				((Robotic) entry).tickIncrease();
		}
	}

	public void playWith(String name) {
		for (Entry<String, VirtualPet> entry : inhabitants.entrySet()) {
			if (entry instanceof Organic)
				((Organic) entry).play();
			if (entry instanceof Robotic)
				((Robotic) entry).play();
		}
	}

	public String cleanliness() {
		String needsCleaning = "";
		for (VirtualPet pet : inhabitants.values()) {
			if (((Organic) pet).getPoops() >= 1) {
				needsCleaning += pet.getName() + " ";
			}
		}
		return needsCleaning;
	}

	public Set<String> listNames() {
		Set<String> petsNames = inhabitants.keySet();
		return petsNames;
	}

	public boolean checkForPet(String name) {
		return inhabitants.containsKey(name);
	}

	public void checkCages() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicDog) {
				System.out.print(entry.getName() + " ");
				System.out.println(((OrganicDog) entry).getPoops());
			}
		}
	}

	public void cleanHabitats() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicDog)
				((Organic) entry).cleanCage();
		}
	}

	public void listOrganics() {
		System.out.println("---Dogs---");
		System.out.print("Name\t");
		System.out.print("|Hunger\t");
		System.out.print("|Thirst\t");
		System.out.print("|Boredom");
		System.out.println("|Waste\t");
		System.out.println("--------|-------|-------|-------|-------");
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicDog) {
				System.out.print(((Organic) entry).getName() + "\t");
				System.out.print("|" + ((Organic) entry).getHunger() + "\t");
				System.out.print("|" + ((Organic) entry).getThirst() + "\t");
				System.out.print("|" + ((Organic) entry).getBoredom() + "\t");
				System.out.println("|" + ((Organic) entry).getWaste() + "\t");
			}
		}
		System.out.println("---Cats---");
		System.out.print("Name\t");
		System.out.print("|Hunger\t");
		System.out.print("|Thirst\t");
		System.out.print("|Boredom");
		System.out.println("|Waste\t");
		System.out.println("--------|-------|-------|-------|-------");
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicCat) {
				System.out.print(((Organic) entry).getName() + "\t");
				System.out.print("|" + ((Organic) entry).getHunger() + "\t");
				System.out.print("|" + ((Organic) entry).getThirst() + "\t");
				System.out.print("|" + ((Organic) entry).getBoredom() + "\t");
				System.out.println("|" + ((Organic) entry).getWaste() + "\t");
			}
		}
	}

	public void listRobotics() {
		System.out.println("---Dogs---");
		System.out.print("Name\t");
		System.out.print("|Health\t");
		System.out.print("|Oil \t");
		System.out.print("|Boredom");
		System.out.println("|Rust\t");
		System.out.println("--------|-------|-------|-------|-------");
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof RoboDog) {
				System.out.print(((Robotic) entry).getName() + "\t");
				System.out.print("|" + ((Robotic) entry).getHealth() + "\t");
				System.out.print("|" + ((Robotic) entry).getOilLevel() + "\t");
				System.out.print("|" + ((Robotic) entry).getBoredom() + "\t");
				System.out.println("|" + ((Robotic) entry).getRust() + "\t");
			}
		}
		System.out.println("---Cats---");
		System.out.print("Name\t");
		System.out.print("|Health\t");
		System.out.print("|Oil \t");
		System.out.print("|Boredom");
		System.out.println("|Rust\t");
		System.out.println("--------|-------|-------|-------|-------");
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof RoboCat) {
				System.out.print(((Robotic) entry).getName() + "\t");
				System.out.print("|" + ((Robotic) entry).getHealth() + "\t");
				System.out.print("|" + ((Robotic) entry).getOilLevel() + "\t");
				System.out.print("|" + ((Robotic) entry).getBoredom() + "\t");
				System.out.println("|" + ((Robotic) entry).getRust() + "\t");
			}
		}
	}

	public void cleanAllRobots(String response) {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof Robotic) {
				((Robotic) entry).maintain();

			}
		}
	}

	public void giveTreatTo(String response) {
		((Organic) inhabitants.get(response)).giveTreat();
	}

	public int litterBoxCheck() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicCat) {
				litterBox += ((OrganicCat) entry).getPoops();
			}
		}
		return litterBox;
	}

	public void cleanLitterBox() {
		litterBox = 0;
	}

	public void listDogs() {
		System.out.println("The live dogs are: ");
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicDog) {
				System.out.println(entry.getName() + ",");
			}
		}
		System.out.println("The robotic dogs are: ");
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof RoboDog) {
				System.out.println(entry.getName() + ",");
			}
		}
	}

	public void takeForAWalk(String response) {
		if (inhabitants.get(response) instanceof OrganicDog)
			((OrganicDog) inhabitants.get(response)).takeWalk();
	}
}