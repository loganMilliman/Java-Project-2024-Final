import java.util.Scanner;

public class PasswordManager {
    private String Userpassword; private String Username;
    private int input;
    private Scanner kbd;

    //class compiler
    public PasswordManager(Scanner kbd) {
        this.kbd = kbd;
    }
    
    /* 
    * Password needs let you 
    * select options: 
    * login to Program
    * create new a password
    *should get you stuck if you dont put in the right password
    */
    public void singin() {
        System.out.print("\nWelcome to the Rocket Control Station ");
        do {
            System.out.print("\nPlease sign in first\n\n1. Sign in\n2. Create account\n3. Change password\n");
            
            //user options
            input = kbd.nextInt();
            switch(input) {
                
                //signing in portion
                case 1:
                System.out.println("Please enter Username");
                Username = kbd.nextLine(); kbd.nextLine();

                System.out.println("Please enter Password");
                Userpassword = kbd.nextLine(); kbd.nextLine();

                    //wrong and correct password code
                    //I dont like realy how this works, since it esentially does the calculation twice now but whatever :/

                    /* if (!(getuserpasword(Username).equals(Userpassword) || getadminpassword().equals(Userpassword)) ) 
                        System.out.println("Wrong Password or Username");

                        else if (getadminpassword().equals(Userpassword)
                        System.out.println("Welcome admin");

                        else
                        System.out.print("\nWelcome "+Username); */
                break;

                //account creater case
                case 2:

                break;

                //pasword changer case        
                case 3: 

                break;
            }
        }
        while (true);
       //need to work on decryption before this will work
       //while (getuserpasword(Username).equals(Userpassword) || getadminpassword().equals(Userpassword));
    }

    /*
     * used to make a password
     */
    @SuppressWarnings("unused")
    private static void PasswordMaker() {

    }
    /*
     * used to change acount passwords
     */
    @SuppressWarnings("unused")
    private static void PasswordChanger() {

    }
}
