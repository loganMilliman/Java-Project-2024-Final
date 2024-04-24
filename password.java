import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class password {
    private static final String PASSWORD_FILE_PATH = "password.txt";

    public static void createPassword() {
        try {
            File passwordFile = new File(PASSWORD_FILE_PATH);
            if (!passwordFile.exists() || Files.readAllBytes(Paths.get(PASSWORD_FILE_PATH)).length == 0) {
                System.out.println("No password set. Please create a password.");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your new password: ");
                String newPassword = scanner.nextLine();
                setPassword(newPassword);
            } else {
                System.out.println("Password already set.");
            }
        } catch (IOException e) {
            System.out.println("Error reading password file: " + e.getMessage());
        }
    }

    public static void setPassword(String password) {
        try {
            FileWriter writer = new FileWriter(PASSWORD_FILE_PATH);
            writer.write(password);
            writer.close();
            System.out.println("Password set successfully.");
        } catch (IOException e) {
            System.out.println("Error setting password: " + e.getMessage());
        }
    }

    public static boolean checkPassword(String inputPassword) {
        try {
            File passwordFile = new File(PASSWORD_FILE_PATH);
            if (passwordFile.exists() && passwordFile.length() > 0) {
                String storedPassword = new String(Files.readAllBytes(Paths.get(PASSWORD_FILE_PATH)));
                return storedPassword.equals(inputPassword);
            }
        } catch (IOException e) {
            System.out.println("Error checking password: " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        createPassword(); // Check if password exists, if not prompt to create one
        // Example usage: check if the entered password is correct
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();
        if (checkPassword(inputPassword)) {
            System.out.println("Password correct.");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}
