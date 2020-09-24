package HACC_Console.mains;

import java.util.InputMismatchException;

import HACC_Console.utils.Colors;
import HACC_Console.utils.Designer;

public class Home {
    int mainAns;

    public Home() {
        HACC_Console.utils.Functioner.clearScreen();

        System.out.println("\n\t\t\t\t\t\t\t------" + Designer.BOLD + Designer.UNDERLINE + "Welcome to HACC Project"
                + Colors.ANSI_RESET + "--------\n\n");
    }

    public void homeOperations() {
        String[] mainOptions = { "Login", "About", "Admin", "Exit" };
        for (int i = 0; i < mainOptions.length; i++) {
            System.out.println(Designer.BOLD + (i + 1) + ". " + mainOptions[i]);
        }
        System.out.print("\t\t\t\t\t\t\t\tGive your choice: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            mainAns = sc.nextInt();
        } catch (InputMismatchException e) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                System.err.println("Error Occured");
            }
        }
        System.out.print("\n" + Colors.ANSI_RESET);

        switch (mainAns) {
            case 1: {
                new Login();
            }
                break;
            case 2: {
                new About();
            }
                break;
            case 4: {
                System.out.print(Colors.ANSI_RED + "Exiting the program");
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        System.err.println("Couldn't exit the program properly");
                    }
                    System.out.print(".");
                }
                System.out.print("\n\n\n" + Colors.ANSI_RESET);
                System.exit(0);
            }
                break;
            case 3:
                new Admin();
                break;
            default:
                // System.err.println("Input is out of range");
                Designer.defThemeText("\t\t\t\t\t\t\t\tInput Out Of Range");
                System.out.println("\nWould you like to try again ?");
                String[] yesN0Container = { "Yes", "No" };
                for (int i = 0; i < yesN0Container.length; i++) {
                    System.out.println((i + 1) + ". " + yesN0Container[i]);
                }
                System.out.print("\n\n\t\t\t\t\t\t\tSelect: ");
                java.util.Scanner sd = new java.util.Scanner(System.in);
                int result = sd.nextInt();
                if (result == 1) {
                    new Home().homeOperations();
                } else {
                    System.out.print(Colors.ANSI_RED + "Exiting the program");
                    for (int i = 0; i < 10; i++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            System.err.println("Couldn't exit the program properly");
                        }
                        System.out.print(".");
                    }
                    System.out.print("\n" + Colors.ANSI_RESET);
                    System.exit(0);
                    sd.close();
                }
        }
        sc.close();
    }
}
