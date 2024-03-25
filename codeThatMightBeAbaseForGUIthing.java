import java.util.Scanner;

public class Main {
    static Scanner kbd = new Scanner(System.in);
    static int choice, choicePt2;
    static Austronaut astronaut = new Austronaut(); // Create an instance of the Austronaut class

    public static void main(String[] args) {
        System.out.println("Welcome, you are able to choose what you want to do: edit the info about the astronaut or launch, but please note that it is recommended to give all the information you can before launching.");

        do {
            System.out.println("Menu:");
            System.out.println("[1] Astronaut Info");
            System.out.println("[2] It's time to launch");
            System.out.print("Enter your choice: ");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    editAstronautInfo();
                    break;
                case 2:
                    // Launch logic can be added here
                    System.out.println("Launching...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);
    }

    public static void editAstronautInfo() {
        do {
            System.out.println("Please choose what you would like to edit:");
            System.out.println("[1] Name");
            System.out.println("[2] Date Of Birth");
            System.out.println("[3] ID number");
            System.out.println("[4] Address");
            System.out.println("[5] Email");
            System.out.println("[6] Phone Number");
            System.out.println("[7] Next of Kin");
            System.out.println("[8] Status");
            System.out.println("[9] Salary");
            System.out.println("[10] Weight");
            System.out.println("[11] Exit");
            choicePt2 = kbd.nextInt();

            switch (choicePt2) {
                case 1:
                    System.out.print("Enter the new name: ");
                    kbd.nextLine(); // Consume the newline character left by previous nextInt()
                    String newName = kbd.nextLine();
                    astronaut.setName(newName);
                    System.out.println("Name updated successfully.");
                    break;
                                case 2:
                                        System.out.print("Enter the date of birth: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newbirthday = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setDateOfBirth(newbirthday);
                                        System.out.println("Date of birth updated successfully.");
                                    break;
                                case 3:
                                        System.out.print("Enter the ID number: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newIDnumber = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setIDnumb(newIDnumber);
                                        System.out.println("ID number updated successfully.");
                                    break;
                                case 4:
                                        System.out.print("Enter the Address: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newAddress = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setAddress(newAddress);
                                        System.out.println("Address updated successfully.");
                                    break;
                                case 5:
                                        System.out.print("Enter the Email: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newEmail = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setEmail(newEmail);
                                        System.out.println("Email updated successfully.");
                                    break;
                                case 6:
                                        System.out.print("Enter the Phone number: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newPhoneNumb = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setPhoneNumb(newPhoneNumb);
                                        System.out.println("Phone number updated successfully.");
                                    break;
                                case 7:
                                        System.out.print("Enter the Next of Kin: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newNextOfKin = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setNextOfKin(newNextOfKin);
                                        System.out.println(" Next of Kin updated successfully.");
                                    break;
                                case 8:
                                        System.out.print("Enter the Status: ");
                                        kbd.nextLine(); // Consume the newline character left by previous nextInt()
                                        String newStatus = kbd.nextLine();
    
                                        // Set the new name for the astronaut
                                        astronaut.setStatus(newStatus);
                                        System.out.println(" Status updated successfully.");
                                    break;
                                case 9:
                                        System.out.print("Enter the new salary: ");
                                        double newSalary = kbd.nextDouble();
                                        astronaut.setSalary(newSalary);
                                        System.out.println("Salary updated successfully.");
                                    break;
                                case 10:
                                        System.out.print("Enter the new weight: ");
                                        double newWeight = kbd.nextDouble();
                                        astronaut.setWeight(newWeight);
                                        System.out.println("Weight updated successfully.");
                                    break;
                                case 11:
                    System.out.println("Exiting astronaut information editing menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choicePt2 != 11);
    }
}
