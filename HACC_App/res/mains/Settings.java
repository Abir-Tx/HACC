package res.mains;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Settings extends JFrame {
    JFrame SettingsFrame = new JFrame();
    JPanel headerPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JButton totalUser = new JButton();
    JLabel headerLabel = new JLabel();

    Settings() {
        this.setTitle("Settings");
        this.setVisible(true);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setBounds(400, 200, 600, 350);
        this.setAlwaysOnTop(false);
        this.setLayout(null);

        headerPanel.setBounds(0, 0, 600, 100);
        headerPanel.setVisible(true);
        headerPanel.setBackground(Color.BLACK);
        
        
        // header label
        headerLabel.setText(" HACC Settings");
        headerLabel.setVisible(true);
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
        headerLabel.setBounds(130, 10, 600, 100);

        mainPanel.setBounds(0, 100, 600, 250);
        mainPanel.setVisible(true);
        mainPanel.setBackground(Color.LIGHT_GRAY);

        totalUser.setText("View Log");
        totalUser.setBounds(550, 30, 100, 30);
        totalUserAction();

        mainPanel.add(totalUser);

        add(mainPanel);
        add(headerLabel);
        add(headerPanel);
    }

    protected void totalUserAction() {
        totalUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SettingsFrame, "Total user in the Database: "+Database.totalUsersNumber, "Total HACC User", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new Settings();
    }
}