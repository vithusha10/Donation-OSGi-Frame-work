package serviceketto;

import java.util.Scanner;

public class ServiceKettoImpl implements ServiceKetto {

	@Override
	public KettoDonation donate() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n\nWelcome to Ketto!\n");

		System.out.println("Ketto is the India's best medical crowdfunding platform");
		System.out.println("With your support,");
		System.out.println("Countless people will receive health care and a happy life.");
		System.out.println("Donate Today!.\n");

		System.out.println("Currently below donees expecting your support!\n");

		String[] donnes = { "Tina Walter", "Megan Shaw", "Kelly Long", "Terry White", "Randy Morrison"};

		float[] expectedAmounts = { 25000, 50000, 40000, 30000, 75000};

		for (int i = 0; i < donnes.length; i++) {
			System.out.println((i+1) + ". Name : " + donnes[i]);
			System.out.println("Expected Amount : " + String.format("%.02f", expectedAmounts[i]) + "\n");
		}
		
		
		int choice = 0;
		
		while(choice!=-1) {
			System.out.println("Choose a number to donate.");
			System.out.println("Or -1 to quit");
			System.out.print("Choice : ");
			choice = sc.nextInt();
			if(choice==-1) {
				System.out.println("Quit");
				return null;
			}else if(choice>=1 && choice <=10) {
				System.out.println("\nYou have chosen\n");
				System.out.println("Name : " + donnes[choice-1]);
				System.out.println("Expected Amount : " + String.format("%.2f", expectedAmounts[choice-1]) + "\n");
				
				String donee = donnes[choice-1];
				
				System.out.print("How much you wish to donate ? ");
				Double amount = sc.nextDouble();
				
				//To obtain new line by of pressing enter in above line
				//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
				sc.nextLine();
				
				System.out.println("\nKindly provide us your details.\n");
				
				System.out.print("Your name ? ");
				String name = sc.nextLine();
				
				System.out.print("Where are you working ? ");
				String work = sc.nextLine();
				
				System.out.print("What is your country ? ");
				String country = sc.nextLine();
				
				return new KettoDonation(donee, name, work, country, amount);
				
			}else {
				System.out.println("Wrong choice! Try again.\n");
			}
		}
		
		
		return null;
	}

}
