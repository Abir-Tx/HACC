package lib;

import javax.swing.JButton;
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
}
