package HACC_Console.mains;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import HACC_Console.utils.Colors;
import HACC_Console.utils.Designer;
import HACC_Console.utils.Functioner;
//TODO: Add the clear console method here in the methods

public class Admin extends Functioner {
    File log = new File("/HACC_Console/Log.txt");
    String username, password;
    String[] adminOptions = { "Add User", "Delete Log", "View Log", "Start Logging", "Control Center", "Back" };

    public Admin() {
        HACC_Console.utils.Functioner.clearScreen();

        System.out.println(Colors.BG_BrightRed + Colors.ANSI_BLUE + "\t\t\t------ADMIN PORTAL--------"
                + Colors.ANSI_RESET + "\n\n" + Colors.ANSI_RESET);

        adminLogin();
    }

    protected void adminLogin() {
        System.out.println(Colors.ANSI_GREEN + Designer.UNDERLINE + "\t\t\t\tUser Name: " + Colors.ANSI_RESET);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        username = sc.nextLine();
        System.out.println(Colors.ANSI_GREEN + Designer.UNDERLINE + "\t\t\t\tPassword: " + Colors.ANSI_RESET);
        password = sc.nextLine();
        System.out.print("\n\n");
        System.out.print("\nChecking the Username & Password  ");
        for (int i = 0; i < 20; i++) {
            System.out.print(BG_YELLOW + "_" + ANSI_RESET);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\n\n");

        for (int i = 0; i < Database.registeredAdminnames.length; i++) {
            if (Database.registeredAdminnames[i].equals(username)
                    && Database.registeredAdminPasswords[i].equals(password)) {
                adminCenter();
            } else {
                System.out.println("Unauthorized Login Attemption! Exiting the program in 3 seconds.\n\n");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        sc.close();
    }

    protected void adminCenter() {
        coloredTitleCreator("HACC Admin Center");
        int choice;
        for (int i = 0; i < adminOptions.length; i++) {
            System.out.println((i + 1) + ". " + adminOptions[i]);
            System.out.println("\n");
        }
        System.out.print(ANSI_YELLOW + "Enter your choice: " + ANSI_RESET);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("\n");

        switch (choice) {
            case 1:
                addUser();
                break;
            case 2:
                deleteLog();
                break;
            case 3:
                viewLog();
                break;
            case 4:
                createLog();
                break;
            case 5:
                new ContCent();
                break;
            case 6:
                new Home().homeOperations();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }

    private void viewLog() {
        try {
            BufferedReader logReader = new BufferedReader(new FileReader(log));
            String logHolder;
            while ((logHolder = logReader.readLine()) != null) {
                System.out.println(logHolder);
            }
            logReader.close();
        } catch (IOException e) {
            System.err.println("ERROR !");
        } finally {
            System.out.print("\n" + Colors.ANSI_BLUE + "Press " + Colors.BG_BrightRed + " B " + Colors.ANSI_RESET
                    + Colors.ANSI_BLUE + " To Go Back & Press " + Colors.BG_BrightRed + " E " + Colors.ANSI_RESET
                    + Colors.ANSI_BLUE + " To Exit the Program");
            String backVerifier;
            java.util.Scanner sc = new java.util.Scanner(System.in);
            backVerifier = sc.nextLine().toUpperCase();
            System.out.println("\n");
            if (backVerifier.equals("B")) {
                System.out.println("\n\n\n");
                adminCenter();
            } else if (backVerifier.equals("E")) {
                System.out.print("Exiting the program");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".\n\n\n");
                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println(Colors.BG_BRIGHT_CYAN + " Unexpected Error. Terminating the program\n\n");
            }
            sc.close();
        }

    }

    protected void addUser() {
        String newUserName, newUserPassword;
        coloredTitleCreator("Adding User Portal");

        System.out.print("Enter the username of the new User: " + ANSI_CYAN);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        newUserName = sc.nextLine();
        System.out.print(ANSI_RESET + "\n");
        /*
         * Database.registeredUsernames[1] = newUserName; System.out.println(newUserName
         * + " has been added to the database");
         */

        System.out.print("Enter the password of the new User: " + ANSI_CYAN);
        newUserPassword = sc.nextLine();
        System.out.print(ANSI_RESET + "\n");

        System.out.print("\n\t\t\t\t" + ANSI_RED + "Adding the new user to the Database");
        for (int i = 0; i < 12; i++) {
            System.out.print(BG_YELLOW + "  " + ANSI_RESET);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
        Database.adduser(newUserName, newUserPassword);
        System.out.println(
                newUserName + " has been added to the Database " + ANSI_YELLOW + "successfully." + ANSI_RESET + "\n");
        /*
         * Database.registeredAdminPasswords[2] = newUserPassword;
         * System.out.println(password + " has been added to the database");
         */

        System.out
                .print(BG_BRIGHT_CYAN + ANSI_YELLOW + "\t\t\t\t\t\tGoing back To Admin Center" + ANSI_RESET + "\n\n\n");
        for (int i = 0; i < 18; i++) {
            System.out.print("\t*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");
        adminCenter();
        sc.close();
    }

    protected void deleteLog() {
        if (log.exists() == false) {
            System.out.println("There is no log file\n\n");
            System.out.print("Resturning back ");
            for (int i = 0; i < 10; i++) {
                System.out.print("+");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            adminCenter(); // Goes back to the admin center
            System.out.println("\n\n");
        } else if (log.exists() == true) {
            try {
                log.delete();
                System.out.println("File log has been deleted");
            } catch (Exception e) {
                System.err.println("ERROR occured while deleting file\n");
            } finally {
                adminCenter();
            }

        }
    }

    protected void createLog() { // TODO: Upgrade this log.txt file to Log.dat file when the project is finished
                                 // & make it OS independent
        System.out.print(BG_BRIGHT_CYAN + ANSI_YELLOW + "\t\t\t\t\t\tCreating the log file" + ANSI_RESET + "\n\n\n");
        for (int i = 0; i < 14; i++) {
            System.out.print("\t__");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (log.exists()) {
            System.out.println("Logging is already on");
            adminCenter();
        } else {
            try {
                BufferedWriter logWriter = new BufferedWriter(new FileWriter(log));
                log.createNewFile();
                logWriter.write("\t\t\t\t\t\t\tHACC Log System");
                logWriter.newLine();
                logWriter.newLine();
                logWriter.flush();
                logWriter.close();
                System.out.println("\n\nLogging has been started successfully\n");
            } catch (IOException e) {
                System.err.println("\n\nERROR! Could not create the file");
            } finally {
                adminCenter();
            }
        }
    }
}
