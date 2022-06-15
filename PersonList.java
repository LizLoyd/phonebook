package PhonebookLiz;


import java.util.Arrays;
import java.util.Scanner;



public class PersonList {
	static Person[] myListOfPeople = { 
			new Person("john", "no middle", "doe", "no email", "no birthday", "6366435698", "114 Market St", "St Louis", "MO", "63403"),
			new Person("john", "e", "doe", "no email", "no birhtday", "8475390126", "324 Market St", "St Charles", "MO", "63303"),
			new Person("john", "michael west", "doe", "no email", "no birthday", "5628592375", "574 Pole ave", "St Peters", "MO", "63333")};
	static Person[] tempStringArray = new Person[myListOfPeople.length + 1];

	public PersonList() {

	}

	public void addPerson() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter New Contacts Infomation as follows \n(if none put: 'none'); "
				+ "\nFirst Name, Middle Name, Last Name, Email, Birthday, Phone Number, Street, City, State, ZipCode:  ");
		String userInput = input.nextLine();
		String[] splitInput = userInput.split(",");
		Address newAddress = new Address(splitInput[6], splitInput[7], splitInput[8], splitInput[9]);
		
		Person newPerson = new Person(splitInput[0], splitInput[1], splitInput[2], splitInput[3], splitInput[4], splitInput[5],
				newAddress.street,newAddress.city,newAddress.state,newAddress.zipCode);
				//new Address(splitInput[6], splitInput[7], splitInput[8], splitInput[9]));
		Person[] temp = new Person[myListOfPeople.length + 1];
		for (int i = 0; i < myListOfPeople.length; i++) {
			tempStringArray[i] = myListOfPeople[i];
		}
		
		tempStringArray[tempStringArray.length - 1] = newPerson;
		myListOfPeople = tempStringArray;
	}
	public String printDirectory() {
		System.out.println(Arrays.toString(myListOfPeople));
		return Arrays.toString(myListOfPeople);
	}
//	public void printAlphabetArray(Person[] list) {
//		String[] alphabet = new String[myListOfPeople.length];
//		// populate temp array
//		for (int i = 0; i < myListOfPeople.length; i++) {
//		alphabet[i] = myListOfPeople[i].getFname();
//		}
//		// sorts them alphabetically
//		Arrays.sort(alphabet);
//		//print each person in the new array
//		for (int i = 0; i < alphabet.length; i++) {
//		for (int j = 0; j < myListOfPeople.length; j++)
//		if(alphabet[i] == myListOfPeople[i].getFname()) {
//		myListOfPeople[j].getFullName);
//}
		

	public void getPeople() {
		System.out.println(Arrays.toString(myListOfPeople));
		
	}
	public void updatePerson() {

//		System.out.println("\nPlease enter the phone number of the record to be updated (eg: (123)456-7890):");
		Scanner In = new Scanner(System.in);
//		String phoneIn = In.nextLine();

		System.out.println("\nPlease choose which field you want to update:");
		System.out.println("1. Update First name:");
		System.out.println("2. Update Middle name:");
		System.out.println("3. Update Last name:");
		System.out.println("4. Update phone number:");
		
		int function2 = In.nextInt();
		
		switch(function2){
		case 1:
			updatefname();
			break;
		case 2:
			updatemname();
			break;
		case 3:
			updatelname();
			break;
		case 4:
			updatePhone();
			break;
		default:
		System.out.println("Invalid function");
		break;
	}
		


		} 
		public void updatefname() {
			System.out.println("\nPlease enter the phone number of the record to be updated (eg: 1234567890):");
			Scanner In = new Scanner(System.in);
			String phoneIn = In.nextLine();

			for (int i = 0;i < myListOfPeople.length; i++) {
				if (myListOfPeople[i].phone == phoneIn) {
					System.out.println("Please enter a new first name: ");
					Scanner input = new Scanner(System.in);
					String newfname = input.nextLine();
					myListOfPeople[i].fname = newfname;
				}
				}
		    }

        public void updatemname() {
        	System.out.println("\nPlease enter the phone number of the record to be updated (eg: 1234567890):");
        	
        	Scanner In = new Scanner(System.in);
			String phoneIn = In.nextLine();
			for (int i = 0;i < myListOfPeople.length; i++) {
				if (myListOfPeople[i].phone == phoneIn) {
					System.out.println("Please enter a new middle name: ");
					Scanner input = new Scanner(System.in);
					String newmname = input.nextLine();
					myListOfPeople[i].mname = newmname;
				}
				}
        	}

        public void updatelname() {
        	System.out.println("\nPlease enter the phone number of the record to be updated (eg: 1234567890):");
        	
        	Scanner In = new Scanner(System.in);
			String phoneIn = In.nextLine();
			for (int i = 0;i < myListOfPeople.length; i++) {
				if (myListOfPeople[i].phone == phoneIn) {
					System.out.println("Please enter a new last name: ");
					Scanner input = new Scanner(System.in);
					String newlname = input.nextLine();
					myListOfPeople[i].lname = newlname;

				}
        	}
        }

		public void updatePhone() {
			System.out.println("\nPlease enter the phone number of the record to be updated (eg: 1234567890):");
			
			Scanner In = new Scanner(System.in);
			String phoneIn = In.nextLine();
			for (int i = 0;i < myListOfPeople.length; i++) {
				if (myListOfPeople[i].phone == phoneIn) {
					System.out.println("Please enter a new phone number: ");
					Scanner input = new Scanner(System.in);
					String newPhone = input.nextLine();
					myListOfPeople[i].phone = newPhone;
				}
			}
		}
	
		    
		

	public void searchPerson() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the Last Name to search: ");
		String userSearchTerm = in.nextLine();
		String errorMessage = "Sorry, I did not find that last name";
		boolean error = false;
		for (int i = 0; i < myListOfPeople.length; i++) {
			if (myListOfPeople[i].lname.equals(userSearchTerm)) {
				System.out.println(myListOfPeople[i]);
			}
			else if(!myListOfPeople[i].lname.equals(userSearchTerm)){
				error = true;
			}
		}
		if(error == true) {
			System.out.println(errorMessage);
		}
	}

	public void deletePerson() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the Phone Number to Remove Contact: ");
		String userSearchTerm = in.nextLine();
		int size = myListOfPeople.length;
		for (int i = 0; i < myListOfPeople.length; i++) {
			if (myListOfPeople[i].phone.equals(userSearchTerm)) {
				myListOfPeople[i] = null;

				System.out.println(Arrays.toString(myListOfPeople));
				size--;
			}
		}
		Person[] tempArray = new Person[size];
		for (int i = 0; i < tempArray.length; i++) {
			if (myListOfPeople[i] != null) {
				tempArray[i] = myListOfPeople[i];
			} else {
				tempArray[i] = myListOfPeople[i + 1];
			}
		}
		myListOfPeople = tempArray;
		System.out.println(Arrays.toString(myListOfPeople));
	}

	public String toString() {
		return Arrays.toString(myListOfPeople);
	}
}

