package res.devices;

import lib.DesignUtils;
import res.mains.Home;
import res.utils.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Speaker extends Functioner {
    static int volumeLevel = 0;
    DesignUtils designer = new DesignUtils();
    Utils utils = new Utils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    JButton on = new JButton();
    JButton off = new JButton();

    public Speaker() {
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Smart Spaker", header, headerPanel); // designing the header and creating the header
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting
                                                                  // the back button

        designer.onOffButtonCreator(on, off);

        utils.backAction(back);
        utils.onOffAction(on, off);
        onOffWriter(on, off, "Smart Speaker");

        volumeConfig();

        bodyPanel.add(back);
        bodyPanel.add(on);
        bodyPanel.add(off);
        headerPanel.add(header);
        Home.frame.repaint();
    }

    private void volumeConfig() {
        JButton volumeUp = new JButton("V Up");
        JButton volumeDown = new JButton("V Down");

        volumeUp.setBounds(380, 100, 100, 110);
        volumeUp.setToolTipText("Volume UP Button. Press to increase the volume");

        volumeDown.setBounds(620, 100, 100, 110);
        volumeDown.setToolTipText("Volume Down Button. Press to decrease the volume");

        bodyPanel.add(volumeUp);
        bodyPanel.add(volumeDown);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                BufferedWriter logger;
                try {
                    if (volumeLevel > 100) {
                        JOptionPane info = new JOptionPane("Volume cannot be more than 100");
                        info.setBounds(0, 0, 300, 200);
                        bodyPanel.add(info);
                    } else {
                        volumeLevel += 5;
                        logger = new BufferedWriter(new FileWriter(file, true));
                        logger.append("Speaker Volume increated to " + volumeLevel + " By User at " + date);
                        logger.newLine();
                        logger.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        };
        volumeUp.addActionListener(al);

        volumeDown.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                BufferedWriter logger;
                try {
                    if (volumeLevel < 0) {
                        JOptionPane info = new JOptionPane("Volume cannot be less than 0");
                        info.setBounds(0, 0, 300, 200);
                        bodyPanel.add(info);
                    } else {
                        volumeLevel -= 5;
                        logger = new BufferedWriter(new FileWriter(file, true));
                        logger.append("Speaker Volume decreased to " + volumeLevel + " By User at " + date);
                        logger.newLine();
                        logger.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}
