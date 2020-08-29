import java.awt.GridLayout;   

import javax.swing.JButton;
import javax.swing.JFrame;

public class Home extends JFrame {
    JFrame frame = new JFrame();
    JButton login = new JButton();
    JButton exit = new JButton();

    public Home(){
        frame.setTitle("Home Automation Control Center");
        frame.setSize(1000, 700);
        frame.setAlwaysOnTop(false);
        frame.setEnabled(true);
        frame.setLocation(150, 100);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        loginConfig();
        exitConfig();
        adder();
    }

    void loginConfig(){
        login.setText("Login");
        login.setContentAreaFilled(true);
        login.setEnabled(true);
        login.setFocusPainted(true);
        login.setFocusable(true);
        login.setToolTipText("Press to go to the login windows");
        // login.setSize(50 , 25);
    }

    void exitConfig(){
        exit.setText("Exit");
        exit.setContentAreaFilled(true);
        exit.setEnabled(true);
        exit.setFocusPainted(true);
        exit.setFocusable(true);
        exit.setToolTipText("Press to exit the program");
        // login.setSize(100  , 50);
    }

    void adder(){
        frame.add(login);
        frame.add(exit);
    }
}