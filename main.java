import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("\nWelcome to the Rocket Control Station ");

        // Create and run password manager
        PasswordManager password = new PasswordManager(kbd);
        password.signin();

        // Create Rocket instance
        Rocket rocket = new Rocket(1000); // Initial rocket fuel

        // After successful login, display selection screen
        System.out.println("Welcome! You can choose to manage astronaut information or launch.");

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("[1] Manage Astronaut Information");
            System.out.println("[2] Launch");
            System.out.print("Enter your choice: ");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    manageAstronautInformation();
                    break;

                case 2:
                    launchMission(kbd, rocket);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 2);

    }

    public static void manageAstronautInformation() {
        // Implement the functionality to manage astronaut information here
        System.out.println("Managing Astronaut Information...");
    }

    public static void launchMission(Scanner kbd, Rocket rocket) {
        System.out.println("Initiating launch sequence...");
        
        // Check if there's enough fuel to launch
        if (rocket.getRocketFuel() <= 0) {
            System.out.println("Insufficient fuel to launch.");
            return;
        }

        // Check if password manager locked
        if (PasswordManager.isLocked()) {
            System.out.println("Password manager locked. Unable to proceed with launch.");
            return;
        }

        // Create astronauts for the mission
        Astronaut[] astronauts = createAstronauts(kbd);

        // Create mission inventory
        missionInventory inventory = new missionInventory(rocket.getRocketFuel());

        // Create and initiate launch
        missionLaunch launch = new missionLaunch(inventory, astronauts);
        launch.initiateLaunch();
    }

    public static Astronaut[] createAstronauts(Scanner kbd) {
        // Implement the functionality to create astronauts for the mission here
        System.out.println("Creating Astronauts...");
        return new Astronaut[0]; // Placeholder return
    }
}
