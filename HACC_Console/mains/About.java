package HACC_Console.mains;

import HACC_Console.utils.Colors;
import HACC_Console.utils.Functioner;

public class About {
    String DevName = "Mushfiqur Rahman Abir";
    double version = 1.0;
    String aboutDescription = "This is a demo program writtten in pure java."
            + "\nThis program is a demo for a Home automation control center."
            + "\nThe project is under MD. Nazmul Hossain Sir. This is the console " + "\nVersion of the HACC app"
            + "\n\n" + Colors.ANSI_RED + "The name of the Developer is: " + DevName + "\n" + Colors.ANSI_RED
            + "Version of this program is: " + version + "\nProject Team Name: Data Pirates";

    About() {
        Functioner.clearScreen();
        System.out.println(Colors.BG_BrightRed + Colors.ANSI_BLUE + "\n\t\t\t\t\t\t\t\t------ABOUT HACC--------"
                + Colors.ANSI_RESET + "\n\n" + Colors.ANSI_RESET);
        System.out.println(aboutDescription);
        back();
    }

    private void back() {
        System.out.print("\n" + Colors.ANSI_BLUE + "Press " + Colors.BG_BrightRed + " B " + Colors.ANSI_RESET
                + Colors.ANSI_BLUE + " To Go Back: " + Colors.ANSI_RESET);
        String backVerifier;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        backVerifier = sc.nextLine().toUpperCase();
        if (backVerifier.equals("B")) {
            new Home().homeOperations();
        } else {
            System.out.print(Colors.ANSI_RED + "\n\nExiting the program");
            for (int i = 0; i < 40; i++) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    System.err.println("Couldn't exit the program properly");
                }
                System.out.print(".");
            }
            System.out.print("\n" + Colors.ANSI_RESET);
            System.exit(0);
        }
        sc.close();
    }
}