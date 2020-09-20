package res.utils;

import lib.*;
import res.mains.*;

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

    public void onOffAction(JButton on, JButton off) {
        DesignUtils designer = new DesignUtils();

        on.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                designer.defBtnColor(off);
                on.setBackground(java.awt.Color.BLUE);
            }
        });

        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                designer.defBtnColor(on);
                off.setBackground(java.awt.Color.BLUE);
            }
        });
    }

    
}
