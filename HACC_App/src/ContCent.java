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
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(150, 50, 1100, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Home.frame.add(contPanelWindow);
        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(Color.BLACK);
        contPanelWindow.setBounds(0, 0, 1100, 600);

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

        f.add(contPanelWindow);
    }

    public static void main(String[] args) {
        new ContCent();
    }
}