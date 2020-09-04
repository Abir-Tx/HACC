import javax.swing.JLabel;
import javax.swing.JPanel;

import lib.DesignUtils;
public class Fan {
    DesignUtils designer = new DesignUtils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    Fan(){
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        designer.headerCreator("Fan", header, headerPanel);


        headerPanel.add(header);
        Home.frame.repaint();
    }
}
