import java.util.Scanner;

//JavaFX
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Password should play out like this:
 * logIn > signUp > encription > password storage
 * then logIn > verification
 * forgot password method aswell 
 * */

 //this will be the gui for passwords

public class LoginGUI extends Application{    
    private Scanner kbd;

    //constructor imports scanner from main
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
        return false;
    }

    /* used to make a password */
    private void PasswordMaker() {

    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

}