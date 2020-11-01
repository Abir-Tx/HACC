package res.devices;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

import lib.DesignUtils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import net.java.balloontip.*;
import res.mains.Home;

public class ChnageColor extends DesignUtils {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton bt1, bt2, bt3, bt4, bt5, bt6;
    ButtonGroup buttons = new ButtonGroup();  //From timmolderez
    public ChnageColor(){
        createFrame();
        createPanel();
        buttonFunctioner();
    }

    static boolean isButtonSelected = false;
    private void buttonFunctioner() {
        bt1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                bt1.setBackground(Color.RED);
                BalloonTip  BalloonTip = new BalloonTip(bt1, "Colour changed to Red");
            }

        });
        bt2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                bt2.setBackground(Color.YELLOW);
            }
            BalloonTip  BalloonTip = new BalloonTip(bt1, "Colour changed to Yellow");
        });

        bt3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                bt3.setBackground(Color.BLACK);
                bt3.setForeground(Color.WHITE);
            }
            BalloonTip  BalloonTip = new BalloonTip(bt1, "Colour changed to Black");

        });

        bt4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                bt4.setBackground(Color.WHITE);
                bt4.setForeground(Color.BLACK);
            }
            BalloonTip  BalloonTip = new BalloonTip(bt1, "Colour changed to White");

        });

        bt5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                bt5.setBackground(Color.BLACK);
                bt5.setForeground(Color.WHITE);
            }

        });

    }

    private void createFrame() {
                frame.setSize(new Dimension(400,500));
                frame.setLocationRelativeTo(Home.frame);
                frame.setTitle("Light Colour Change");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setAlwaysOnTop(true);
                frame.setBackground(Color.BLACK);
                frame.setLayout(new GridLayout(3,1));
                frame.setMinimumSize(new Dimension(300, 200));
                frame.setVisible(true);
    }
    private void createPanel(){
        frame.add(panel);
        Dimension dimension = new Dimension(100,50);

        // panel.setBackground(Color.BLACK);
        // panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel.setLayout(new GridLayout(3,1));

        bt1 = new JButton("Red Colour");
        bt1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        bt1.setSize(dimension);

        bt2 = new JButton("Yellow Colour");
        bt2.setSize(new Dimension(100,50));
        bt2.setBorder(BorderFactory.createLineBorder(Color.PINK));
        bt2.setSize(dimension);

        bt3 = new JButton();
        bt3.setText("Black Colour");
        bt3.setBorder(BorderFactory.createLineBorder(Color.yellow));
        bt3.setSize(dimension);

        bt4 = new JButton();
        bt4.setText("White Colour");
        bt4.setBorder(BorderFactory.createLineBorder(Color.magenta));
        bt4.setSize(dimension);

        bt5 = new JButton();
        bt5.setText("Test2 Button");
        bt5.setBorder(BorderFactory.createLineBorder(Color.green));
        bt5.setSize(dimension);
        bt5.setVisible(false);

        bt6 = new JButton();
        bt6.setText("Test2 Button");
        bt6.setBorder(BorderFactory.createLineBorder(Color.green));
        bt6.setSize(dimension);
        bt5.setVisible(false);
        bt6.setVisible(false);


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
        

        buttons.add(bt1);
        buttons.add(bt2);
        buttons.add(bt3);
        buttons.add(bt4);
        buttons.add(bt5);
        buttons.add(bt6);

        panel.repaint();
        panel.setVisible(true);

        frame.revalidate();
        frame.repaint();
    }

    /* public static void main(String[] args) {
        new ChnageColor();
    } */
}
