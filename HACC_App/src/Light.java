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
        designer.headerCreator("Light", header, headerPanel);
        
        bodyPanel.setBounds(0, 200, 1100, 400);
        back.setBounds(50, 30, 300, 30);
        back.setText("Go Back");

        bodyPanel.add(back);
        headerPanel.add(header);
        Home.frame.repaint();
    }
}
