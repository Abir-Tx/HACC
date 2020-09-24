package HACC_Console.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import HACC_Console.mains.ContCent;

public class Functioner extends Designer {
    public static final String[] DEVICES = { "Light", "Fan", "TV", "Motor", "PC", "Speaker" };

    public static void clearScreen() {  			//Method for clearing the console screen
		System.out.print("\033[H\033[2J");          //Escape chars for clearing console
		System.out.flush();  
	 }

    public void devicesFunctionCreator(String device) {
        String[] state = { "On", "Off", "Go Back" };
        int commandHolder;
        for (int i = 0; i < state.length; i++) {
            System.out.println((i + 1) + ". " + state[i]);
        }
        System.out.println("\n\nGive your command: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        commandHolder = sc.nextInt();

        switch (commandHolder) {
            case 1:
                OnOffLogWriter("on", device);
                break;
            case 2:
                OnOffLogWriter("off", device);
                break;
            case 3:
                new ContCent();
                break;
            default:
                System.out.println(Colors.BG_BrightRed + "\nInvalid Input" + Colors.ANSI_RESET);
                break;
        }
        // sc.close();                              Throws error NoSuchElementException
    }

    // A method for detecting OS and working for the respective OS
    static String path; // The path holder for different OS

    public void OnOffLogWriter(String state, String device) {
        switch (System.getProperty("os.name")) {
            case "Windows 10":
                path = "HACC_Console/Log.txt";
                break;
            case "Linux":
                path = "////home/abir/Code/GitHub/AIUB-Codes/1st Year/2nd Semester (Java)/Projects/HomeAutomationControlCenter/HACC_Console/Log.txt";
                break;

        }
        File log = new File(path);
        if (log.exists() == false) {
            try {
                log.createNewFile();
            } catch (IOException e) {
                System.err.println("Error while creating file");
            }
        } else {
            java.util.Date date = new java.util.Date();
            System.out.println(
                    Colors.ANSI_PURPLE + "\n\t\tThe " + device + " is turned " + state + " now" + Colors.ANSI_RESET);
            try {
                BufferedWriter logWriter = new BufferedWriter(new FileWriter(log, true));
                logWriter.append(device + " turned " + state + " by user. \tTime Log: " + date);
                logWriter.newLine();
                logWriter.flush();
                logWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void devicesBack() {
        System.out.print("\n" + Colors.ANSI_BLUE + "Press " + Colors.BG_BrightRed + " B " + Colors.ANSI_RESET
                + Colors.ANSI_BLUE + " To Go Back & Press " + Colors.BG_BrightRed + " E " + Colors.ANSI_RESET
                + Colors.ANSI_BLUE + " To Exit the Program");
        String backVerifier;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        backVerifier = sc.nextLine().toUpperCase();
        System.out.println("\n");
        if (backVerifier.equals("B")) {
            System.out.println("\n\n\n");
            new ContCent();
        } else if (backVerifier.equals("E")) {
            System.out.print("Exiting the program");
            for (int i = 0; i < 10; i++) {
                System.out.println(".");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\n\n");
        } else {
            System.out.println(Colors.BG_BRIGHT_CYAN + " Unexpected Error. Terminating the program\n\n");
        }
        sc.close();
    }
}
