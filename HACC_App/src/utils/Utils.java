package utils;

import lib.*;
import mains.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Utils {
    public void backAction(JButton back) {
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Home.frame.getContentPane().removeAll();
                new ContCent();
                Home.frame.repaint();
            } 
        });
    }
    public void onOffAction(JButton on, JButton off, javax.swing.JTextArea isOnisOff){
        DesignUtils designer = new DesignUtils();

        //Label config
        isOnisOff.setBounds(0, 200, 100, 50);
        isOnisOff.setText("N/A");
        isOnisOff.setEditable(false);
        on.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                isOnisOff.setBounds(0,200,100,50);
                designer.defBtnColor(off);
                on.setBackground(java.awt.Color.BLUE);
                isOnisOff.setText("IS On now");
            }
        });

        off.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                designer.defBtnColor(on);
                off.setBackground(java.awt.Color.BLUE);
                isOnisOff.setText("IS OFF NOW");
            }
        });
    }
}
