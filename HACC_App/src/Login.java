import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    JFrame j = new JFrame();
    JButton b = new JButton("Click Me");
    JButton c = new JButton("Click Me");

    JPanel loginPanel = new JPanel(new FlowLayout());
    JPanel loginPanel2 = new JPanel(new FlowLayout());


    Login() {
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginPanel.add(b);
        loginPanel.setVisible(true);
        j.add(loginPanel);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                j.getContentPane().removeAll();
                loginPanel2.add(c);
                loginPanel2.add(new JLabel("Panel 2"));
                loginPanel2.setVisible(true);
                j.revalidate();
                j.repaint();
            }
            
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}