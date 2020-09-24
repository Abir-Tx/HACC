package HACC_Console.mains;

import HACC_Console.utils.Colors;
/*TO-DO:  Have to deploy a method which will check each and every password and username matching possibilities and give a option to try again */
import HACC_Console.utils.Designer;

public class Login {
    Login() {
        HACC_Console.utils.Functioner.clearScreen();

        // inputted username and password storing
        String username;
        String password;

        System.out.println(Colors.BG_BrightRed + Colors.ANSI_BLUE + "\n\t\t\t\t\t\t\t------HACC Login System--------"
                + Colors.ANSI_RESET + "\n\n");
        System.out.print(Colors.ANSI_GREEN + Designer.UNDERLINE + "Enter you username: " + Colors.ANSI_RESET);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        username = sc.nextLine();

        System.out.print(Colors.ANSI_GREEN + Designer.UNDERLINE + "\nEnter your password: " + Colors.ANSI_RESET);
        password = sc.nextLine();
        try {
            for (int i = 0; i < Database.registeredUsernames.length; i++) {
                if (Database.registeredUsernames[i].equals(username)
                        && Database.registeredPasswords[i].equals(password)) {
                    System.out.println("\n\n");
                    new ContCent();
                    break;
                } else if (!Database.registeredUsernames[i].equals(username)
                        && !Database.registeredPasswords[i].equals(password)) {
                    System.out.print("Invalid Authentication");
                } else {
                    System.out.print("\nWrong username or Password. Try Again --- \n\n");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.err.println("Something went wrong !");
                    }
                    new Login();
                }
            }

        } catch (NullPointerException n) {
            System.out.println("\n\n\t\t\t\t\t\tNo users registered yet");
            System.out.print("\nGoing back to the main screen");
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            new Home().homeOperations();
        }

        sc.close();
    }
}
