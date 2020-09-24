package HACC_Console.utils;

public class Designer extends Colors{
    public static final String BOLD  = "\u001b[1m";
    public static final String UNDERLINE = "\u001b[4m";
    public static final String REVERSED = "\u001b[7m";

    public void coloredTitleCreator(String title){
        System.out.println(Colors.BG_BRIGHT_CYAN+Colors.ANSI_GREEN+"\t\t\t\t\t\t------"+title+"--------"+Colors.ANSI_RESET+"\n\n"+Colors.ANSI_RESET);
    }
    public static void defThemeText(String text){
        System.out.println(BG_BrightRed+ANSI_BLUE+text+ANSI_RESET);
    }

}
