import java.util.Scanner;
public class main {

    public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
        //creates and runs passwordmanager
        PasswordManager password = new PasswordManager(kbd);
        password.singin();
        
        //after this should be selection screen 
        //then launch option
    }
}
