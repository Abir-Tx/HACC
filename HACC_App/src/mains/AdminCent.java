package mains;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import utils.Functioner;

public class AdminCent extends Functioner {
    JLabel headerLabel = new JLabel();
    JPanel headerpanel = new JPanel(null);
    JPanel contPanelWindow = new JPanel(null);
    JButton delLog = new JButton();
    JButton startLogging = new JButton();

    AdminCent() {
        Home.frame.add(contPanelWindow);
        Home.frame.add(headerpanel);

        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(java.awt.Color.LIGHT_GRAY);
        contPanelWindow.setBounds(0, 200, 1100, 400);

        headerCreator("Admin Control Center", headerLabel, headerpanel);
        headerpanel.add(headerLabel);

        // Button configs
        delLog.setText("Delete Log");
        delLog.setBounds(400, 30, 300, 50);

        startLogging.setText("Start Logging");
        startLogging.setBounds(400, 100, 300, 50);

        //Button Actions
        delLogAction();
        startLoggingAction();

        // Adding to main content panel
        contPanelWindow.add(delLog);
        contPanelWindow.add(startLogging);
    }

    private void delLogAction() {
        delLog.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int userChoice;
                userChoice = JOptionPane.showConfirmDialog(Home.frame, "Are you sure you want to delete the previous log?");
                if(userChoice == 0){
                    if(file.exists() == true){
                        file.delete();
                        JOptionPane.showMessageDialog(Home.frame, "The log file has been deleted successfully");
                    }
                    else{
                        JOptionPane.showMessageDialog(Home.frame, "File Not Found", "Log File Missing", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else if(userChoice == 2){
                    System.out.println("#//#region  Admin Log Deletion:Cancelled  #//#endregion");
                }
                else{
                    JOptionPane.showMessageDialog(Home.frame, "The log file was not deleted");
                }
            }
            
        });
    }

    private void startLoggingAction(){
        startLogging.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int userChoice = JOptionPane.showConfirmDialog(Home.frame, "Are you sure?");
                if (userChoice == 0 ) {
                    try {
                        logCreator();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                else if(userChoice == 2){
                    System.out.println("Log creation cancelled");
                }
                else {
                    System.out.println("Log creation cancelled");
                    JOptionPane.showMessageDialog(Home.frame, "Logging turned off");
                }
            }

        });
    }
    void logCreator() throws IOException {
        File log = new File("HACC_App/src/Log.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(log));

        writer.write("\t\t\t------LOG SYSTEM OF HACC------");
        writer.newLine();
        writer.newLine();
        writer.write("\t\t\tLogging turned on By Admin on "+date+"\n\n");
        writer.flush();
        writer.close();
    }
}
