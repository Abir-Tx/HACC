package HACC_Console;

import java.io.IOException;
import HACC_Console.mains.Database;
import HACC_Console.mains.Home;
import HACC_Console.utils.Colors;
import HACC_Console.utils.Designer;
import HACC_Console.utils.Functioner;

class Start {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Loading screen (From Internet mainly):
		loadingScreen();
		Database.addBuiltInUser("Abir","1111");
		Functioner.clearScreen();
		// Main
		new Home().homeOperations();
	}

	private static void loadingScreen() throws IOException, InterruptedException {
		System.out.println(Designer.BOLD+"\n\nNote: This program best works in UNIX Shells"+Colors.ANSI_RESET);
		String anim= "|/-\\";
		System.out.print("Loading the "+Colors.BG_WHITE+Colors.ANSI_BLACK+"HACC"+Colors.ANSI_RESET+" Project:  \n");
        for (int x =0 ; x < 101 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x+ " % Loeaded";
            System.out.write(data.getBytes());
			Thread.sleep(20);
		}
	}
}