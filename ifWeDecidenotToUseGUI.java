
System.out.println("Welcome, you are able to chose what you want to do edit the info about the astronaut or launch ,but ");
System.out.println("please notr that it is recimendeed to give all the information you can beffore launching");
// Use a do-while loop to display the options menu as follows until the user selects 3:
           do{
            // face of it and the potions
            System.out.println("Menu:");
            System.out.println("[1] Austronaut Info");
            System.out.println("[2] Its time to launch");
            // Enter your choice:
            System.out.print("Enter your choice: ");
            // Get the user's choice as an integer.
            choice = kbd.nextInt();
            // Based on the user's input, do the following:
            switch(choice){
                case 1:
                // go to another switch statement that gives us the ability to edit th astronuts information
                do{
                System.out.println("Please chose what you would like to edit.");
                      System.out.println("[1]");
                      System.out.println("[2]");
                      System.out.println("[3]");
                      System.out.println("[4]");
                      System.out.println("[5]");
                      System.out.println("[6]");
                      System.out.println("[7]");
                      System.out.println("[8]");
                      System.out.println("[9]");
                      System.out.println("[10]");
                choicePt2 = kbd.nextInt();
                switch(choicePt2){
                  case 1:
                }
                  while(choicePt2 != )
            break;
                
                case 2:
                // who ever is doing the launch stuff add on to stuff here
                break;
                default:
                // Display "Invalid choice. Please try again."
                System.out.println("Invalid choice. Please try again.");
                }
           }while(choice != 2);