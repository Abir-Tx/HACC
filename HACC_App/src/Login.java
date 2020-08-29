import java.awt.*;

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

        //Username:
        label1 = new JLabel("Username");
        field1= new JTextField(15);

        //Password:
        label2 = new JLabel("Password");
        field2 = new JPasswordField(15);

        //Submit button:
        submit.setText("Submit");


        //Adding components: 
        loginPanel.add(label1);
        loginPanel.add(field1);
        loginPanel.add(label2);
        loginPanel.add(field2);
        loginPanel.add(submit);
    }

    void welcomeMsg(){
        JOptionPane.showMessageDialog(loginPanel, "You have successfully logged in", "Login Confirmation", 1);
    }
}