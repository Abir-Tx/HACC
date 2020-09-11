package utils;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.*;
import javax.swing.JButton;

public class Functioner {
    public void onOffWriter(JButton on, JButton off, String device){
        java.util.Date date = new java.util.Date(); 
        on.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("HACC_App/src/Log.txt");
                try{
                    BufferedWriter logWritter = new BufferedWriter(new FileWriter(file, true));
                    logWritter.append("The "+device+" turned on by User on "+date);
                    logWritter.newLine();
                    logWritter.close();
                }catch(IOException ex){
                    System.out.println("File not found");
                }
            }
            
        });
        off.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent off){
                File file = new File("HACC_App/src/Log.txt");
                try {
                    BufferedWriter logWritter = new BufferedWriter(new FileWriter(file, true));
                    logWritter.append("The "+device+" turned off by User on "+date);
                    logWritter.newLine();
                    logWritter.close();
                } catch (Exception e) {
                    System.out.println("File not found");
                }
            }
        });
    }
}
