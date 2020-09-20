import res.mains.Home;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Starting the App");
        res.utils.Utils.consoleAnim(10,".",80);
        new Home();
        //TODO: Update the version number to 2.0 @Abir-Tx
        //TODO: Add console clear code here @Abir-Tx
    }
}