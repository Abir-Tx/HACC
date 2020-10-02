package res.devices;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;

import res.mains.Home;

public class ChnageColor {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton bt1, bt2, bt3, bt4;
    public ChnageColor(){
        createFrame();
        createPanel();
    }

    private void createFrame() {
                frame.setSize(new Dimension(400,500));
                frame.setLocationRelativeTo(Home.frame);
                frame.setTitle("Light Colour Change");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setAlwaysOnTop(true);
                frame.setBackground(Color.BLACK);
                frame.setLayout(new BorderLayout());
                frame.setVisible(true);
    }
    private void createPanel(){
        frame.add(panel);

        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));

        bt1 = new JButton("Red Colour");
        bt1.setSize(new Dimension(100,50));
        bt1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        bt2 = new JButton("Yellow Colour");
        bt2.setSize(new Dimension(100,50));
        bt2.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        panel.add(bt1);
        panel.add(bt2);
        panel.repaint();
        panel.setVisible(true);

        frame.repaint();
    }

    public static void main(String[] args) {
        new ChnageColor();
    }
}
