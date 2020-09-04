package lib;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.*;

public class DesignUtils {
    public void defBtnColor(JButton button){
        button.setBackground(UIManager.getColor("Default button Color"));
    }
    public void BtnFontDesigner(JButton button){
        button.setFont(new Font("Copperplate",Font.PLAIN,20));
        button.setBorderPainted(true);
        button.setContentAreaFilled(true);
        button.setFocusable(false);
    }
    public void headerCreator(String string, JLabel headerLabel){
        //header label 
        headerLabel.setText(string);
        headerLabel.setForeground(Color.white); 
        headerLabel.setFont(new Font("Times New Roman",Font.BOLD,50));
        headerLabel.setBounds(300, 50, 500, 100);
    }
}
