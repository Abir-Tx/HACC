package mains;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolTip;

public class Login {
    JPanel loginPanel = new JPanel();
    JButton submit = new JButton();
    JLabel label1, label2, label3;
    JTextField field1, field2;

    Login() {
        Home.frame.add(loginPanel);  //Adding the panel to the frame

        loginPanel.setLayout(null);
        loginPanel.setSize(1100, 600);
        loginPanel.setVisible(true);

        // Username:
        label1 = new JLabel("Username");
        field1 = new JTextField(15);
        label1.setBounds(10,180, 200, 40);
        field1.setBounds(10, 220, 250, 30);

        // Password:
        label2 = new JLabel("Password");
        field2 = new JPasswordField(15);
        label2.setBounds(10, 260, 200, 40);
        field2.setBounds(10, 300, 250, 30);


        // Submit button:
        submit.setText("Submit");
        submit.setBounds(10, 350, 130, 40);
        Home.designer.BtnFontDesigner(submit);

        //Header
        label3 = new JLabel("HACC Login");
        label3.setBounds(50,5,250,30);
        label3.setFont(new Font("Times New Roman",Font.BOLD,20));

        // Adding components:
        loginPanel.add(label1);
        loginPanel.add(field1);
        loginPanel.add(label2);
        loginPanel.add(field2);
        loginPanel.add(submit);
        loginPanel.add(label3);
        submitHover();
        // submitAction();
    }

    void welcomeMsg() {
        JOptionPane.showMessageDialog(loginPanel, "You have successfully logged in", "Login Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
    void notAllowedMsg(){
        JOptionPane.showMessageDialog(loginPanel,"Incorrect login or password. Try again",
        "Error",JOptionPane.ERROR_MESSAGE);
    }

    void submitHover() {
        submit.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                authenticator();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                submit.setForeground(Color.RED);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                submit.setForeground(Color.BLACK);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                submit.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Home.designer.defBtnColor(submit);

            }

        });
    }

    void authenticator() {
        final String username, password;
        username = field1.getText().toString();
        password = field2.getText().toString();

        //Stored Password & username
        final ArrayList<String> registeredUsernames= new ArrayList<String>();
        registeredUsernames.add("Abir");
        registeredUsernames.add("Nazmul");
        final ArrayList<String> registeredPasswords = new ArrayList<String>();
        registeredPasswords.add("1234");
        registeredPasswords.add("12345");


        for (int i =0 ; i<registeredUsernames.toArray().length; i++){
            if (username.equals(registeredUsernames.get(i)) && password.equals(registeredPasswords.get(i))) {
                welcomeMsg();
                Home.frame.getContentPane().removeAll();
                Home.frame.repaint();
                new ContCent();    //creating the control center 
                Home.frame.validate();
                break;
            }
            else if (!(username.equals(registeredUsernames.get(i)) && password.equals(registeredPasswords.get(i)))) {
                if (username.equals(registeredUsernames.get(i)) && !password.equals(registeredPasswords.get(i))) {
                    JOptionPane.showMessageDialog(Home.frame, "Wrong Password ! Please recheck your Password");
                }
                else if (!username.equals(registeredUsernames.get(i)) && password.equals(registeredPasswords.get(i))) {
                    JOptionPane.showMessageDialog(Home.frame, "Wrong Username ! Please recheck your Username");
                }
                else if (!username.equals(registeredUsernames.get(i)) && !password.equals(registeredPasswords.get(i))) {
                    // JTextField authenticationResult = new JTextField();
                    // Home.frame.add(authenticationResult);
                    // authenticationResult.setText("Try Again");
                    // authenticationResult.setEditable(false);
                    JToolTip toolTip=new JToolTip();
                    toolTip.setToolTipText("Try again");
                    Home.frame.add(toolTip);
                    toolTip.setVisible(true);
                    toolTip.setSize(300, 150);

                }
            }
            // else{
            //     JOptionPane.showConfirmDialog(Home.frame, "Fatal Error ! Something went wrong", "Unknown Error", JOptionPane.ERROR_MESSAGE);
            // }
        }
        // if (username.equals(registeredUsernames.get(0)) && password.equals(registeredPasswords.get(0))) {
        //     welcomeMsg();
        // }
        // else
        // {
        //     notAllowedMsg();
        // }
    }

}