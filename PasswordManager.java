import java.util.Scanner;

public class PasswordManager {
    private String Userpassword; private String Username;
    private int input; private boolean lock = false;
    private Scanner kbd;
    //private static cryptography encrypter = new cryptography();

    //class compiler
    public PasswordManager(Scanner kbd) {
        this.kbd = kbd;
    }
    
    /* 
    * Password needs let you 
    * select options: 
    * login to Program
    * create new a password
    * I want this to lock the user in if they cant get past
    */
    public void singin() {
        do {
            System.out.print("\nPlease sign in first\n\n1. Sign in\n2. Create account\n3. Change password\n");
            
            //user options
            input = kbd.nextInt();
            kbd.nextLine();
            switch(input) {
                
                case 1:
                System.out.println("Please enter Username");
                Username = kbd.nextLine();

                System.out.println("Please enter Password");
                Userpassword = kbd.nextLine();

                //verifies if password is correct
                lock = encrypter.verify(Userpassword, Username);

                    //wrong and correct password code
                    //I dont like realy how this works, since it esentially does the calculation twice now but whatever :/
                    if (lock) 
                        System.out.print("\nWelcome "+Username); 

                        else
                        
                        System.out.println("Wrong Username or Password");
                break;

                //account creater case
                case 2:
                PasswordMaker(Username, Userpassword);
                break;

                //pasword changer case        
                case 3: 
                PasswordChanger(Username, Userpassword);
                break;
            }
        }
        while (!lock);
    }

    /*
     * used to make a password
     */
    private static void PasswordMaker(String name, String pass) {
        encrypter.addPassword(name, pass);
    }
    /*
     * used to change acount passwords
     */
    private static void PasswordChanger(String name, String pass) {
        encrypter.changePassword(name, pass);
    }
}
