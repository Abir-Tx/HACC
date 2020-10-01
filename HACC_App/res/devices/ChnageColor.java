package res.devices;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;

import res.mains.Home;

public class ChnageColor {
    public ChnageColor(){
        createFrame();
    }

    private void createFrame() {
        JFrame frame = new JFrame();

                frame.setSize(new Dimension(400,500));
                frame.setLocationRelativeTo(Home.frame);
                frame.setTitle("Light Colour Change");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setAlwaysOnTop(true);
                frame.setBackground(Color.BLACK);
                frame.setLayout(new BorderLayout());
                frame.setVisible(true);
    }
}
