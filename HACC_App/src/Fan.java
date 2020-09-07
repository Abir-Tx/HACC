import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import lib.DesignUtils;
public class Fan {
    DesignUtils designer = new DesignUtils();
    Utils utils = new Utils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    
    Fan(){
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Fan", header, headerPanel);
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting the back button

        utils.backAction(back);

        bodyPanel.add(back);
        headerPanel.add(header);
        Home.frame.repaint();
    }
}
