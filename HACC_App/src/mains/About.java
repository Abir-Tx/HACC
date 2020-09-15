package mains;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class About {
    JFrame aboutFrame = new JFrame();
    JPanel sidebar = new JPanel();
    JLabel name, title;
    JTextArea authorDescrip = new JTextArea();
    JButton ok = new JButton();
    JTextArea softDescrip = new JTextArea();

    About() {
        aboutFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        aboutFrame.setVisible(true);
        aboutFrame.setAutoRequestFocus(true);
        aboutFrame.setBounds(400, 200, 600, 350);
        aboutFrame.setAlwaysOnTop(true);
        aboutFrame.setLayout(null);
        aboutFrame.setResizable(false);
        aboutFrame.setTitle("About");
        aboutFrame.setLocationRelativeTo(Home.frame);
        aboutFrame.setBackground(Color.WHITE);

        sidebar.setLayout(null);
        sidebar.setToolTipText("About the Developer");
        sidebar.setSize(200, 350);
        sidebar.setVisible(true);
        sidebar.setBackground(Color.LIGHT_GRAY);

        title = new JLabel();
        title.setText("HACC");
        title.setBounds(80, 5, 200, 30);

        name = new JLabel();
        name.setText("Mushfiqur Rahman Abir");
        name.setBounds(30, 40, 200, 30);

        authorDescrip.setText("            Student at AIUB\n                    Java");
        authorDescrip.setEditable(false);
        authorDescrip.setSize(200, 50);
        authorDescrip.setBounds(0, 80, 200, 50);
        authorDescrip.setBackground(Color.lightGray);

        softDescrip.setText("\tThis is a demo program writtten in pure java."
                + "\nThis program is a demo for a Home automation control center."
                + "\nThe project is under MD. Nazmul Hossain Sir.");
        softDescrip.setBounds(205, 50, 390, 200);
        softDescrip.setEditable(false);

        sidebar.add(name);
        sidebar.add(title);
        sidebar.add(authorDescrip);

        ok.setText("OK");
        Home.designer.BtnFontDesigner(ok);
        ok.setBounds(270, 275, 280, 30);
        ok.setBorderPainted(false);
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                aboutFrame.setVisible(false);
            }

        });

        aboutFrame.add(sidebar);
        aboutFrame.add(ok);
        aboutFrame.add(softDescrip);

        aboutFrame.setVisible(true);
        aboutFrame.repaint();

    }
}
