package HACC_Console.mains;

public class Database {
    // Stored User Password & username
    static int totalUsersNumber = 0;
    static String[]registeredUsernames = new String [100];
    static String[]registeredPasswords = new String [100];
    

    // Stored Admin Password & username
    static String[]registeredAdminnames = {"Abir"};
    static String[]registeredAdminPasswords = {"1234"};


    //Methods for adding users
    public static void adduser(String name, String password){
        registeredUsernames[totalUsersNumber]= name;
        registeredPasswords[totalUsersNumber]= password;
        totalUsersNumber++;
    }
    //Built in users reg
    public static void addBuiltInUser(String name, String password){
        registeredUsernames[totalUsersNumber]= name;
        registeredPasswords[totalUsersNumber]= password;
        totalUsersNumber++;
    }
}
