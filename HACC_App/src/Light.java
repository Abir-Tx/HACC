import javax.swing.JLabel;
import javax.swing.JPanel;

import lib.DesignUtils;
public class Light {
    DesignUtils designer = new DesignUtils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    Light(){
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        designer.headerCreator("Light", header, headerPanel);


        headerPanel.add(header);
        Home.frame.repaint();
    }
}
