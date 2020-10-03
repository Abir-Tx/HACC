package res.devices;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;

import lib.DesignUtils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;

import res.mains.Home;

public class ChnageColor extends DesignUtils {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton bt1, bt2, bt3, bt4, bt5, bt6;
    public ChnageColor(){
        createFrame();
        createPanel();
        buttonFunctioner();
    }

    private void createFrame() {
                frame.setSize(new Dimension(400,500));
                frame.setLocationRelativeTo(Home.frame);
                frame.setTitle("Light Colour Change");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setAlwaysOnTop(true);
                frame.setBackground(Color.BLACK);
                frame.setLayout(new GridLayout(3,1));
                frame.setVisible(true);
    }
    private void createPanel(){
        frame.add(panel);
        Dimension dimension = new Dimension(100,50);

        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel.setLayout(new GridLayout(3,1));

        bt1 = new JButton("Red Colour");
        bt1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        bt1.setSize(dimension);

        bt2 = new JButton("Yellow Colour");
        bt2.setSize(new Dimension(100,50));
        bt2.setBorder(BorderFactory.createLineBorder(Color.PINK));
        bt2.setSize(dimension);

        bt3 = new JButton();
        bt3.setText("Black Button");
        bt3.setBorder(BorderFactory.createLineBorder(Color.yellow));
        bt3.setSize(dimension);

        bt4 = new JButton();
        bt4.setText("Test Button");
        bt4.setBorder(BorderFactory.createLineBorder(Color.magenta));
        bt4.setSize(dimension);

        bt5 = new JButton();
        bt5.setText("Test2 Button");
        bt5.setBorder(BorderFactory.createLineBorder(Color.green));
        bt5.setSize(dimension);

        bt6 = new JButton();
        bt6.setText("Test2 Button");
        bt6.setBorder(BorderFactory.createLineBorder(Color.green));
        bt6.setSize(dimension);

        BtnFontDesigner(bt1);
        BtnFontDesigner(bt2);
        BtnFontDesigner(bt3);
        BtnFontDesigner(bt4);
        BtnFontDesigner(bt5);
        BtnFontDesigner(bt6);

        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        panel.add(bt5);
        panel.add(bt6);
        

        panel.repaint();
        panel.setVisible(true);

        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        new ChnageColor();
    }
}
