import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ContCent {
    JFrame frame = new JFrame();
    JPanel contPanelWindow = new JPanel(new FlowLayout());
    JButton light = new JButton();
    JButton fan = new JButton();
    JButton tv = new JButton();
    JButton speaker = new JButton();


    ContCent(){
        frame.setVisible(true);
        // Home.frame.add(contPanelWindow);
        frame.add(contPanelWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);


        light.setText("Light");
        // light.setOpaque(false);
        // light.setFocusPainted(false);
        // light.setBorderPainted(false);
        // light.setContentAreaFilled(false);
        // light.setBorder(BorderFactory.createTitledBorder("Test"));

        fan.setText("Fan");
        tv.setText("Smart TV");
        speaker.setText("Smart Speaker");


        //Adding components
        contPanelWindow.add(light);
        contPanelWindow.add(fan);
        contPanelWindow.add(tv);
        contPanelWindow.add(speaker);
    }

    public static void main(String[] args) {
        new ContCent();
    }
}