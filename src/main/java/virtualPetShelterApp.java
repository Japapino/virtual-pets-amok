import java.util.Scanner;

public class virtualPetShelterApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response = "";
		PetShelter myShelter = new PetShelter();
		OrganicCat pet1 = new OrganicCat("Socks", "Cat");
		OrganicDog pet2 = new OrganicDog("Crazy", "Dog");
		RoboDog pet3 = new RoboDog("Cloud", "Robo Dog", 10, 5, 2);
		RoboCat pet4 = new RoboCat("Potato", "Robo Cat");
		myShelter.addPet(pet1);
		myShelter.addPet(pet2);
		myShelter.addPet(pet3);

		System.out.println("Welcome to Doug's adoption shelter! \nHere is the status of the pets:");
//		myShelter.listStatsAll();
		System.out.println("Status of cages: ");
		myShelter.checkCages(); 

		while (!response.equals("quit")) {
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

			if (response.equals("4")) {
				System.out.println("Oh boy! Which would you like?");
				myShelter.listNames();
				response = input.nextLine();
				myShelter.adopt(response);
				System.out.println("Thank you for adopting: " + response + ", we hope enjoy your new friend.");
			}

//			if (response.equals("5")) {
//				System.out.println("We need some info before we can admit them please answer some questions.");
//				System.out.println("What is their name?");
//				String name = input.nextLine();
//				System.out.println("How would you describe them.");
//				String description = input.nextLine();
//				System.out.println("Do you have more detail information about this pet?(y/n)");
//				response = input.nextLine();
//				if (response.equals("y")) {
//					System.out.println("On a scale of 1-10, how hungry do they seem?");
//					int hunger = input.nextInt();
//					System.out.println("on a scale of 1-10, how thirsty do they seem?");
//					int thirst = input.nextInt();
//					System.out.println("On a scale of 1-10 how healthy do they seem?");
//					int health = input.nextInt();
//
//					VirtualPet temp = new VirtualPet(name, description, hunger, thirst, health);
//					myShelter.addPet(temp);
//					input.nextLine();
//				} else {
//					VirtualPet temp = new VirtualPet(name, description);
//					myShelter.addPet(temp);
//				}
//
//			}

			if (response.equals("6")) {
				myShelter.cleanHabitats();
			}

			if (response.equals("7")) {
				System.out.println("Which pet would you like to give a treat to?");
				myShelter.giveTreatTo(response);
				System.out.println("You gave " + response + " a hotdog.");

			}

			myShelter.tickIncreaseAll();
			myShelter.listStatsAll();
			if (!myShelter.cleanliness().isEmpty()) {
				System.out.println("The following habitats need cleaning: " + myShelter.cleanliness());
			}

		}
		System.out.println("Thanks for visiting!");
		input.close();
		System.exit(0);

	}

}
