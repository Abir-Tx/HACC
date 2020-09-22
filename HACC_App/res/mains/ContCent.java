package res.mains;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import lib.DesignUtils;
import res.devices.*;

public class ContCent {
    JFrame frame = new JFrame();
    JPanel contPanelWindow = new JPanel(null);
    JPanel headerpanel = new JPanel(null);
    public static JButton light = new JButton();
    JButton fan = new JButton();
    JButton tv = new JButton();
    JButton motor, pc;
    JButton speaker = new JButton();
    JLabel headerLabel = new JLabel();
    DesignUtils headerDesigner = new DesignUtils();
    JButton back = new JButton();
    JRadioButton basic = new JRadioButton();
    JRadioButton advance = new JRadioButton();
    JButton settings = new JButton();

    public ContCent() {
        Home.frame.add(contPanelWindow);
        Home.frame.add(headerpanel);

        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(Color.LIGHT_GRAY);
        contPanelWindow.setBounds(0, 200, 1100, 400);

        // Header creator
        headerDesigner.headerCreator("HAC Center", headerLabel, headerpanel);

        // Button configs
        light.setText("Light");
        light.setBounds(50, 30, 300, 30);

        fan.setText("Fan");
        fan.setBounds(400, 30, 300, 30);

        tv.setText("Smart TV");
        tv.setBounds(750, 30, 300, 30);

        speaker.setText("Smart Speaker");
        speaker.setBounds(50, 100, 300, 30);

        motor = new JButton();
        motor.setText("Motor");
        motor.setBounds(400, 100, 300, 30);

        pc = new JButton();
        pc.setText("PC");
        pc.setBounds(750, 100, 300, 30);

        back.setText("Go Back");
        back.setBounds(50, 300, 120, 50);

        // Radio button configs
        basic.setBounds(880, 300, 80, 50);
        basic.setText("Basic");
        basic.setSelected(true);
        basic.setBackground(Color.LIGHT_GRAY);

        advance.setBounds(960, 300, 100, 50);
        advance.setText("Advanced");
        advance.setSelected(false);
        advance.setBackground(Color.LIGHT_GRAY);

        // Adding components
        contPanelWindow.add(light);
        contPanelWindow.add(fan);
        contPanelWindow.add(tv);
        contPanelWindow.add(speaker);
        contPanelWindow.add(motor);
        contPanelWindow.add(pc);
        contPanelWindow.add(basic);
        contPanelWindow.add(advance);
        contPanelWindow.add(settings);
        contPanelWindow.add(back);

        headerpanel.add(headerLabel);

        // Adding the Action Listener for radio buttons
        advanceAction();
        basicAction();

        light.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new Light();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        fan.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new Fan();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        tv.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new TV();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {

            }

            @Override
            public void mouseExited(MouseEvent arg0) {

            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {

            }

        });

        speaker.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Speaker();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {

            }

            @Override
            public void mouseExited(MouseEvent arg0) {

            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {

            }
        });
        motor.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Motor();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {

            }

            @Override
            public void mouseExited(MouseEvent arg0) {

            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {

            }

        });

        pc.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Pc();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {

            }

            @Override
            public void mouseExited(MouseEvent arg0) {

            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {

            }

        });

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Home.frame.getContentPane().removeAll();
                new Login();
                Home.frame.repaint();
            }

        });

        settings.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Settings();
            }

        });
    }

    private void advanceAction() {
        advance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (advance.isSelected() == true) {
                    settings.setText("Settings");
                    settings.setBounds(50, 170, 300, 30);
                    settings.setVisible(true);

                    basic.setSelected(false);
                } else if (advance.isSelected() == false) {
                    settings.setVisible(false);
                }
            }
        });
    }

    private void basicAction() {
        basic.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (basic.isSelected() == true) {
                    advance.setSelected(false);
                    settings.setVisible(false);
                }
            }

        });
    }

}