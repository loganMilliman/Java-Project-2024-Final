public class missionCalculation {
    private static final double GRAVITY = 9.81; // m/s^2
    private static final double MAX_ATMOSPHERE_SPEED = 3000; // m/s
    private static final double ATMOSPHERE_END_ALTITUDE = 70000; // meters

    public static void main(String[] args) {
        // Example usage
        int fuelBurned = 10; // Example: 10 pounds of fuel burned
        double altitude = calculateAltitude(fuelBurned);
        double speed = calculateSpeed(fuelBurned);
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Speed: " + speed + " meters per second");
    }

    public static double calculateAltitude(int fuelBurned) {
        // Calculate altitude gained due to burning fuel
        double altitudeGained = 0;
        if (fuelBurned == 0) {
            // No fuel burned, no altitude gain
            altitudeGained = 0;
        } else {
            // Calculate altitude gained based on fuel burned
            altitudeGained = (fuelBurned == 1) ? 30 : (fuelBurned == 2) ? 15 : 60;
        }
        return altitudeGained;
    }

    public static double calculateSpeed(int fuelBurned) {
        // Calculate speed gained due to burning fuel
        double speedGained = 0;
        if (fuelBurned == 0) {
            // No fuel burned, no speed gain
            speedGained = 0;
        } else {
            // Calculate speed gained based on fuel burned
            speedGained = (fuelBurned == 1) ? 30 : (fuelBurned == 2) ? 15 : 60;
        }
        return speedGained;
    }
}
