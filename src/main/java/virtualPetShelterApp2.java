
public class virtualPetShelterApp2 {
	public static void main(String[]args) {
		PetShelter myShelter = new PetShelter(); 
		OrganicDog dog1 = new OrganicDog("Dog1","");
		OrganicDog dog2 = new OrganicDog("Dog2","");
		OrganicDog dog3 = new OrganicDog("Dog3","");
		RoboDog	rDog1 = new RoboDog("Dog4", "");
		RoboDog	rDog2 = new RoboDog("Dog5", "");
		RoboDog	rDog3 = new RoboDog("Dog6", "");
		
		//test area
		myShelter.addPet(dog1);
		myShelter.addPet(dog2);
		myShelter.addPet(dog3);
		myShelter.addPet(rDog1);
		myShelter.addPet(rDog2);
		myShelter.addPet(rDog3);
		
		
//		myShelter.feedAll();
//		myShelter.feedAll(); 
		//test area
		
		System.out.println("Welcome to Doug's adoption shelter! \nHere is the status of the pets:");
		System.out.println("Status of cages: ");
		
		System.out.println("---Organic Dogs---");
		myShelter.listOrganics(); 
		System.out.println("---Robotic Dogs---");
		myShelter.listRobotics(); 
		

		
		
		


	}

}
