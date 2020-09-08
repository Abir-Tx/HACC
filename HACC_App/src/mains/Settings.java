package mains;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Settings extends JFrame {
    JFrame SettingsFrame = new JFrame();
    JPanel headerPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JButton viewLog = new JButton();

    Settings(){
        this.setTitle("Settings");
        this.setVisible(true);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setBounds(400, 200, 600, 350);
        this.setAlwaysOnTop(true);
        this.setLayout(null);

        headerPanel.setBounds(0,0,600,100);
        headerPanel.setVisible(true);
        headerPanel.setBackground(Color.BLACK);

        mainPanel.setBounds(0,100,600,250);
        mainPanel.setVisible(true);
        mainPanel.setBackground(Color.LIGHT_GRAY);

        viewLog.setText("View Log");
        viewLog.setBounds(550, 30, 100, 30);

        mainPanel.add(viewLog);

        add(mainPanel);
        add(headerPanel);
    }
    public static void main(String[] args) {
        new Settings();
    }
}