import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import lib.DesignUtils;
public class Light {
    DesignUtils designer = new DesignUtils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    Light(){
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Light", header, headerPanel);   //designing the header and creating the header
        
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); //Creating and designing the body panel and setting the back button

        bodyPanel.add(back);
        headerPanel.add(header);
        Home.frame.repaint();
    }
}
