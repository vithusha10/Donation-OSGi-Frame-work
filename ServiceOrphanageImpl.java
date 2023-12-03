package serviceorphanage;

import java.util.HashMap;
import java.util.Scanner;

public class ServiceOrphanageImpl implements ServiceOrphanage{

	@Override
	public OrphanageDonation donate() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\nWelcome to www.orphanagesupport.org\n");
		System.out.println("Make a direct impact today.\n");


		System.out.println("Currently below orphanages expecting your support!\n");

		String[] organaizations = {"Grace Girls Home", "SOS Childrens Villages", "Mahadeva Children's Home", "Sparkes Homes SriLanka", "Viharamaha Devi Girls Home"};

		for (int i = 0; i < organaizations.length; i++) {
			System.out.println((i+1) + ". Organaization Name : " + organaizations[i]);
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
				System.out.println("Organaization Name : " + organaizations[choice-1]);
				
				String organaizationName = organaizations[choice-1];
				
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
				
				return new OrphanageDonation(organaizationName, name, work, country, amount);
				
			}else {
				System.out.println("Wrong choice! Try again.\n");
			}
		}
		
		
		return null;
	}

}
