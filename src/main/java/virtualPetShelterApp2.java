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
		System.out.println("Poop count in cages: ");
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
			
			//adopt
			if(response.equals("4")) {
				
			}
			
			//add pet
			if(response.equals("5")) {
				
			}
			
			if(response.equals("6")) {
				System.out.println("Clean dog cages? Litterbox? Or a robotic companions?(cages/litterbox/robot)");
				response=input.nextLine(); 
				
				if(response.equals("cages"))
				myShelter.cleanHabitats();
				
				if(response.equals("litterbox"))
//					myShelter.cleanLitterBox(); 
					System.out.println("TESTING");
				
				if(response.equals("robot")) {
					myShelter.cleanAllRobots(response); 
					System.out.println("All robotic friends have had their oil changed and rust removed!");
				}
				
			}
			//give treat
			if(response.equals("7")) {
				System.out.println("Which pet would you like to give a treat to?"); 
				myShelter.listOrganics(); 
				response = input.nextLine(); 
				myShelter.giveTreatTo(response); 
				
			}
			
			myShelter.tickIncreaseAll(); 
			
			System.out.println("---Organic---");
			myShelter.listOrganics(); 
			System.out.println("--------|-------|-------|-------|-------");
			System.out.println("---Robotic---");
			myShelter.listRobotics(); 
			System.out.println();
			System.out.println("Poop count in cages: ");
			myShelter.checkCages(); 
			System.out.println("Status of litterbox: ");
			System.out.println("ERR");
			
		}
		
		System.out.println("Thanks for visiting!");
		input.close(); 
		System.exit(0);
	}

}
