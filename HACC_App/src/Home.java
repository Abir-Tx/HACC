import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends JFrame {
    protected static JFrame frame = new JFrame();
    JButton login = new JButton();
    JButton exit = new JButton();
    
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

        //  Adding the components
        adder();

        // Hover Effect Adder
        loginConfig();
        loginHover();

        // Applying the effects/configs
        exitConfig();
        exitHover();
        

        //Button Functionality
        exitAction(); //Exit button functionality
        loginAction(); //Login button functionality

    }

    void loginConfig() {
        login.setBounds(940,250,150,40);    //Sets the position of the button on the frame
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

    void exitHover() {
        exit.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                exit.setBackground(Color.BLUE);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                exit.setBackground(Color.WHITE);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {

            }

        });
    }

    void exitAction() {     //The exit button actions defined here
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // System.exit(0);         //Both of these code works
                // frame.dispose();
                int userAnswer;
                userAnswer = JOptionPane.showConfirmDialog(frame, "Are you sure ?");
                if (userAnswer == JOptionPane.YES_OPTION){
                    System.exit(0);   //Exits the program
                }
                else if(userAnswer == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(frame, "You opted for using this program more");
                }
                else{
                    //Do nothing :-) 
                }
            }
            
        });
    }

    void loginAction(){
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.getContentPane().removeAll();      //Removes everything from the current window/frame
                // frame.revalidate();
                frame.repaint();                            //Updates the Frame windows live

                //Second Panel 
                new Login();

                //Re adding the new contents to the main frame
                frame.validate(); 
            }
        });
    }
    void adder(){
        frame.add(login);
        frame.add(exit);
    }
}