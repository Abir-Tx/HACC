package res.mains;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import res.utils.Functioner;

public class ViewLog extends Functioner {  
    JFrame f = new JFrame();
    JScrollPane logScroll = new JScrollPane();

    ViewLog() {
        f.setTitle("HACC Log");
        f.setSize(new Dimension(800 , 400));
        f.setResizable(true);
        f.setLocationRelativeTo(Home.frame);
        f.setFocusable(true);
        f.setMinimumSize(new Dimension(600, 400));
        f.setFocusableWindowState(true);
        f.setAlwaysOnTop(true);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        ta.setBackground(Color.GRAY);
        ta.setForeground(Color.BLACK);
        ta.setFont(new Font("Times New Roman",Font.BOLD,16));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        logScroll.setViewportView(ta);

        f.add(logScroll);
        f.pack();
        // f.add(ta);

        f.setVisible(true);


        try {
            BufferedReader logReader = new BufferedReader(new FileReader(file));
            String logHolder;
            
                while ((logHolder = logReader.readLine()) != null) {
                    ta.append(logHolder + "\n");
                }
                System.out.println("Printed the log to the new Frame");   //This is for console tracing
                logReader.close();            
        } catch (IOException e1) {
            // e1.printStackTrace();
            System.out.println("ERROR: Logging is not on ! No Log file found");
            f.setVisible(false);
            JOptionPane.showMessageDialog(Home.frame, "Logging is off ! Turn on logging first to view it");
        }
    }
}























//This one also works
/* JFrame                 f= new JFrame("TEST");
                        f.setVisible(true);
                        f.setSize(new Dimension(500,500));
                        // f.setLayout(null);
                        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                        JTextArea tf = new JTextArea();
                        // tf.setBounds(0,0,500,500);
                        
                try {
                    BufferedReader logReader = new BufferedReader(new FileReader(file));
                    String logHolder;
                    StringBuilder sb = new StringBuilder();
                    String line = logReader.readLine();

                    while( line!= null){
                        sb.append(line);
                        line = logReader.readLine();
                    }
                    logHolder = sb.toString();
                    tf.setText(logHolder);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                f.add(tf); */
