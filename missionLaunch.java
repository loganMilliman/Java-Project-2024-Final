public class missionLaunch {
    private missionInventory inventory;
    private Astronaut[] astronauts;

    public missionLaunch(missionInventory inventory, Astronaut[] astronauts) {
        this.inventory = inventory;
        this.astronauts = astronauts;
    }

    public void initiateLaunch() {
        // Check inventory (rockets, fuel)
        // Check astronaut availability and readiness
        System.out.println("Initiating launch sequence...");

        // Start countdown
        countdown();
    }

    private void countdown() {
        System.out.print("Countdown: ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ignition!");
        launch();
    }

    private void launch() {
        // Perform launch procedures
        // Calculate trajectory, speed, etc.
        // Update inventory (fuel consumption)
        double totalWeight = 0;
        for (Astronaut astronaut : astronauts) {
            totalWeight += astronaut.getWeight();
        }
        
        // Calculate altitude and speed using static methods from missionCalculation
        double altitude = missionCalculation.calculateAltitude(inventory.getRocketFuel());
        double speed = missionCalculation.calculateSpeed(inventory.getRocketFuel());
        
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Speed: " + speed + " meters per second");

        // Example calculation of fuel consumption based on total weight
        int fuelConsumption = (int) (totalWeight * 10); // Adjust as needed
        inventory.consumeFuel(fuelConsumption);
        System.out.println("Rocket launched!");
    }

    // Other methods for managing the launch process, such as aborting, monitoring, etc.