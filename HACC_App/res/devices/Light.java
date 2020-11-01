package res.devices;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

import lib.DesignUtils;
import res.mains.Home;
import res.utils.*;

public class Light extends Functioner {
    DesignUtils designer = new DesignUtils();
    Utils utils = new Utils();
    JLabel header = new JLabel();
    JPanel headerPanel = new JPanel();
    JButton back = new JButton();
    JPanel bodyPanel = new JPanel();
    JButton on = new JButton();
    JButton off = new JButton();
    JRadioButton brightness_50 = new JRadioButton();
    JRadioButton brightness_100 = new JRadioButton();
    JButton changeColor = new JButton();

    public Light() {
        Home.frame.getContentPane().removeAll();
        Home.frame.add(headerPanel);
        Home.frame.add(bodyPanel);

        designer.headerCreator("Light", header, headerPanel); // designing the header and creating the header
        designer.bodyPanelCreatorWithBackButton(bodyPanel, back); // Creating and designing the body panel and setting
                                                                  // the back button
        designer.onOffButtonCreator(on, off);

        utils.backAction(back);
        utils.onOffAction(on, off);

        onOffWriter(on, off, "Light");

        brightnessConfig();
        changeColorConfig();

        bodyPanel.add(back);
        bodyPanel.add(on);
        bodyPanel.add(off);
        bodyPanel.add(brightness_50);
        bodyPanel.add(brightness_100);
        bodyPanel.add(changeColor);
        headerPanel.add(header);
        Home.frame.repaint();
    }
    private void changeColorConfig(){
        changeColor.setBounds(450, 280, 200, 30);
        changeColor.setText("Change Color");
        BtnFontDesigner(changeColor);

        changeColor.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                new ChnageColor();
            }

        });
    }

    private void brightnessConfig() {
        brightness_50.setBounds(350, 220, 150, 50);
        brightness_50.setText("Brightness 50%");

        brightness_100.setBounds(650, 220, 150, 50);
        brightness_100.setText("Brightness 100%");

        brightness_50.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (brightness_50.isSelected() == true) {
                    brightness_100.setSelected(false);
                    try {
                        BufferedWriter brightnessWriter = new BufferedWriter(new FileWriter(file, true));
                        brightnessWriter.append(" The Light brightness set to 50 percent by User on " + date);
                        brightnessWriter.newLine();
                        brightnessWriter.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }

        });

        brightness_100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (brightness_100.isSelected() == true) {
                    brightness_50.setSelected(false);
                    try {
                        BufferedWriter brightnessWriter = new BufferedWriter(new FileWriter(file, true));
                        brightnessWriter.append(" The Light brightness set to 100 percent by User on " + date);
                        brightnessWriter.newLine();
                        brightnessWriter.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }
}
