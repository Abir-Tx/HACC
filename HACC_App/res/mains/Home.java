package res.mains;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;

import lib.DesignUtils; // User Defined Package

public class Home extends JFrame {
    public static JFrame frame = new JFrame();
    JButton login = new JButton();
    JButton exit = new JButton();
    JButton about = new JButton();
    JButton admin = new JButton();

    public static DesignUtils designer = new DesignUtils(); // Static object which will be used in other classes too

    // FlowLayout fl = new FlowLayout(300, 10, 500);
    public Home() {
        frame.setTitle("Home Automation Control Center");
        frame.setSize(1100, 600);
        frame.setAlwaysOnTop(false);
        frame.setEnabled(true);
        frame.setLocation(150, 50);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        // Adding the components
        adder();

        // Hover Effect Adder
        loginConfig();
        loginHover();

        // Applying the effects/configs
        exitConfig();
        exitHover();

        // About Button
        aboutConfig();
        aboutHover();

        //Admin Button
        adminConfig();
        adminHover();

        // Button Functionality
        exitAction(); // Exit button functionality
        loginAction(); // Login button functionality
    }

    void loginConfig() {
        login.setBounds(940, 220, 150, 40); // Sets the position of the button on the frame
        login.setText("Login");
        login.setContentAreaFilled(true);
        login.setEnabled(true);
        login.setFocusPainted(true);
        login.setFocusable(true);
        login.setToolTipText("Press to go to the login windows");

        // Button design
        designer.BtnFontDesigner(login);

    }

    void exitConfig() {
        exit.setBounds(940, 270, 150, 40); // Sets the position of the button on the frame
        exit.setText("Exit");
        exit.setContentAreaFilled(true);
        exit.setEnabled(true);
        exit.setFocusPainted(true);
        exit.setFocusable(true);
        exit.setToolTipText("Press to exit the program");
        // login.setSize(100 , 50);

        // Button design
        designer.BtnFontDesigner(exit);

    }

    void aboutConfig() {
        about.setBounds(940, 320, 150, 40);
        about.setText("About");
        about.setText("About");
        about.setContentAreaFilled(true);
        about.setEnabled(true);
        about.setFocusPainted(true);
        about.setFocusable(true);
        about.setToolTipText("Press to know about the software");

        designer.BtnFontDesigner(about);

    }

    void adminConfig(){
        admin.setBounds(940, 170, 150, 40);
        admin.setText("Admin");
        admin.setContentAreaFilled(true);
        admin.setEnabled(true);
        admin.setFocusPainted(true);
        admin.setFocusable(true);
        admin.setToolTipText("Press to go to the admin panel");

        //Button Design
        designer.BtnFontDesigner(admin);
    }

    void loginHover() {
        login.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                login.setBackground(Color.LIGHT_GRAY);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // login.setBackground(Color.WHITE);
                // login.setBackground(UIManager.getColor("Default button Color"));
                designer.defBtnColor(login);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                exit.setForeground(Color.BLUE);
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                exit.setForeground(Color.BLACK);
            }

        });
    }

    void exitHover() {
        exit.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                exit.setBackground(Color.LIGHT_GRAY);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // exit.setBackground(Color.WHITE);
                designer.defBtnColor(exit);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                exit.setForeground(Color.BLUE);
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                exit.setForeground(Color.BLACK);

            }

        });
    }

    void aboutHover() {
        about.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new About();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                about.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                designer.defBtnColor(about);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                about.setForeground(Color.BLUE);
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                about.setForeground(Color.BLACK);
            }

            @Override
            public void mouseDragged(MouseEvent arg0) {

            }

            @Override
            public void mouseMoved(MouseEvent arg0) {

            }

        });
    }

    void adminHover(){
        admin.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Home.frame.getContentPane().removeAll();
                new Admin();
                Home.frame.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                admin.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                designer.defBtnColor(admin);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                admin.setForeground(Color.BLUE);
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                admin.setForeground(Color.BLACK);
            }
        });
    }

    void exitAction() { // The exit button actions defined here
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // System.exit(0); //Both of these code works
                // frame.dispose();
                int userAnswer;
                userAnswer = JOptionPane.showConfirmDialog(frame, "Are you sure ?");
                if (userAnswer == JOptionPane.YES_OPTION) {
                    System.out.println("Exiting the program......\nThanks for using the program\nFrom: Mushfiqur Rahman Abir");
                    System.exit(0); // Exits the program
                } else if (userAnswer == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(frame, "You opted for using this program more",
                            "Returning To Program....", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Do nothing :-)
                }
            }

        });
    }

    void loginAction() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Removes everything from the current window/frame
                // frame.revalidate();
                frame.repaint(); // Updates the Frame windows live
                
                // Second Panel
                new Login();

                // Re adding the new contents to the main frame
                frame.validate();
            }
        });
    }

    void adder() {
        frame.add(login);
        frame.add(exit);
        frame.add(about);
        frame.add(admin);
    }
}