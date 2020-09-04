import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import lib.DesignUtils;

public class ContCent {
    JFrame frame = new JFrame();
    JPanel contPanelWindow = new JPanel(null);
    JPanel headerpanel = new JPanel(null);
    JButton light = new JButton();
    JButton fan = new JButton();
    JButton tv = new JButton();
    JButton motor, pc;
    JButton speaker = new JButton();
    JLabel headerLabel = new JLabel();
    DesignUtils headerDesigner = new DesignUtils();

    ContCent(){
        Home.frame.add(contPanelWindow);
        Home.frame.add(headerpanel);

        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(Color.LIGHT_GRAY);
        contPanelWindow.setBounds(0, 200, 1100, 400);

        //Header creator 
        headerDesigner.headerCreator("HAC Center", headerLabel,headerpanel);

        //header panel
        headerpanel.setVisible(true);
        headerpanel.setBackground(Color.BLACK);
        headerpanel.setBounds(0,0,1100,200);

        //Button configs
        light.setText("Light");
        light.setBounds(50, 30, 300, 30);

        fan.setText("Fan");
        fan.setBounds(400, 30, 300, 30);

        tv.setText("Smart TV");
        tv.setBounds(750, 30, 300, 30);

        speaker.setText("Smart Speaker");
        speaker.setBounds(50, 100, 300, 30);

        motor = new JButton();
        motor.setText("Motor");
        motor.setBounds(400, 100, 300,30);

        pc = new JButton();
        pc.setText("PC");
        pc.setBounds(750, 100, 300, 30);


        //Adding components
        contPanelWindow.add(light);
        contPanelWindow.add(fan);
        contPanelWindow.add(tv);
        contPanelWindow.add(speaker);
        contPanelWindow.add(motor);
        contPanelWindow.add(pc);

        headerpanel.add(headerLabel);
    }
}