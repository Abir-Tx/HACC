package HACC_Console.mains;

import java.util.ArrayList;

import HACC_Console.devices.Fan;
import HACC_Console.devices.Light;
import HACC_Console.devices.Motor;
import HACC_Console.devices.PC;
import HACC_Console.devices.Speaker;
import HACC_Console.devices.TV;
import HACC_Console.utils.Colors;
import HACC_Console.utils.Designer;

public class ContCent {
    String choice;
    java.util.Scanner sd = new java.util.Scanner(System.in);

    public ContCent() {
        HACC_Console.utils.Functioner.clearScreen();

        ArrayList<String> devices = new ArrayList<String>();
        devices.add("Light");
        devices.add("Fan");
        devices.add("TV");
        devices.add("Motor");
        devices.add("PC");
        devices.add("Speaker");
        devices.add("BACK");
        devices.add("EXIT");

        System.out.println(Colors.BG_BrightRed + Colors.ANSI_BLUE + Designer.BOLD
                + "\t\t\t\t\t\t\t------HACC Control Center--------" + Colors.ANSI_RESET + "\n\n" + Colors.ANSI_RESET);

        System.out.println("Your options for choosing: " + Colors.ANSI_YELLOW + Colors.BG_BRIGHT_CYAN + devices
                + Colors.ANSI_RESET);
        System.out.print("\nPlease write your choice: ");
        choice = sd.nextLine().toUpperCase();

        switch (choice) {
            case "LIGHT": {
                new Light();
            }
                break;
            case "FAN": {
                new Fan();
            }
                break;
            case "TV":
                new TV();
                break;
            case "MOTOR":
                new Motor();
                break;
            case "PC":
                new PC();
                break;
            case "SPEAKER":
                new Speaker();
                break;
            case "BACK":
                new Home().homeOperations();
                break;
            case "EXIT":
                System.exit(0);
                System.out.println("\n\n");
            default:
                Designer.defThemeText("\n\t\t\t\t\tInput not recognized by the program");
                // Designer.defThemeText("\t\t\t\t\t\t\t\tInput Out Of Range");
                System.out.println("\nWould you like to try again ?");
                String[] yesN0Container = { "Yes", "No" };
                for (int i = 0; i < yesN0Container.length; i++) {
                    System.out.println((i + 1) + ". " + yesN0Container[i]);
                }
                System.out.print("\n\n\t\t\t\t\t\t\tSelect: ");
                java.util.Scanner sd = new java.util.Scanner(System.in);
                int result = sd.nextInt();
                if (result == 1) {
                    new ContCent();
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
                    break;
                }
        }
    }
}
