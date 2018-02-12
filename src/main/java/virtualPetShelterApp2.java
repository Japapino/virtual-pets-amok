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
		OrganicCat cat3 = new OrganicCat("Cat3",""); 

		
		//test area
		myShelter.addPet(dog1);
		myShelter.addPet(dog2);
		myShelter.addPet(dog3);
		myShelter.addPet(rDog1);
		myShelter.addPet(rDog2);
		myShelter.addPet(rDog3);
		myShelter.addPet(cat1);
		myShelter.addPet(cat2);
		myShelter.addPet(cat3);
		
		
		
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
		System.out.println("Status of litterbox: ");
		System.out.println(myShelter.litterBoxCheck());
		
		while(!response.equals("quit")) {
			System.out.println("What would you like to do?");
			System.out.println(
					"1. Feed pets \n2. Water pets \n3. Play with a pet \n4. Adopt a pet \n5. Admit pet \n6. Clean something \n7. Give Treat \n8. Take a dog for a walk \nSay\"Quit\" to quit.");
			response = input.nextLine();
			
			if (response.equals("1")) {
				myShelter.feedAll(); 
				System.out.println("You filled all the pets food bowls.");
				input.nextLine(); 
			}
			if (response.equals("2")) {
				myShelter.waterAll();
				System.out.println("You refilled all the pets water bowls");
				input.nextLine(); 
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
				input.nextLine(); 
			}
			
			//adopt
			if(response.equals("4")) {
				System.out.println("Oh boy! Which pet would you like to adpot?"); 
				response = input.nextLine();
				myShelter.adopt(response); 
				System.out.println("Thank you for adopting "+response+" we hope you enjoy each other's company!");
				input.nextLine(); 
			}
			
			//add pet
			if(response.equals("5")) {
				
			}
			
			//cleaning
			if(response.equals("6")) {
				System.out.println("Clean dog cages? Litterbox? Or robotic companions?(cages/litterbox/robots)");
				response=input.nextLine(); 
				
				if(response.equals("cages"))
				myShelter.cleanHabitats();
				
				if(response.equals("litterbox"))
					myShelter.cleanLitterBox(); 
					System.out.println("Litter box clean!");
				
				if(response.equals("robots")) {
					myShelter.cleanAllRobots(response); 
					System.out.println("All robotic friends have had their oil changed and rust removed!");
				}
				input.nextLine(); 
				
			}
			//Give Treat
			if(response.equals("7")) {
				System.out.println("Which pet would you like to give a treat to?"); 
				myShelter.listOrganics(); 
				response = input.nextLine(); 
				myShelter.giveTreatTo(response); 
				System.out.println(response+" happily ate the treat!");
				input.nextLine(); 
				
			}
			//take a walk
			if(response.equals("8")) {
				System.out.println("Which dog would you like to walk?");
				myShelter.listDogs(); 
				response = input.nextLine(); 
				myShelter.takeForAWalk(response); 
				System.out.println(response+" really enjoyed the walk!");
				input.nextLine(); 
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
			System.out.println(myShelter.litterBoxCheck());
			
		}
		
		System.out.println("Thanks for visiting!");
		input.close(); 
		System.exit(0);
	}

}
