import java.text.DecimalFormat;

public class missionCalculation {
    private static final double GRAVITY = 9.81; // m/s^2
    private static final double MAX_ATMOSPHERE_SPEED = 3000; // m/s
    private static final double ATMOSPHERE_END_ALTITUDE = 70000; // meters

    private double altitude;
    private double speed;
    private double fuel;

    public missionCalculation() {
        this.altitude = 0;
        this.speed = 0;
        this.fuel = 100; // Initial fuel in pounds
    }

    /**
     * Simulates burning fuel for a given duration.
     * @param duration The duration in seconds for which fuel is burned.
     */
    public void burnFuel(int duration) {
        // Calculate speed gained based on fuel burned
        double speedGained = 0;
        if (duration == 1) {
            speedGained = 30 * fuel;
        } else if (duration == 2) {
            speedGained = 15 * fuel;
        } else if (duration == 3) { // Two pounds of fuel burned in one second
            speedGained = 60 * fuel;
        }

        speed += speedGained;
        altitude += speed;
        fuel -= duration;
    }

    /**
     * Simulates entering freefall.
     */
    public void enterFreefall() {
        while (altitude > 0) {
            speed -= GRAVITY;
            altitude += speed;
            if (altitude > ATMOSPHERE_END_ALTITUDE && speed > MAX_ATMOSPHERE_SPEED) {
                // Rocket burns up if it exceeds maximum atmosphere speed
                System.out.println("Rocket burned up in the atmosphere!");
                break;
            }
        }
    }

    /**
     * Deploys parachutes once altitude falls below 10,000 meters.
     */
    public void deployParachutes() {
        while (altitude > 10000) {
            // Descend until altitude falls below 10,000 meters
            speed -= GRAVITY;
            altitude += speed;
        }
        // Reduce speed to a safe landing speed
        speed = Math.min(speed, 7);
    }

    /**
     * Simulates landing safely and opens the door.
     */
    public void landSafely() {
        System.out.println("Rocket has landed safely!");
        System.out.println("Door is opening...");
        // Astronauts get out
    }

    /**
     * Gets the current altitude of the rocket.
     * @return The altitude in meters.
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * Gets the current speed of the rocket.
     * @return The speed in meters per second.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Gets the remaining fuel of the rocket.
     * @return The remaining fuel in pounds.
     */
    public double getFuel() {
        return fuel;
    }

    public static void main(String[] args) {
        missionCalculation mission = new missionCalculation();
        mission.burnFuel(1); // Example: Burn 1 pound of fuel for 1 second
        System.out.println("Altitude: " + formatNumber(mission.getAltitude()) + " meters");
        System.out.println("Speed: " + formatNumber(mission.getSpeed()) + " meters per second");
        System.out.println("Remaining Fuel: " + formatNumber(mission.getFuel()) + " pounds");
        mission.enterFreefall();
        mission.deployParachutes();
        mission.landSafely();
    }

    // Utility method to format numbers uniformly
    private static String formatNumber(double number) {
        DecimalFormat formatter = new DecimalFormat("#,###.##");
        return formatter.format(number);
    }
}
