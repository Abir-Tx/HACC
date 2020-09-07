package utils;

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
}
