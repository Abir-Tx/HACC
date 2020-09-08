package devices;

import utils.*;
import mains.Home;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
    JTextArea isOnisOff = new JTextArea();

    public Light() {
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Light", header, headerPanel); // designing the header and creating the header
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting
                                                                  // the back button
        designer.onOffButtonCreator(on, off);
        
        utils.backAction(back);
        utils.onOffAction(on, off,isOnisOff);

        bodyPanel.add(back);
        bodyPanel.add(on);
        bodyPanel.add(off);
        bodyPanel.add(isOnisOff);
        headerPanel.add(header);
        Home.frame.repaint();
    }
}
