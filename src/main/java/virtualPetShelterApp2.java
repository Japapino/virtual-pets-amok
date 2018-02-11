
public class virtualPetShelterApp2 {
	public static void main(String[]args) {
		PetShelter myShelter = new PetShelter(); 
		OrganicDog dog1 = new OrganicDog("Dog1","");
		OrganicDog dog2 = new OrganicDog("Dog2","");
		OrganicDog dog3 = new OrganicDog("Dog3","");
		myShelter.addPet(dog1);
		myShelter.addPet(dog2);
		myShelter.addPet(dog3);
		myShelter.feedAll();
		myShelter.feedAll(); 
		myShelter.checkCages(); 
		myShelter.cleanHabitats();
		myShelter.checkCages(); 
		

	}

}
