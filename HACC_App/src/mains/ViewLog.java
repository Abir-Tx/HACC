package mains;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import utils.Functioner;

public class ViewLog extends Functioner {
    ViewLog(){
        try {
            BufferedReader logReader = new BufferedReader(new FileReader(file));
            String logHolder;
            JFrame                 f= new JFrame("TEST");
                f.setVisible(true);
                f.setSize(new Dimension(500,500));
                // f.setLayout(null);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                JTextArea tf = new JTextArea();
                // tf.setBounds(0,0,500,500);
            while ((logHolder = logReader.readLine()) != null) {
                
                tf.append(logHolder+"\n");
                
            }
            f.add(tf);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
