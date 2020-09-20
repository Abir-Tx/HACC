package res.devices;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import lib.DesignUtils;
import res.mains.Home;
import res.utils.*;

public class Fan extends Functioner {
    DesignUtils designer = new DesignUtils();
    Utils utils = new Utils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    JButton on = new JButton();
    JButton off = new JButton();

    public Fan() {
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Fan", header, headerPanel);
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting
                                                                  // the back button
        designer.onOffButtonCreator(on, off);

        utils.backAction(back);
        utils.onOffAction(on, off);

        onOffWriter(on, off, "Fan");

        bodyPanel.add(back);
        bodyPanel.add(on);
        bodyPanel.add(off);
        headerPanel.add(header);
        Home.frame.repaint();
    }
}
