package mains;


import devices.*;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import lib.DesignUtils;

public class ContCent {
    JFrame frame = new JFrame();
    JPanel contPanelWindow = new JPanel(null);
    JPanel headerpanel = new JPanel(null);
    JButton light = new JButton();
    JButton fan = new JButton();
    JButton tv = new JButton();
    JButton motor, pc;
    JButton speaker = new JButton();
    JLabel headerLabel = new JLabel();
    DesignUtils headerDesigner = new DesignUtils();
    JButton back = new JButton();

    public ContCent(){
        Home.frame.add(contPanelWindow);
        Home.frame.add(headerpanel);

        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(Color.LIGHT_GRAY);
        contPanelWindow.setBounds(0, 200, 1100, 400);

        //Header creator 
        headerDesigner.headerCreator("HAC Center", headerLabel,headerpanel);

        //Button configs
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
        motor.setBounds(400, 100, 300,30);

        pc = new JButton();
        pc.setText("PC");
        pc.setBounds(750, 100, 300, 30);

        back.setText("G Back");
        back.setBounds(50, 300, 120, 50);


        //Adding components
        contPanelWindow.add(light);
        contPanelWindow.add(fan);
        contPanelWindow.add(tv);
        contPanelWindow.add(speaker);
        contPanelWindow.add(motor);
        contPanelWindow.add(pc);
        contPanelWindow.add(back);

        headerpanel.add(headerLabel);


        light.addMouseListener(new MouseListener(){

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
        
        fan.addMouseListener(new MouseListener(){

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
        
        tv.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new TV();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });
        
        speaker.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Speaker();
            }   

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }
        });
        motor.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Motor();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });
        
        pc.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Pc();
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        });

        back.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Home.frame.getContentPane().removeAll();
                new Login();
                Home.frame.repaint();
            }

        });

    }
    
}