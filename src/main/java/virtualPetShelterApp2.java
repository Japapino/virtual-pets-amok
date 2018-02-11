import java.util.Scanner;

public class virtualPetShelterApp2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String response = ""; 
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
		System.out.println("---Organic---");
		myShelter.listOrganics(); 
		System.out.println("--------|-------|-------|-------|-------");
		System.out.println("---Robotic---");
		myShelter.listRobotics(); 
		System.out.println();
		System.out.println("Status of cages: ");
		myShelter.checkCages(); 
		
		while(!response.equals("quit")) {
			System.out.println("What would you like to do?");
			System.out.println(
					"1. Feed pets \n2. Water pets \n3. Play with a pet \n4. Adopt a pet \n5. Admit pet \n6. Clean habitats \nSay\"Quit\" to quit.");
			response = input.nextLine();
			
			if (response.equals("1")) {
				myShelter.feedAll(); 
			}
			if (response.equals("2")) {
				myShelter.waterAll();
			}
			
			if (response.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				System.out.println(myShelter.listNames());
				response = input.nextLine();
				if (myShelter.checkForPet(response)) {
					myShelter.playWith(response);
				} else {
					System.out.println("Pet not found");
				}
			}


			
		}
		
	}

}
