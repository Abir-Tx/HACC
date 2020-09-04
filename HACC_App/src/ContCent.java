import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ContCent {
    JFrame frame = new JFrame();
    JPanel contPanelWindow = new JPanel(null);
    JPanel headerpanel = new JPanel(null);
    JButton light = new JButton();
    JButton fan = new JButton();
    JButton tv = new JButton();
    JButton speaker = new JButton();


    ContCent(){
        Home.frame.add(contPanelWindow);
        Home.frame.add(headerpanel);

        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(Color.LIGHT_GRAY);
        contPanelWindow.setBounds(0, 200, 1100, 400);

        //header label 
        headerLabel.setText("HAC Center");
        headerLabel.setForeground(Color.white); 
        headerLabel.setFont(new Font("Times New Roman",Font.BOLD,50));
        headerLabel.setBounds(300, 55, 500, 100);

        //header panel
        headerpanel.setVisible(true);
        headerpanel.setBackground(Color.BLACK);
        headerpanel.setBounds(0,0,1100,200);

        //Button configs
        light.setText("Light");
        light.setBounds(10, 10, 100, 30);

        fan.setText("Fan");
        fan.setBounds(120, 10, 100, 30);

        tv.setText("Smart TV");
        tv.setBounds(230, 10, 100, 30);

        speaker.setText("Smart Speaker");
        speaker.setBounds(340, 10, 100, 30);


        //Adding components
        contPanelWindow.add(light);
        contPanelWindow.add(fan);
        contPanelWindow.add(tv);
        contPanelWindow.add(speaker);
    }
}