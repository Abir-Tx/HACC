import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
    }

    void welcomeMsg() {
        JOptionPane.showMessageDialog(loginPanel, "You have successfully logged in", "Login Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
    void notAllowedMsg(){
        JOptionPane.showMessageDialog(loginPanel,"Incorrect login or password",
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
        String username, password;
        username = label1.getText();
        password = label2.getText();

        if (username == "Abir" && password =="Abir") {
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
            }
            
        });
    }
}