package res.mains;

import res.utils.Functioner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminCent extends Functioner {
    JLabel headerLabel = new JLabel();
    JPanel headerpanel = new JPanel(null);
    JPanel contPanelWindow = new JPanel(null);
    JButton delLog = new JButton();
    JButton back = new JButton();
    JButton startLogging = new JButton();
    JLabel logDate = new JLabel();
    JButton goto_HACC = new JButton();
    JButton viewLog = new JButton();
    JButton addUser = new JButton();

    AdminCent() { // Default constructor

        Home.frame.add(headerpanel);

        contPanelWindow.setVisible(true);
        contPanelWindow.setBackground(java.awt.Color.LIGHT_GRAY);
        contPanelWindow.setBounds(0, 200, 1100, 400);

        logDate.setText("Log time: " + date);
        logDate.setBounds(420, 150, 300, 30);
        logDate.setForeground(Color.BLUE);

        headerCreator("Admin Control Center", headerLabel, headerpanel);
        headerpanel.add(headerLabel);
        headerpanel.add(logDate);

        // Button configs
        delLog.setText("Delete Log");
        delLog.setBounds(400, 30, 300, 50);

        startLogging.setText("Start New Logging");
        startLogging.setBounds(400, 100, 300, 50);

        goto_HACC.setText("Go To Control Center");
        goto_HACC.setBounds(400, 170, 300, 50);

        viewLog.setText("View Log");
        viewLog.setBounds(400, 240, 300, 50);

        addUser.setText("Add User");
        addUser.setBounds(400, 310, 300, 50);

        back.setText("Go Back");
        back.setBounds(15, 300, 120, 50);
        BtnFontDesigner(back);

        // Button Actions adding
        delLogAction();
        startLoggingAction();
        backAction();
        goto_HACCAction();
        viewLogAction();
        addUserAction();

        // Adding to main content panel
        contPanelWindow.add(delLog);
        contPanelWindow.add(startLogging);
        contPanelWindow.add(back);
        contPanelWindow.add(goto_HACC);
        contPanelWindow.add(viewLog);
        contPanelWindow.add(addUser);

        JScrollPane pane = new JScrollPane(contPanelWindow, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(0, 200, 1100, 400);
        Home.frame.add(pane);
    }

    private void addUserAction() {
        addUser.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(Home.frame, "Enter the new User name");
                String password = JOptionPane.showInputDialog(Home.frame, "Enter the new User password");

                Database.adduser(name, password);
                System.out.println(name + " has been added to the database");
                JOptionPane.showMessageDialog(Home.frame, name + " has been added to the Database", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void viewLogAction() {
        viewLog.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewLog();
            }
        });
    }

    private void delLogAction() {
        delLog.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int userChoice;
                userChoice = JOptionPane.showConfirmDialog(Home.frame,
                        "Are you sure you want to delete the previous log?");
                if (userChoice == 0) {
                    if (file.exists() == true) {
                        file.delete();
                        JOptionPane.showMessageDialog(Home.frame, "The log file has been deleted successfully");
                        System.out.println("The log file has been deleted");
                    } else {
                        JOptionPane.showMessageDialog(Home.frame, "File Not Found", "Log File Missing",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if (userChoice == 2) {
                    System.out.println("#//#region  Admin Log Deletion:Cancelled  #//#endregion");
                } else {
                    JOptionPane.showMessageDialog(Home.frame, "The log file was not deleted");
                }
            }

        });
    }

    private void startLoggingAction() {
        startLogging.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int userChoice = JOptionPane.showConfirmDialog(Home.frame, "Are you sure?");
                if (userChoice == 0) {
                    try {
                        logCreator();
                        System.out.println("A new log file has been created to the 'HACC' folder");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else if (userChoice == 2) {
                    System.out.println("Log creation cancelled");
                } else {
                    System.out.println("Log creation cancelled");
                    JOptionPane.showMessageDialog(Home.frame, "Logging turned off");
                }
            }

        });
    }

    void logCreator() throws IOException {
        File log = new File("Log.dat");

        if (log.exists() == true) {
            JOptionPane.showMessageDialog(Home.frame, "Logging is alrady on", "Info Message",
                    JOptionPane.ERROR_MESSAGE);
        } else if (log.exists() == false) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(log));
            writer.write("\t\t\t\t\t------LOG SYSTEM OF HACC------");
            writer.newLine();
            writer.newLine();
            writer.write("\t\t\tLogging turned on By Admin on " + date + "\n\n");
            writer.flush();
            writer.close();
        } else {
            System.out.println("\n\nERROR Occured");
        }

    }

    void backAction() {
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Home.frame.getContentPane().removeAll();
                new Admin();
                Home.frame.repaint();
            }

        });
        back.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                back.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setBackground(Color.WHITE);
            }
            
        });
    }

    void goto_HACCAction() {
        goto_HACC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Home.frame.getContentPane().removeAll();
                new ContCent();
                Home.frame.repaint();
            }

        });
    }
}
