package res.mains;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class About {
    //Software Version
    private double version = 1.0;

    public double getVersion() {
        return version;
    }
    public void setVersion(double version) {
        this.version = version;
    }


    JFrame aboutFrame = new JFrame();
    JPanel sidebar = new JPanel();
    JLabel name, title, versionInfo;
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

        sidebar.setLayout(null);
        sidebar.setToolTipText("About the Developer");
        sidebar.setSize(200, 350);
        sidebar.setVisible(true);
        sidebar.setBackground(Color.LIGHT_GRAY);

        title = new JLabel();
        title.setText("HACC");
        title.setBounds(80, 5, 200, 30);
        title.setFont(new Font("Corbel",Font.BOLD,20));
        title.setForeground(Color.RED);
        title.setToolTipText("Home Automation Control Center");

        name = new JLabel();
        name.setText("Mushfiqur Rahman Abir");
        name.setBounds(30, 40, 200, 30);

        versionInfo = new JLabel();
        versionInfo.setText("Current Version: " + version);
        versionInfo.setBounds(5,270, 200, 30);
        versionInfo.setForeground(Color.white);
        versionInfo.setBackground(Color.BLACK);
        versionInfo.setToolTipText("The current version of the software");
        versionInfo.setFont(new Font("Century Gothic",Font.BOLD,10));

        authorDescrip.setText("            A group project by \n            Data Pirates Group\n             AIUB Java Project");
        authorDescrip.setEditable(false);
        authorDescrip.setSize(200, 50);
        authorDescrip.setBounds(10, 140, 200, 50);
        authorDescrip.setBackground(Color.lightGray);

        softDescrip.setText("\tThis is a demo program writtten in pure java."
                + "\nThis program is a demo for a Home automation control center."
                + "\nThe project is under MD. Nazmul Hossain Sir."
                + "\nThe name of the Developer is: Abir. The project is a AIUB"
                + "\nProject.");
        softDescrip.setBounds(205, 50, 390, 200);
        softDescrip.setEditable(false);
        softDescrip.setFont(new Font("Dotum",Font.TRUETYPE_FONT,14));

        sidebar.add(name);
        sidebar.add(title);
        sidebar.add(authorDescrip);
        sidebar.add(versionInfo);

        ok.setText("OK");
        Home.designer.BtnFontDesigner(ok);
        ok.setBounds(270, 275, 280, 30);
        ok.setBorderPainted(true);
        ok.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.RED));
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                aboutFrame.setVisible(false);
            }

        });
        ok.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ok.setBackground(Color.YELLOW);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ok.setBackground(UIManager.getColor("control"));
            }
        });

        aboutFrame.add(sidebar);
        aboutFrame.add(ok);
        aboutFrame.add(softDescrip);

        aboutFrame.setVisible(true);
        aboutFrame.repaint();

    }
}
