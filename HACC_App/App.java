/* ..............##########..............
This is an AIUB java project under MD. Nazmul Hossain. 
Project developed by: Mushfiqur Rahman Abir
Base version: 1.0
..................##########.............
 */

import res.mains.Database;
import res.mains.Home;
//TODO: Update the version number to 2.0 @Abir-Tx

public class App {
    public static void main(String[] args) throws Exception {
        //Codes for console printout
        System.out.println("\t\t\t\t______________HACC APP__________________\n\n");
        System.out.print("Starting the App");
        lib.DesignUtils.consoleAnim(10,".",50);

        //Built in User Registration
        Database.addBuiltInUser("Abir", "1234");

        //Starting the Actual GUI
        new Home();
    }
}