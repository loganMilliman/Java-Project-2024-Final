import java.util.ArrayList;
import java.util.Scanner;

public class codeThatIsForMain
{
  static Scanner kbd = new Scanner (System.in);
  static ArrayList < Astronaut > astronauts = new ArrayList <> ();

  public static void main (String args[])
  {
	//should run signin class at this point

	  
	//after this should be selection screen 
	  System.out.println
	  ("Welcome! You can choose to manage astronaut information or launch.");
	int choice;

	do
	  {
		System.out.println ("Menu:");
		System.out.println ("[1] Add Astronaut");
		System.out.println ("[2] Edit Astronaut");
		System.out.println ("[3] Delete Astronaut");
		System.out.println ("[4] Launch");
		System.out.print ("Enter your choice: ");
		choice = kbd.nextInt ();

		switch (choice)
		  {
		  case 1:
			    createAstronaut ();
			break;

		  case 2:
			    editAstronaut ();
			break;

		  case 3:
			    deleteAstronaut ();
			break;

		//launch stuff
		  case 4:
			    System.out.println ("Launching...");
			break;

		  default:
			System.out.println ("Invalid choice. Please try again.");
		  }

	  }
	while (choice != 4);

  }
  
  public static void createAstronaut ()
  {
	System.out.println ("Creating a new astronaut:");
	System.out.print ("Enter the name: ");
	kbd.nextLine ();			// Consume newline
	String name = kbd.nextLine ();
	System.out.print ("Enter the date of birth: ");
	String dateOfBirth = kbd.nextLine ();
	System.out.print ("Enter the ID number: ");
	String IDnumb = kbd.nextLine ();
	System.out.print ("Enter the address: ");
	String address = kbd.nextLine ();
	System.out.print ("Enter the email: ");
	String email = kbd.nextLine ();
	System.out.print ("Enter the phone number: ");
	String phoneNumb = kbd.nextLine ();
	System.out.print ("Enter the next of kin: ");
	String nextOfKin = kbd.nextLine ();
	System.out.print ("Enter the status: ");
	String status = kbd.nextLine ();
	System.out.print ("Enter the salary: ");
	double salary = kbd.nextDouble ();
	System.out.print ("Enter the weight: ");
	double weight = kbd.nextDouble ();

	astronauts.add(new Astronaut (name, dateOfBirth, IDnumb, address, email, phoneNumb, nextOfKin, status, salary, weight));
	System.out.println ("Astronaut created successfully.");

  }

  public static void editAstronaut ()
  {

	if (astronauts.isEmpty ())
	  {
		System.out.println ("No astronauts to edit.");
		return;
	  }

	System.out.println ("Select an astronaut to edit:");
	listAstronauts ();

	System.out.print ("Enter the index of the astronaut to edit: ");
	int index = kbd.nextInt ();
	
	if (index >= 0 && index < astronauts.size ())
	  {
		Astronaut astronaut = astronauts.get (index);
		System.out.println ("Editing astronaut: " + astronaut.getName ());
		System.out.println ("Choose what you would like to edit:");
		System.out.println ("[1] Name");
		System.out.println ("[2] Date of Birth");
		System.out.println ("[3] ID number");
		System.out.println ("[4] Address");
		System.out.println ("[5] Email");
		System.out.println ("[6] Phone Number");
		System.out.println ("[7] Next of Kin");
		System.out.println ("[8] Status");
		System.out.println ("[9] Salary");
		System.out.println ("[10] Weight");
		int choice = kbd.nextInt ();
		kbd.nextLine ();		// Consume newline after nextInt()
		
		switch (choice)
		  {

		  case 1:
			System.out.print ("Enter the new name: ");
			String newName = kbd.nextLine ();
			astronaut.setName (newName);
			System.out.println ("Name updated successfully.");
			break;
		  
		  case 2:
			System.out.print ("Enter the new date of birth: ");
			String newDateOfBirth = kbd.nextLine ();
			astronaut.setDateOfBirth (newDateOfBirth);
			System.out.println ("Date of birth updated successfully.");
			break;

		  case 3:
			System.out.print ("Enter the new ID number: ");
			String newIDnumb = kbd.nextLine ();
			astronaut.setIDnumb (newIDnumb);
			System.out.println ("ID number updated successfully.");
			break;

		  case 4:
			System.out.print ("Enter the Address: ");
			kbd.nextLine ();	// Consume the newline character left by previous nextInt()
			String newAddress = kbd.nextLine ();
			// Set the new name for the astronaut
			astronaut.setAddress (newAddress);
			System.out.println ("Address updated successfully.");
			break;

		  case 5:
			System.out.print ("Enter the Email: ");
			kbd.nextLine ();	// Consume the newline character left by previous nextInt()
			String newEmail = kbd.nextLine ();
			// Set the new name for the astronaut
			astronaut.setEmail (newEmail);
			System.out.println ("Email updated successfully.");
			break;

		  case 6:
			System.out.print ("Enter the Phone number: ");
			kbd.nextLine ();	// Consume the newline character left by previous nextInt()
			String newPhoneNumb = kbd.nextLine ();
			// Set the new name for the astronaut
			astronaut.setPhoneNumb (newPhoneNumb);
			System.out.println ("Phone number updated successfully.");
			break;

		  case 7:

			System.out.print ("Enter the Next of Kin: ");

			kbd.nextLine ();	// Consume the newline character left by previous nextInt()
			String newNextOfKin = kbd.nextLine ();
			// Set the new name for the astronaut
			astronaut.setNextOfKin (newNextOfKin);
			System.out.println (" Next of Kin updated successfully.");
			break;

		  case 8:
			System.out.print ("Enter the Status: ");
			kbd.nextLine ();	// Consume the newline character left by previous nextInt()
			String newStatus = kbd.nextLine ();
			// Set the new name for the astronaut
			astronaut.setStatus (newStatus);
			System.out.println (" Status updated successfully.");
			break;

		  case 9:
			System.out.print ("Enter the new salary: ");
			double newSalary = kbd.nextDouble ();
			astronaut.setSalary (newSalary);
			System.out.println ("Salary updated successfully.");
			break;

		  case 10:
			System.out.print ("Enter the new weight: ");
			double newWeight = kbd.nextDouble ();
			astronaut.setWeight (newWeight);
			System.out.println ("Weight updated successfully.");
            break;
            
		  default:
			System.out.println ("Invalid choice.");
		  }
	  }
	else
	  {
		System.out.println ("Invalid index.");
	  }
  }


  public static void deleteAstronaut ()
  {
	if (astronauts.isEmpty ())
	  {
		System.out.println ("No astronauts to delete.");
		return;
	  }

	System.out.println ("Select an astronaut to delete:");
	listAstronauts ();
	System.out.print ("Enter the index of the astronaut to delete: ");

	int index = kbd.nextInt ();
	if (index >= 0 && index < astronauts.size ())
	  {
		astronauts.remove (index);
		System.out.println ("Astronaut deleted successfully.");
	  }
	else
	  {
		System.out.println ("Invalid index.");
	  }

  }


  public static void listAstronauts ()
  {
	for (int i = 0; i < astronauts.size (); i++)
	  {
		System.out.println (i + ": " + astronauts.get (i).getName ());
	  }
  }
}
