import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ContCent {
    JFrame frame = new JFrame();
    JPanel contPanelWindow = new JPanel(new FlowLayout());
    JButton light = new JButton();

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

        //Adding components
        contPanelWindow.add(light);
    }

    public static void main(String[] args) {
        new ContCent();
    }
}