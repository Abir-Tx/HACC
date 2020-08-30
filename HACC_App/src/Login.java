import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    JPanel loginPanel = new JPanel();
    JButton submit = new JButton();
    JLabel label1, label2;
    JTextField field1, field2;

    Login() {
        Home.frame.add(loginPanel);

        loginPanel.setLayout(new FlowLayout());
        loginPanel.setVisible(true);

        // Username:
        label1 = new JLabel("Username");
        field1 = new JTextField(15);

        // Password:
        label2 = new JLabel("Password");
        field2 = new JPasswordField(15);

        // Submit button:
        submit.setText("Submit");

        // Adding components:
        loginPanel.add(label1);
        loginPanel.add(field1);
        loginPanel.add(label2);
        loginPanel.add(field2);
        loginPanel.add(submit);
        submitHover();
        submitAction();
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
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                submit.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                submit.setBackground(Color.WHITE);
            }

        });
    }

    void authenticator() {
        final String username, password;
        username = field1.getText().toString();
        password = field2.getText().toString();

        final ArrayList<String> registeredUsernames= new ArrayList<String>();
        registeredUsernames.add("Abir");
        final ArrayList<String> registeredPasswords = new ArrayList<String>();
        registeredPasswords.add("1234");


        if (username.equals(registeredUsernames.get(0)) && password.equals(registeredPasswords.get(0))) {
            welcomeMsg();
        }
        else
        {
            notAllowedMsg();
        }
    }

    void submitAction() {
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                authenticator();
                Home.frame.getContentPane().removeAll();
                Home.frame.repaint();
                new ContCent();
                Home.frame.validate(); 
            }
            
        });
    }
}