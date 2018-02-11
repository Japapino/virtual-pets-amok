
public class virtualPetShelterApp2 {
	public static void main(String[]args) {
		PetShelter myShelter = new PetShelter(); 
		OrganicDog dog1 = new OrganicDog("Dog1","");
		OrganicDog dog2 = new OrganicDog("Dog2","");
		OrganicDog dog3 = new OrganicDog("Dog3","");
		RoboDog	rDog1 = new RoboDog("Dog4", "");
		RoboDog	rDog2 = new RoboDog("Dog5", "");
		RoboDog	rDog3 = new RoboDog("Dog6", "");
		OrganicCat cat1 = new OrganicCat("Cat1","");
		RoboCat cat2 = new RoboCat("Cat2",""); 

		
		//test area
		myShelter.addPet(dog1);
		myShelter.addPet(dog2);
		myShelter.addPet(dog3);
		myShelter.addPet(rDog1);
		myShelter.addPet(rDog2);
		myShelter.addPet(rDog3);
		myShelter.addPet(cat1);
		myShelter.addPet(cat2);
		
		myShelter.tickIncreaseAll();
		myShelter.tickIncreaseAll(); 
		
		//test area
		
		System.out.println("Welcome to Doug's adoption shelter! \nHere is the status of the pets:");
		System.out.println("Status of cages: ");
		
		System.out.println("---Organic---");
		myShelter.listOrganics(); 
		System.out.println("---Robotic---");
		myShelter.listRobotics(); 
		

	
	}

}
