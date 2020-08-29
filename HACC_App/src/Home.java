import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Home extends JFrame {
    JFrame frame = new JFrame();
    JButton login = new JButton();
    JButton exit = new JButton();

    // FlowLayout fl = new FlowLayout(300, 10, 500);
    public Home() {
        frame.setTitle("Home Automation Control Center");
        frame.setSize(1000, 700);
        frame.setAlwaysOnTop(false);
        frame.setEnabled(true);
        frame.setLocation(150, 100);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(300, 10, 300));

        loginConfig();
        loginHover();
        exitConfig();
        adder();
    }

    void loginConfig() {
        login.setText("Login");
        login.setContentAreaFilled(true);
        login.setEnabled(true);
        login.setFocusPainted(true);
        login.setFocusable(true);
        login.setToolTipText("Press to go to the login windows");
    }

    void exitConfig() {
        exit.setText("Exit");
        exit.setContentAreaFilled(true);
        exit.setEnabled(true);
        exit.setFocusPainted(true);
        exit.setFocusable(true);
        exit.setToolTipText("Press to exit the program");
        // login.setSize(100 , 50);
    }

    void loginHover() {
        login.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                login.setBackground(Color.BLUE);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                login.setBackground(Color.WHITE);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {

            }
            
        });
    }

    void adder(){
        frame.add(login);
        frame.add(exit);
    }
}