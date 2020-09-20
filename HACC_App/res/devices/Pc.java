package res.devices;

import lib.DesignUtils;
import res.mains.Home;
import res.utils.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

public class Pc extends Functioner {
    DesignUtils designer = new DesignUtils();
    Utils utils = new Utils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    JButton on = new JButton();
    JButton off = new JButton();

    public Pc() {
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("PC", header, headerPanel); // designing the header and creating the header
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting
                                                                  // the back button

        designer.onOffButtonCreator(on, off);

        utils.backAction(back);
        utils.onOffAction(on, off);
        onOffWriter(on, off, "PC");

        sleep_Wake();

        bodyPanel.add(back);
        bodyPanel.add(on);
        bodyPanel.add(off);
        headerPanel.add(header);
        Home.frame.repaint();
    }

    private void sleep_Wake() {
        JButton sleep = new JButton("Sleep");
        sleep.setToolTipText("Press to sleep the PC");
        sleep.setBounds(390, 100, 100, 50);
        BtnFontDesigner(sleep);

        bodyPanel.add(sleep);

        sleep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (on.getBackground() == Color.BLUE) {
                    sleep.setBackground(Color.GRAY);
                    // sleep.setForeground(Color.WHITE);
                    try {
                        BufferedWriter logger = new BufferedWriter(new FileWriter(file, true));
                        logger.append("The PC has been put to sleep by User at " + date);
                        logger.newLine();
                        logger.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }

                else {
                    defBtnColor(sleep);
                    JOptionPane.showMessageDialog(Home.frame, "Turn on the PC first to put to Sleep");
                }

            }

        });

        // Wake Button
        JButton wake = new JButton("Wake");
        wake.setToolTipText("Press to wake up the PC from sleep");
        wake.setBounds(610, 100, 100, 50);
        BtnFontDesigner(wake);

        bodyPanel.add(wake);

        wake.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (sleep.getBackground() == Color.GRAY) {
                    wake.setBackground(Color.BLUE);
                    defBtnColor(sleep);
                    JOptionPane.showMessageDialog(Home.frame, "The PC has been woke up");
                    try {
                        BufferedWriter logger = new BufferedWriter(new FileWriter(file, true));
                        logger.append("The PC has been woke up by the User at " + date);
                        logger.newLine();
                        logger.close();
                    } catch (Exception wake) {
                        wake.printStackTrace();
                    }
                    defBtnColor(wake);
                } else {
                    defBtnColor(sleep);
                    JOptionPane.showMessageDialog(Home.frame, "The PC needs to go to sleep first to wake it up");
                }
            }

        });
    }
}
