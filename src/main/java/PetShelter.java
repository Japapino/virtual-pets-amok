import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class PetShelter {

	private Map<String, VirtualPet> inhabitants = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet pet) {
		inhabitants.put(pet.name, pet);
	}

	public VirtualPet findPet(String name) {
		return inhabitants.get(name);
	}

	public Collection<VirtualPet> allPets() {
		return inhabitants.values();
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
			if (entry instanceof OrganicDog)
				System.out.print(entry.getName()+ " ");
				System.out.println(((Organic) entry).getPoops());
		}
	}

	public void cleanHabitats() {
		for (VirtualPet entry : inhabitants.values()) {
			if (entry instanceof OrganicDog)
				((Organic) entry).cleanCage();
		}
	}

	public void listOrganics() {

		System.out.print("Name\t");
		System.out.print("|Hunger\t");
		System.out.print("|Thirst\t");
		System.out.print("|Boredom");
		System.out.println("|Waste\t");
		System.out.println("--------|-------|-------|-------|-------");
		for(VirtualPet entry : inhabitants.values()) {
			if(entry instanceof Organic) {
				System.out.print(((Organic) entry).getName() + "\t");
				System.out.print("|" + ((Organic) entry).getHunger() + "\t");
				System.out.print("|" + ((Organic) entry).getThirst() + "\t");
				System.out.print("|" + ((Organic) entry).getBoredom() + "\t");
				System.out.println("|" + ((Organic) entry).getWaste() + "\t");
			}
		}
		
	}
	public void listStatsAll() {
		for (Entry<String, VirtualPet> entry : inhabitants.entrySet()) {
			System.out.print(entry.getValue().getName() + "\t");
			System.out.print("|" + ((Organic) entry).getHunger() + "\t");
			System.out.print("|" + ((Organic) entry).getThirst() + "\t");
			System.out.print("|" + entry.getValue().getBoredom() + "\t");
			System.out.println("|" + ((Organic) entry).getWaste() + "\t");
		}
		System.out.println("--------|-------|-------|-------|------");
	}

	public void listRobotics() {
		System.out.print("Name\t");
		System.out.print("|Health\t");
		System.out.print("|Oil \t");
		System.out.print("|Boredom");
		System.out.println("|Rust\t");
		System.out.println("--------|-------|-------|-------|-------");
		for(VirtualPet entry : inhabitants.values()) {
			if(entry instanceof Robotic) {
				System.out.print(((Robotic) entry).getName() + "\t");
				System.out.print("|" + ((Robotic) entry).getHealth() + "\t");
				System.out.print("|" + ((Robotic) entry).getOilLevel() + "\t");
				System.out.print("|" + ((Robotic) entry).getBoredom() + "\t");
				System.out.println("|" + ((Robotic) entry).getRust() + "\t");
			}
		}
		
	}

//	public void giveTreatTo(String response) {
//		inhabitants.get(response).giveTreat();
//	}

}
