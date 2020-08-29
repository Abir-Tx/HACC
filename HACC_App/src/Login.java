import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
        
    }

    void welcomeMsg(){
        JOptionPane.showMessageDialog(loginPanel, "You have successfully logged in", "Login Confirmation", 1);
    }
}