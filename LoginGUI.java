import java.util.Scanner;

/**
 * Password should play out like this:
 * logIn > signUp > encription > password storage
 * then logIn > verification
 * forgot password method aswell 
 * */

 //this will be the gui for passwords

public class LoginGUI extends application{    private Scanner kbd;

    //constructor
    public LoginGUI(Scanner kbd) {
        this.kbd = kbd;
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * should hopefully boot GUI and let you login
     * experimeniting with GUI 
     * @return
     */
    public boolean login() {

    }

    /* used to make a password */
    private void createpassword() {

    }

}