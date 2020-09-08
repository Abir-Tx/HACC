package devices;

import utils.*;
import mains.Home;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

import lib.DesignUtils;

public class Light {
    DesignUtils designer = new DesignUtils();
    Utils utils = new Utils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    JButton on = new JButton();
    JButton off = new JButton();

    public Light() {
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Light", header, headerPanel); // designing the header and creating the header
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting
                                                                  // the back button
        designer.onOffButtonCreator(on, off);

        utils.backAction(back);
        utils.onOffAction(on, off);

        on.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("HACC_App/src/Log.txt");
                try{
                    BufferedWriter logWritter = new BufferedWriter(new FileWriter(file, true));
                    logWritter.append("The light turned on by User");
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
                    logWritter.append("The light turned of by User");
                    logWritter.newLine();
                    logWritter.close();
                } catch (Exception e) {
                    System.out.println("File not found");
                }
            }
        });

        bodyPanel.add(back);
        bodyPanel.add(on);
        bodyPanel.add(off);
        headerPanel.add(header);
        Home.frame.repaint();
    }
}
