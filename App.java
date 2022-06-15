package PhonebookLiz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		PersonList directory = new PersonList();

		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 6) {
			choice = menu();
			try {
			switch (choice) {
			case 1:
				directory.addPerson();
				break;
			case 2:
				directory.getPeople();
				break;
			case 3:
				directory.searchPerson();
				break;
			case 4:
				directory.deletePerson();
				break;
			case 5:
				directory.updatePerson();
				break;
			case 6:
			System.out.println("Thank You, Have a Nice Day!");
			System.exit(0);
			break;
			
			
			default:
				System.out.println(choice + " is not a valid Menu Option! Please Select Another.");
				}
					}catch(InputMismatchException e) {
						System.out.println("Invalid Input, please enter a number");
					}catch(Exception f) {
						System.out.println("Error here: " + f);
					}
			}
	}
			public static int menu() {
			Scanner input = new Scanner(System.in);
			System.out.print("***Welcome to Elizabeth's Phone Book!***\n");
			System.out.print("\nEnter 1 to Add Contact");
			System.out.print("\nEnter 2 to Display All Contacts");
			System.out.print("\nEnter 3 to Search for Contact by Last Name");
			System.out.print("\nEnter 4 to Delete Contact by Phone Number");
			System.out.print("\nEnter 5 to Update Contact by Phone Number");
			System.out.print("\nEnter 6 to Exit\n");
			System.out.print("\nEnter Your Menu Choice: ");
			int choice = input.nextInt();
			System.out.println();
			return choice;
			}
}

