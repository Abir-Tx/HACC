package lib;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.*;

public class DesignUtils {
    public void defBtnColor(JButton button) {
        button.setBackground(UIManager.getColor("Default button Color"));
    }

    public void BtnFontDesigner(JButton button) {
        button.setFont(new Font("Copperplate", Font.PLAIN, 20));
        button.setBorderPainted(true);
        button.setContentAreaFilled(true);
        button.setFocusable(false);
    }

    public void headerCreator(String string, JLabel headerLabel, JPanel headerpanel) {
        headerpanel.setVisible(true);
        headerpanel.setBackground(Color.BLACK);
        headerpanel.setBounds(0, 0, 1100, 200);
        // header label
        headerLabel.setText(string);
        headerLabel.setForeground(Color.white);
        headerLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
        headerLabel.setBounds(300, 50, 500, 100);
    }

    public void bodyPanelCreatorWithBackButton(JPanel bodyPanel, JButton back) {
        bodyPanel.setBounds(0, 200, 1100, 400);

        back.setBounds(20, 300, 120, 50);
        back.setText("Go Back");
        BtnFontDesigner(back);
    }

    public void onOffButtonCreator(JButton on, JButton off) {
        on.setBounds(500, 100, 100, 50);
        on.setText("On");
        BtnFontDesigner(on);

        off.setBounds(500, 160, 100, 50);
        off.setText("Off");
        BtnFontDesigner(off);
    }

    public static void consoleAnim(int length, String animChar, int time) {
        for (int i = 0; i < length; i++) {
            System.out.print(animChar);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");
    }
}
